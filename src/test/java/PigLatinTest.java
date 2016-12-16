import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by supersupa on 2016. 11. 11..
 */
public class PigLatinTest {

    private PigLatin p;

    @Before
    public void setUp() throws Exception {
        p = new PigLatin();
    }

    @Test
    public void testMap() {
        assertEquals("apmay", p.translate("map"));
    }

    @Test
    public void testegg() {
        assertEquals("eggway", p.translate("egg"));
    }

    @Test
    public void testspaghetti() {
        assertEquals("aghettispay", p.translate("spaghetti"));
    }

    @Test
    public void testTranslate() throws Exception {
        p.translate("map");
    }

    @Test
    public void testtes3t5() { assertEquals(null, p.translate("test3t5")); }

    @Test
    public void test123() { assertEquals(null, p.translate("123")); }

    @Test
    public void testYA() { assertEquals(null, p.translate("YA")); }

}