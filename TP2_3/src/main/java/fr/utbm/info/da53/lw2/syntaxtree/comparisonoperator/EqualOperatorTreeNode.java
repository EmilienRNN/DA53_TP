package fr.utbm.info.da53.lw2.syntaxtree.comparisonoperator;

import fr.utbm.info.da53.lw2.syntaxtree.AbstractComparisonOperatorTreeNode;

/**
 * Node for an Equal operator that returns a boolean result.
 *
 * @author erenon;
 * @version $Name$ $Revision$ $Date$
 */
public class EqualOperatorTreeNode extends AbstractComparisonOperatorTreeNode {

    /**
     * Constructor
     */
    public EqualOperatorTreeNode() {
        super();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean translate(int comparisonResult) {
        return comparisonResult == 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getOperatorString() {
        return "=";
    }
}
