package test.net.sourceforge.pmd.rules.optimization;

import net.sourceforge.pmd.Rule;
import test.net.sourceforge.pmd.testframework.SimpleAggregatorTst;

public class UseStringBufferForStringAppendsTest extends SimpleAggregatorTst {
    private Rule rule;

    public void setUp() {
        rule = findRule("optimizations", "UseStringBufferForStringAppends");
    }

    public void testAll() {
        runTests(rule);
    }
}
