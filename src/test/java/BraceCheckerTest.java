import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by supersupa on 2017. 2. 6..
 */
public class BraceCheckerTest {
    private BraceChecker checker = new BraceChecker();

    @Test
    public void testValid() {
        assertEquals(true, checker.isValid("()"));
    }

    @Test
    public void testInvalid() {
        assertEquals(false, checker.isValid("[(])"));

    }

    @Test
    public void testAttempt() {

        /*
        [(])
        (}
        (})
        )(}{][
        ())({}}{()][][
        (((({{
         */

        assertEquals(false, checker.isValid("(((({{"));
    }
}