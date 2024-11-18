package fr.utbm.info.da53.lw2.syntaxtree.binaryoperator;

import fr.utbm.info.da53.lw2.context.ExecutionContext;
import fr.utbm.info.da53.lw2.error.InterpreterErrorType;
import fr.utbm.info.da53.lw2.error.InterpreterException;
import fr.utbm.info.da53.lw2.syntaxtree.AbstractBinaryOperatorTreeNode;
import fr.utbm.info.da53.lw2.syntaxtree.AbstractValueTreeNode;
import fr.utbm.info.da53.lw2.type.NumberUtil;
import fr.utbm.info.da53.lw2.type.Value;
import fr.utbm.info.da53.lw2.type.VariableType;

/**
 * Node for the multiplication operator.
 *
 * @author erenon;
 * @version $Name$ $Revision$ $Date$
 */
public class MultiplicationTreeNode extends AbstractBinaryOperatorTreeNode {

    /**
     * @param leftOperand
     * @param rightOperand
     */
    public MultiplicationTreeNode(AbstractValueTreeNode leftOperand, AbstractValueTreeNode rightOperand) {
        super(leftOperand, rightOperand);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Value compute(ExecutionContext executionContext, Value left, Value right) throws InterpreterException {
        /*
        if (left.getType()== VariableType.STRING || right.getType()==VariableType.STRING) {
            return new Value(left.getValue().toString() - right.getValue().toString());
        }*/

        if (left.getType() != VariableType.NUMBER) {
            fail(executionContext, InterpreterErrorType.EXPECTING_NUMBER, "left operand of "+getOperatorString()); //$NON-NLS-1$
        }
        if (right.getType()!=VariableType.NUMBER) {
            fail(executionContext, InterpreterErrorType.EXPECTING_NUMBER, "right operand of "+getOperatorString()); //$NON-NLS-1$
        }
        Number l = left.getValue(Number.class);
        Number r = right.getValue(Number.class);
        return new Value(NumberUtil.toNumber(l.doubleValue() * r.doubleValue()));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getOperatorString() {
        return "x"; //$NON-NLS-1$
    }
}
