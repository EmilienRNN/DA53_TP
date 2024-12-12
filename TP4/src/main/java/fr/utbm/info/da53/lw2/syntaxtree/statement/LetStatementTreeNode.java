package fr.utbm.info.da53.lw2.syntaxtree.statement;

import fr.utbm.info.da53.lw2.context.ExecutionContext;
import fr.utbm.info.da53.lw2.error.InterpreterErrorType;
import fr.utbm.info.da53.lw2.error.InterpreterException;
import fr.utbm.info.da53.lw2.symbol.SymbolTableEntry;
import fr.utbm.info.da53.lw2.syntaxtree.AbstractStatementTreeNode;
import fr.utbm.info.da53.lw2.syntaxtree.AbstractValueTreeNode;
import fr.utbm.info.da53.lw2.type.Value;

/**
 * This class represents a LET node in the syntax tree
 *
 * @author erenon;
 * @version $Name$ $Revision$ $Date$
 */
public class LetStatementTreeNode extends AbstractStatementTreeNode {

    private final String identifier;

    /**
     * Constructor
     *
     * @param variable is the variable to set
     * @param value is the value to evaluate
     */
    public LetStatementTreeNode(String variable, AbstractValueTreeNode value) {
        super();
        if (value != null) {
            setChildren(value);
        }
        this.identifier = variable;
    }

    /**
     * Verify if the value is a correct type for the LET statement. Verify if the variable is defined.
     *
     * @param context is the execution context
     * @return the execution context
     */
    @Override
    public ExecutionContext run(ExecutionContext context) throws InterpreterException {
        AbstractValueTreeNode value = (AbstractValueTreeNode) getChildAt(0);
        if (value != null) {
            Value v = value.evaluate(context);

            if(v.isSet()){
                //context.getInterpreter().getStandardOutput().println(v.getValue().toString());
            }else {
                warn(context, InterpreterErrorType.UNSET_VALUE);
            }

            SymbolTableEntry entry = context.getSymbolTableEntry(this.identifier);
            if (entry == null) {
                fail(context, InterpreterErrorType.UNDEFINED_VARIABLE, this.identifier);
                return context;
            } else {
                entry.setValue(v);
            }
        }

        return context;
    }

    @Override
    public String toString() {
        return "LET " + this.identifier + " = " + getChildAt(0).toString();
    }
}
