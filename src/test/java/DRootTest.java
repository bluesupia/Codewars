import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by supersupa on 2017. 6. 28..
 */
public class DRootTest {
    @Test
    public void Tests() {
        assertEquals( "Nope!" , DRoot.digital_root(16), 7);


        assertEquals( "Nope!" , DRoot.digital_root(195), 6);
    }

    @Test
    public void Tests_best() {
        assertEquals( "Nope!" , DRoot.digital_root_best(16), 7);


        assertEquals( "Nope!" , DRoot.digital_root_best(195), 6);
    }
}