package fr.utbm.info.da53.lw2.syntaxtree;

import fr.utbm.info.da53.lw2.context.ExecutionContext;
import fr.utbm.info.da53.lw2.error.InterpreterErrorType;
import fr.utbm.info.da53.lw2.error.InterpreterException;
import fr.utbm.info.da53.lw2.symbol.SymbolTableEntry;
import fr.utbm.info.da53.lw2.type.Value;

public class LetStatementTreeNode extends AbstractStatementTreeNode {

    private final String identifier;

    public LetStatementTreeNode(String variable, AbstractValueTreeNode value) {
        super();
        if (value != null) {
            setChildren(value);
        }
        this.identifier = variable;
    }

    @Override
    public ExecutionContext run(ExecutionContext context) throws InterpreterException {
        AbstractValueTreeNode value = (AbstractValueTreeNode) getChildAt(0);
        if (value != null) {
            Value v = value.evaluate(context);

            if(v.isSet()){
                context.getInterpreter().getStandardOutput().println(v.getValue().toString());
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
}
