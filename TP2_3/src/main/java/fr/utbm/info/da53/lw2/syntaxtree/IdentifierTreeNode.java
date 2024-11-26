package fr.utbm.info.da53.lw2.syntaxtree;

import fr.utbm.info.da53.lw2.context.ExecutionContext;
import fr.utbm.info.da53.lw2.type.Value;

public class IdentifierTreeNode extends AbstractValueTreeNode {
    private final String name;

    public IdentifierTreeNode(String name) {
        super();
        this.name = name;
    }

    @Override
    public Value evaluate(ExecutionContext context) {
        return new Value(this.name);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
