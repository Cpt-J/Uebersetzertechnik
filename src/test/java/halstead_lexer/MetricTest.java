package halstead_lexer;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(JUnitParamsRunner.class)
public class MetricTest {



    @Test
    @Parameters({
            "E:\\OneDrive\\Java\\übs\\src\\main\\resources\\halstead\\Beispiel.c,  177, 213, 43, 25, 390, 68, 2374.11, 51.45, 122156.26",
            "E:\\OneDrive\\Java\\übs\\src\\main\\resources\\halstead\\eval1.c, 122, 157, 30, 22, 279, 52, 1590.42, 44.73, 71144.90 ",
            "E:\\OneDrive\\Java\\übs\\src\\main\\resources\\halstead\\extract.c, 26, 29, 11, 10, 55, 21, 241.57, 11.81, 2855.0",
            "E:\\OneDrive\\Java\\übs\\src\\main\\resources\\halstead\\ggt1.c, 15, 15, 4, 11, 30, 15, 117.20, 20.62, 2417.38",
            "E:\\OneDrive\\Java\\übs\\src\\main\\resources\\halstead\\ggt2.c, 18, 17, 6, 9, 35, 15, 136.74, 13.5, 1846.0",
            "E:\\OneDrive\\Java\\übs\\src\\main\\resources\\halstead\\main.c, 19, 20, 12, 10, 39, 22, 173.91, 7.91, 1376.84"
    })
     public void testMetric(String filepath, int operandCount, int operatorCount, int distinctOperandCount,
                            int distinctOperatorCount, int length, int vocabulary, double volume, double difficulty, double effort){
        try {
            Metric m = new Metric(filepath);

            assertEquals(m.operandCount, operandCount);
            assertEquals(m.operatorCount, operatorCount);
            assertEquals(m.distinctOperandCount, distinctOperandCount);
            assertEquals(m.distinctOperatorCount, distinctOperatorCount);
            assertEquals(m.programLength, length);
            assertEquals(m.vocabularySize, vocabulary);
            assertEquals(m.volume, volume, 0.01);
            assertEquals(m.difficulty, difficulty, 0.01);
            assertEquals(m.effort, effort, 0.01);


        } catch (IOException e) {
                assertTrue(false);
        }

    }

}