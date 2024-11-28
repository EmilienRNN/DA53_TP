package fr.utbm.info.da53.lw2.syntaxtree.statement;
import fr.utbm.info.da53.lw2.context.ExecutionContext;
import fr.utbm.info.da53.lw2.error.InterpreterErrorType;
import fr.utbm.info.da53.lw2.error.InterpreterException;
import fr.utbm.info.da53.lw2.syntaxtree.AbstractStatementTreeNode;
import fr.utbm.info.da53.lw2.syntaxtree.AbstractValueTreeNode;
import fr.utbm.info.da53.lw2.type.Value;


/**
 * This class represents a PRINT node in the syntax tree
 *
 * @author erenon;
 * @version $Name$ $Revision$ $Date$
 */
public class PrintStatementTreeNode extends AbstractStatementTreeNode {


    /**
     * Constructor
     *
     * @param value is the value to evaluate
     */
    public PrintStatementTreeNode(AbstractValueTreeNode value) {
        super();
        if (value != null){
            setChildren(value);
        }
    }

    /**
     * Verify if the value is a correct type for the PRINT statement
     *
     * @param context is the execution context
     * @return the execution context
     */
    @Override
    public ExecutionContext run(ExecutionContext context) throws InterpreterException {
        AbstractValueTreeNode value = (AbstractValueTreeNode)getChildAt(0);
        if(value != null){
            Value v = value.evaluate(context);
            if(v.isSet()){
                context.getInterpreter().getStandardOutput().println(v.getValue().toString());
            }else {
                warn(context, InterpreterErrorType.UNSET_VALUE);
                context.getInterpreter().getStandardOutput().println();
            }
        }else {
            context.getInterpreter().getStandardOutput().println();
        }

        return context;
    }

    @Override
    public String toString() {
        return "PRINT " + getChildAt(0).toString();
    }
}
