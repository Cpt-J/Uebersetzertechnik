package syntax_recognizer.aufg2;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import syntax_recognizer.aufg1.G6;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(JUnitParamsRunner.class)
public class TestExprit {

    Object[] getData() {
        return new Object[]{
                new Object[]{"1+1\n",
                        "(prog (stat (expr (eq (comp (term (pot (fact 1))) + (term (pot (fact 1)))))) \\n))"},
                new Object[]{"10/2*2+4\n",
                        "(prog (stat (expr (eq (comp (term (pot (fact 10)) / (pot (fact 2)) * (pot (fact 2))) + (term (pot (fact 4)))))) \\n))"},
                new Object[]{"1^2^3\n",
                        "(prog (stat (expr (eq (comp (term (pot (fact 1) ^ (pot (fact 2) ^ (pot (fact 3)))))))) \\n))"},
                new Object[]{"1=2=3\n",
                        "(prog (stat (expr (eq (comp (term (pot (fact 1))))) = (expr (eq (comp (term (pot (fact 2))))) = (expr (eq (comp (term (pot (fact 3)))))))) \\n))"}
        };

    }

    @Test
    @Parameters(method = "getData")
    public void testExpritTree(String in, String tree) {
        try {
            assertEquals(tree, Exprit.getTree(in));
        } catch (IOException e) {
            assertTrue(false);
        }
    }
}
