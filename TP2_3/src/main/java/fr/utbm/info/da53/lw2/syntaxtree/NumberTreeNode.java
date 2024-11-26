package fr.utbm.info.da53.lw2.syntaxtree;

import fr.utbm.info.da53.lw2.context.ExecutionContext;
import fr.utbm.info.da53.lw2.type.NumberUtil;
import fr.utbm.info.da53.lw2.type.Value;

public class NumberTreeNode extends AbstractValueTreeNode {
    private final Number value;

    public NumberTreeNode(String value) {
        super();
        this.value = NumberUtil.parseInt(value);
    }

    @Override
    public Value evaluate(ExecutionContext context) {
        return new Value(this.value);
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
