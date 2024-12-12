package fr.utbm.info.da53.lw2.syntaxtree;

import fr.utbm.info.da53.lw2.context.ExecutionContext;
import fr.utbm.info.da53.lw2.error.InterpreterException;
import fr.utbm.info.da53.lw2.type.Value;

public class StringTreeNode extends AbstractValueTreeNode {
    private final String value;

    public StringTreeNode(String value) {
        super();
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    @Override
    public Value evaluate(ExecutionContext executionContext) throws InterpreterException {
        return new Value(this.value);
    }
}
