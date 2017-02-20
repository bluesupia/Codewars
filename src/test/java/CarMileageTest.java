import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarMileageTest {

    @Test
    public void testTooSmall() {
        assertEquals(0, CarMileage.isInteresting(3, new int[]{1337, 256}));
    }

    @Test
    public void testAlmostAwesome() {
        assertEquals(1, CarMileage.isInteresting(1336, new int[]{1337, 256}));
    }

    @Test
    public void testAwesome() {
        assertEquals(2, CarMileage.isInteresting(1337, new int[]{1337, 256}));
    }

    @Test
    public void testFarNotInteresting() {
        assertEquals(0, CarMileage.isInteresting(11208, new int[]{1337, 256}));
    }

    @Test
    public void testAlmostInteresting() {
        assertEquals(1, CarMileage.isInteresting(11209, new int[]{1337, 256}));
    }

    @Test
    public void testInteresting() {
        assertEquals(2, CarMileage.isInteresting(11211, new int[]{1337, 256}));
    }

    @Test
    public void test1() {
        assertEquals(0, CarMileage.isInteresting(11207, new int[]{})); // 0;
    }

    @Test
    public void test2() {
        assertEquals(2, CarMileage.isInteresting(10000, new int[]{}));
    }

    @Test
    public void test3() {
        assertEquals(2, CarMileage.isInteresting(1221, new int[]{}));
    }

    @Test
    public void testUpcomingBigNumbers() {
        assertEquals(1, CarMileage.isInteresting(98, new int[]{}));
        assertEquals(1, CarMileage.isInteresting(99, new int[]{}));
        assertEquals(1, CarMileage.isInteresting(6998, new int[]{}));
    }

    @Test
    public void testDecrementing() {
//        assertEquals(1, CarMileage.isInteresting(9102132435, new long[]{}));
    }

    @Test
    public void testUpcomingPalindrome() {
        assertEquals(1, CarMileage.isInteresting(119, new int[]{}));
    }

    @Test
    public void testBigNumbers() {
        assertEquals(2, CarMileage.isInteresting(100, new int[]{}));
    }

    @Test
    public void testIncrementing() {
        assertEquals(2, CarMileage.isInteresting(67890, new int[]{}));
    }

    @Test
    public void testMonotone() {
        assertEquals(2, CarMileage.isInteresting(9999999, new int[]{}));

    }

    @Test
    public void testBoring() {
        assertEquals(0, CarMileage.isInteresting(90, new int[]{}));
        assertEquals(0, CarMileage.isInteresting(97, new int[]{}));
    }
}