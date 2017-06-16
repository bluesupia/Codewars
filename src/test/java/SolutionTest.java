import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class SolutionTest {
    @Test
    public void testZeros() throws Exception {
        assertThat(Solution.zeros(0), is(0));
        assertThat(Solution.zeros(6), is(1));
        assertThat(Solution.zeros(10), is(2));
        assertThat(Solution.zeros(14), is(2));
        assertThat(Solution.zeros(30), is(7));
        assertThat(Solution.zeros(1000), is(249));
    }

    @Test
    public void emptyArray() {
        TreeNode expected = null;
        assertThat(Solution.arrayToTree(arrayFrom()), is(expected));
    }

    @Test
    public void arrayWithMultipleElements() {
        TreeNode expected = new TreeNode(17, new TreeNode(0, new TreeNode(3), new TreeNode(15)), new TreeNode(-4));
        TreeNode result = Solution.arrayToTree(arrayFrom(17, 0, -4, 3, 15));

        assertThat(Solution.arrayToTree(arrayFrom(17, 0, -4, 3, 15)), is(expected));
    }


    private int[] arrayFrom(int... values) {
        return values;
    }

    @Test
    public void exampleTests() {
//        assertEquals("", Solution.lcs("a", "b"));
//        assertEquals("abc", Solution.lcs("abcdef", "abc"));
//        assertEquals("acf", Solution.lcs("abcdef", "acf"));
//        assertEquals("12356", Solution.lcs("132535365", "123456789"));
        assertEquals("nottest", Solution.lcs("anothertest", "notatest"));
    }

    @Test
    public void BasicTest() {
        assertEquals(23, Solution.rectangleRotation(6,4));
        assertEquals(65, Solution.rectangleRotation(30,2));
        assertEquals(49, Solution.rectangleRotation(8,6));
        assertEquals(333, Solution.rectangleRotation(16,20));
    }

    @Test
    public void test_BasicTests() {
        assertEquals("-6,-3-1,3-5,7-11,14,15,17-20", Solution.rangeExtraction(new int[] {-6,-3,-2,-1,0,1,3,4,5,7,8,9,10,11,14,15,17,18,19,20}));

        assertEquals("-3--1,2,10,15,16,18-20", Solution.rangeExtraction(new int[] {-3,-2,-1,2,10,15,16,18,19,20}));
    }
}