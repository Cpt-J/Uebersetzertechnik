package syntax_recognizer.aufg1;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(JUnitParamsRunner.class)
public class TestG6 {

    Object[] getData() {
        return new Object[]{
                new Object[]{"1+1",
                        "(expr (eq (comp (comp (term (pot (fact 1)))) + (term (pot (fact 1))))))"},
                new Object[]{"10/2*2+4",
                        "(expr (eq (comp (comp (term (term (term (pot (fact 10))) / (pot (fact 2))) * (pot (fact 2)))) + (term (pot (fact 4))))))"},
                new Object[]{"1^2^3",
                        "(expr (eq (comp (term (pot (fact 1) ^ (pot (fact 2) ^ (pot (fact 3))))))))"},
                new Object[]{"1=2=3",
                        "(expr (eq (comp (term (pot (fact 1))))) = (expr (eq (comp (term (pot (fact 2))))) = (expr (eq (comp (term (pot (fact 3))))))))"}
        };

    }

    @Test
    @Parameters(method = "getData")
    public void testG6Tree(String in, String tree) {
        try {
            assertEquals(tree, G6.getTree(in));
        } catch (IOException e) {
            assertTrue(false);
        }
    }


}
