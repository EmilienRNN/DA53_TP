package fr.utbm.info.da53.lw2.syntaxtree;

import fr.utbm.info.da53.lw2.context.ExecutionContext;
import fr.utbm.info.da53.lw2.error.InterpreterErrorType;
import fr.utbm.info.da53.lw2.symbol.SymbolTable;
import fr.utbm.info.da53.lw2.symbol.SymbolTableEntry;
import fr.utbm.info.da53.lw2.type.Value;

public class IdentifierTreeNode extends AbstractValueTreeNode {

    private String name = "";

    public IdentifierTreeNode(String name) {
        super();
        if(name != null && !name.isEmpty()) {
            this.name = SymbolTable.formatIdentifier(name);
        }
    }

    @Override
    public Value evaluate(ExecutionContext context) {

        SymbolTableEntry entry = context.getSymbolTableEntry(this.name);
        if (entry==null) {
            warn(context, InterpreterErrorType.UNDEFINED_VARIABLE, this.name);
            return Value.UNDEF;
        }
        Value value = entry.getValue();
        if (value.isUnset()) {
            warn(context, InterpreterErrorType.UNSET_VALUE, this.name);
        }

        return value;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
