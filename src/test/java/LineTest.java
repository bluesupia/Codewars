import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by supersupa on 2016. 12. 15..
 * https://www.codewars.com/kata/555615a77ebc7c2c8a0000b8/train/java
 */
public class LineTest {
    @Test
    public void test1() {
        assertEquals("YES", Line.Tickets(new int[] {25, 25, 50}));
    }
    @Test
    public void test2() {
        assertEquals("NO", Line.Tickets(new int []{25, 100}));
    }
}