package fr.utbm.info.da53.lw2.syntaxtree.statement;

import fr.utbm.info.da53.lw2.context.ExecutionContext;
import fr.utbm.info.da53.lw2.error.InterpreterException;
import fr.utbm.info.da53.lw2.syntaxtree.AbstractStatementTreeNode;

/**
 * This class represents an END node in the syntax tree
 *
 * @author erenon;
 * @version $Name$ $Revision$ $Date$
 */
public class EndStatementTreeNode extends AbstractStatementTreeNode {

    /**
     * Constructor
     */
    public EndStatementTreeNode() {
        super();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExecutionContext run(ExecutionContext context) throws InterpreterException {
        return context;
    }
}
