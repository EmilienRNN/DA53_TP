package fr.utbm.info.da53.lw2.syntaxtree.statement;

import fr.utbm.info.da53.lw2.context.ExecutionContext;
import fr.utbm.info.da53.lw2.error.InterpreterErrorType;
import fr.utbm.info.da53.lw2.error.InterpreterException;
import fr.utbm.info.da53.lw2.syntaxtree.AbstractStatementTreeNode;

/**
 * This class represents an END node in the syntax tree
 *
 * @author erenon;
 * @version $Name$ $Revision$ $Date$
 */
public class ReturnStatementTreeNode extends AbstractStatementTreeNode {

    /**
     * Constructor
     */
    public ReturnStatementTreeNode() {
        super();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExecutionContext run(ExecutionContext context) throws InterpreterException {

        if(context.getParent() != null){
            context = context.getParent();
        } else {
            fail(context, InterpreterErrorType.RETURN_OUTSIDE_SUB);
        }

        return context;
    }
}
