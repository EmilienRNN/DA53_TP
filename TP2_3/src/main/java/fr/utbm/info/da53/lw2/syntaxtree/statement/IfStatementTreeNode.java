package fr.utbm.info.da53.lw2.syntaxtree.statement;

import fr.utbm.info.da53.lw2.context.ExecutionContext;
import fr.utbm.info.da53.lw2.error.InterpreterException;
import fr.utbm.info.da53.lw2.syntaxtree.AbstractStatementTreeNode;

/**
 * This class represents an IF node in the syntax tree
 *
 * @author erenon;
 * @version $Name$ $Revision$ $Date$
 */
public class IfStatementTreeNode extends AbstractStatementTreeNode {

    /**
     * Constructor
     *
     */
    public IfStatementTreeNode() {
        super();
    }

    /**
     * Verify if the value is a correct type for the LET statement. Verify if the variable is defined.
     *
     * @param context is the execution context
     * @return the execution context
     */
    @Override
    public ExecutionContext run(ExecutionContext context) throws InterpreterException {
        return context;
    }
}
