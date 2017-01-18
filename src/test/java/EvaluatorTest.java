import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EvaluatorTest {
    @Test
    public void test1() throws Exception {
        Evaluator eval = new Evaluator();
        assertEquals(10, eval.evaluate("2 3 9 4 / + *"));
    }
}