package fr.utbm.info.da53.lw2.syntaxtree;
import fr.utbm.info.da53.lw2.context.ExecutionContext;
import fr.utbm.info.da53.lw2.error.InterpreterErrorType;
import fr.utbm.info.da53.lw2.error.InterpreterException;
import fr.utbm.info.da53.lw2.type.Value;

public class PrintStatementTreeNode extends AbstractStatementTreeNode{

    public PrintStatementTreeNode(AbstractValueTreeNode value) {
        super();
        if (value != null){
            setChildren(value);
        }
    }

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
}
