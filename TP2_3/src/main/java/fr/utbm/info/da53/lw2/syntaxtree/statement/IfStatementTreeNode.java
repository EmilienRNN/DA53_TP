package fr.utbm.info.da53.lw2.syntaxtree.statement;

import fr.utbm.info.da53.lw2.context.ExecutionContext;
import fr.utbm.info.da53.lw2.error.InterpreterErrorType;
import fr.utbm.info.da53.lw2.error.InterpreterException;
import fr.utbm.info.da53.lw2.syntaxtree.AbstractComparisonOperatorTreeNode;
import fr.utbm.info.da53.lw2.syntaxtree.AbstractStatementTreeNode;
import fr.utbm.info.da53.lw2.type.Value;
import fr.utbm.info.da53.lw2.type.VariableType;

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
     * @param c is the comparison operator
     * @param s is the statement to execute if the condition is true
     * @param s2 is the statement to execute if the condition is false
     */
    public IfStatementTreeNode(AbstractComparisonOperatorTreeNode c, AbstractStatementTreeNode s,
                               AbstractStatementTreeNode s2) {
        super();
        setChildren(c, s, s2);
    }

    /**
     * Verify if the value is a correct type for the IF statement. Verify if the variable is defined.
     *
     * @param context is the execution context
     * @return the execution context
     */
    @Override
    public ExecutionContext run(ExecutionContext context) throws InterpreterException {

        AbstractComparisonOperatorTreeNode c = (AbstractComparisonOperatorTreeNode) getChildAt(0);
        if (c == null) {

            warn(context, InterpreterErrorType.EXPECTING_BOOLEAN);

        } else {

            Value v = c.evaluate(context);
            if (v.isSet() && v.getType() == VariableType.BOOLEAN) {
                if ((Boolean) v.getValue()) {
                    AbstractStatementTreeNode s = (AbstractStatementTreeNode) getChildAt(1);
                    if (s != null) {
                        context = s.run(context);
                    } else {
                        warn(context, InterpreterErrorType.NOTHING_TO_RUN, toString());
                    }
                } else {
                    AbstractStatementTreeNode s2 = (AbstractStatementTreeNode) getChildAt(2);
                    if (s2 != null) {
                        context = s2.run(context);
                    }
                }
            } else {
                warn(context, InterpreterErrorType.EXPECTING_BOOLEAN);
            }
        }
        return context;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("IF ");
        b.append(getChildAt(0).toString());
        b.append(" THEN ");
        b.append(getChildAt(1).toString());
        Object o = getChildAt(2);
        if (o!=null) {
            b.append(" ELSE ");
            b.append(o.toString());
        }
        return b.toString();
    }
}

