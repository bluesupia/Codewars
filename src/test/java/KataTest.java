import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class KataTest {
    @Test
    public void tests() {
        assertEquals("(123) 456-7890", Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    @Test
    public void testEncrypt() {
        // assertEquals("expected", "actual");
        assertEquals("This is a test!", Kata.encrypt("This is a test!", 0));
        assertEquals("hsi  etTi sats!", Kata.encrypt("This is a test!", 1));
        assertEquals("s eT ashi tist!", Kata.encrypt("This is a test!", 2));
        assertEquals(" Tah itse sits!", Kata.encrypt("This is a test!", 3));
        assertEquals("This is a test!", Kata.encrypt("This is a test!", 4));
        assertEquals("This is a test!", Kata.encrypt("This is a test!", -1));
        assertEquals("hskt svr neetn!Ti aai eyitrsig", Kata.encrypt("This kata is very interesting!", 1));
    }

    @Test
    public void testDecrypt() {
        // assertEquals("expected", "actual");
//        assertEquals("This is a test!", Kata.decrypt("This is a test!", 0));
//        assertEquals("This is a test!", Kata.decrypt("hsi  etTi sats!", 1));
        assertEquals("This is a test!", Kata.decrypt("s eT ashi tist!", 2));
        assertEquals("This is a test!", Kata.decrypt(" Tah itse sits!", 3));
        assertEquals("This is a test!", Kata.decrypt("This is a test!", 4));
        assertEquals("This is a test!", Kata.decrypt("This is a test!", -1));
        assertEquals("This kata is very interesting!", Kata.decrypt("hskt svr neetn!Ti aai eyitrsig", 1));
    }

    @Test
    public void testNullOrEmpty() {
        // assertEquals("expected", "actual");
        assertEquals("", Kata.encrypt("", 0));
        assertEquals("", Kata.decrypt("", 0));
        assertEquals(null, Kata.encrypt(null, 0));
        assertEquals(null, Kata.decrypt(null, 0));
    }

    @Test
    public void Test1() {
        int[] data1= {1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0};
        int[] data2= {1,0,1,0,1,0,1,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1};
        assertArrayEquals(data2, Kata.DataReverse(data1));
    }

    @Test
    public void Test2() {
        int[] data1= {0,0,1,1,0,1,1,0,0,0,1,0,1,0,0,1};
        int[] data2= {0,0,1,0,1,0,0,1,0,0,1,1,0,1,1,0};
        assertArrayEquals(data2, Kata.DataReverse(data1));

    }
}