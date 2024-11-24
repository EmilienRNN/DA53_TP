package fr.utbm.info.da53.lw2.syntaxtree.statement;


import fr.utbm.info.da53.lw2.context.ExecutionContext;
import fr.utbm.info.da53.lw2.error.InterpreterErrorType;
import fr.utbm.info.da53.lw2.error.InterpreterException;
import fr.utbm.info.da53.lw2.symbol.SymbolTableEntry;
import fr.utbm.info.da53.lw2.syntaxtree.AbstractStatementTreeNode;
import fr.utbm.info.da53.lw2.type.Value;
import fr.utbm.info.da53.lw2.type.VariableType;

/**
 * This class represents an INPUT node in the syntax tree
 *
 * @author erenon;
 * @version $Name$ $Revision$ $Date$
 */
public class InputStatementTreeNode extends AbstractStatementTreeNode {

    private final String identifier;

    /**
     * Constructor
     *
     * @param variable is the variable to set
     */
    public InputStatementTreeNode(String variable) {
        super();
        this.identifier = variable;
    }

    /**
     * Verify if the variable is a not null for the INPUT statement. Verify if the input is a number.
     *
     * @param context is the execution context
     * @return the execution context
     */
    @Override
    public ExecutionContext run(ExecutionContext context) throws InterpreterException {

        SymbolTableEntry entry = context.getSymbolTableEntry(this.identifier);
        if (entry == null) {
            fail(context, InterpreterErrorType.UNDEFINED_VARIABLE);

        } else {
            Value v = context.getInterpreter().getStandardInput().readString("Enter value for " + this.identifier + ": ");

            if (v != null && v.isSet() && v.getType() == VariableType.NUMBER) {
                entry.setValue(v);
            } else {
                fail(context, InterpreterErrorType.UNSET_VALUE);
                return context;
            }
        }
        return context;
    }
}
