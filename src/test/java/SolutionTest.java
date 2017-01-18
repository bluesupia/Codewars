import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
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
}