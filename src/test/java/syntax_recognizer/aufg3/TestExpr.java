package syntax_recognizer.aufg3;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


@RunWith(JUnitParamsRunner.class)
public class TestExpr {

    Object[] getData() {
        return new Object[]{
                new Object[]{"1+1",
                        "(expr (expr 1) + (expr 1))"},
                new Object[]{"10/2*2+4",
                        "(expr (expr (expr 10) / (expr (expr 2) * (expr 2))) + (expr 4))"},
                new Object[]{"1^2^3",
                        "(expr (expr 1) ^ (expr (expr 2) ^ (expr 3)))"},
                new Object[]{"1=2=3",
                        "(expr (expr 1) = (expr (expr 2) = (expr 3)))"}
        };

    }

    @Test
    @Parameters(method = "getData")
    public void testExprTree(String in, String tree) {
        try {
            assertEquals(tree, Expr.getTree(in));
        } catch (IOException e) {
            assertTrue(false);
        }
    }

}
