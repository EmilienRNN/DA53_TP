package fr.utbm.info.da53.lw2.syntaxtree;

import fr.utbm.info.da53.lw2.context.ExecutionContext;
import fr.utbm.info.da53.lw2.error.InterpreterErrorType;
import fr.utbm.info.da53.lw2.error.InterpreterException;
import fr.utbm.info.da53.lw2.type.Value;
import fr.utbm.info.da53.lw2.type.VariableType;

public class GotoStatementTreeNode extends AbstractStatementTreeNode {


    public GotoStatementTreeNode(AbstractValueTreeNode value) {
        super();
        if (value != null) {
            setChildren(value);
        }
    }

    @Override
    public ExecutionContext run(ExecutionContext context) throws InterpreterException {
        AbstractValueTreeNode value = (AbstractValueTreeNode) getChildAt(0);
        if (value != null) {
            Value line = value.evaluate(context);
            if(line.isSet() && line.getType() == VariableType.NUMBER){
                context.setNextLine((Integer) line.getValue());
            }else {
                fail(context, InterpreterErrorType.EXPECTING_NUMBER, value.toString());
            }
        }else {
            fail(context, InterpreterErrorType.UNSET_VALUE);
        }
        return context;
    }


}
