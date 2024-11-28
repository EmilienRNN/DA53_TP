package fr.utbm.info.da53.lw2.syntaxtree.statement;

import fr.utbm.info.da53.lw2.context.ExecutionContext;
import fr.utbm.info.da53.lw2.error.InterpreterErrorType;
import fr.utbm.info.da53.lw2.error.InterpreterException;
import fr.utbm.info.da53.lw2.syntaxtree.AbstractStatementTreeNode;
import fr.utbm.info.da53.lw2.syntaxtree.AbstractValueTreeNode;
import fr.utbm.info.da53.lw2.type.Value;
import fr.utbm.info.da53.lw2.type.VariableType;

/**
 * This class represents a GOSUB node in the syntax tree
 *
 * @author erenon;
 * @version $Name$ $Revision$ $Date$
 */
public class GosubStatementTreeNode extends AbstractStatementTreeNode {

    /**
     * Constructor
     *
     * @param value is the value to evaluate
     */
    public GosubStatementTreeNode(AbstractValueTreeNode value) {
        super();
        if (value != null) {
            setChildren(value);
        }
    }

    /**
     * Verify if the value is a correct type for the GOSUB statement
     *
     * @param context is the execution context
     * @return the execution context
     */
    @Override
    public ExecutionContext run(ExecutionContext context) throws InterpreterException {
        AbstractValueTreeNode value = (AbstractValueTreeNode) getChildAt(0);
        if (value != null) {
            Value line = value.evaluate(context);
            if(line.isSet() && line.getType() == VariableType.NUMBER){
                context = new ExecutionContext(context);
                context.setNextLine((Integer) line.getValue());
            }else {
                fail(context, InterpreterErrorType.EXPECTING_NUMBER, value.toString());
            }
        }else {
            fail(context, InterpreterErrorType.UNSET_VALUE);
        }
        return context;
    }

    @Override
    public String toString() {
        return "GOSUB " + getChildAt(0).toString();
    }
}
