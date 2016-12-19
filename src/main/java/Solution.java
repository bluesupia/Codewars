
/**
 * Created by supersupa on 2016. 12. 16..
 * https://www.codewars.com/kata/fun-with-lists-length/train/java
 * https://www.codewars.com/kata/582041237df353e01d000084/train/java
 * 6kyu
 *
 * https://www.codewars.com/kata/52f787eb172a8b4ae1000a34/train/java
 * 5kyu
 *
 * https://www.codewars.com/kata/57e5a6a67fbcc9ba900021cd/train/java
 * 5kyu
 */
public class Solution {
    public static int zeros(int n) {
        int result = 0;
        for (int i = 5; i <= n; i *= 5) {
            result += n / i;
        }
        return result;
    }

    static TreeNode arrayToTree(int[] array) {
        TreeNode root = createTreeNode(array, 1);

        return root; // TODO: implementation
    }

    private static TreeNode createTreeNode(int[] input, int index) {
        if (index <= input.length) {
            int value = input[index-1];
            TreeNode t = new TreeNode(value, createTreeNode(input, index * 2), createTreeNode(input, index * 2 + 1));
            return t;
        }
        return null;
    }
}