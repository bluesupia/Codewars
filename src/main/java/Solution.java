
/**
 * Created by supersupa on 2016. 12. 16..
 * 7kyu / Fun with lists: length
 * https://www.codewars.com/kata/fun-with-lists-length/train/java
 *
 * 5kyu / Number of trailing zeros of N!
 * https://www.codewars.com/kata/52f787eb172a8b4ae1000a34/train/java
 *
 * 5kyu / Fun with trees: array to tree
 * https://www.codewars.com/kata/57e5a6a67fbcc9ba900021cd/train/java
 *
 * 4kyu / Longest Common Subsequence
 * https://www.codewars.com/kata/52756e5ad454534f220001ef/train/java
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

    static int maxSum(TreeNode root) {
        int result = 0;

        while(root != null) {

        }
        return result;
    }

    private static TreeNode createTreeNode(int[] input, int index) {
        if (index <= input.length) {
            int value = input[index-1];
            TreeNode t = new TreeNode(value, createTreeNode(input, index * 2), createTreeNode(input, index * 2 + 1));
            return t;
        }
        return null;
    }

    public static String lcs(String x, String y) {
        String result = "";

        for (int i = 0; i < y.length(); i++) {
            System.out.println(i);
            if (x.contains("" + y.charAt(i))) {
                result += y.charAt(i);
                x = x.substring(x.indexOf(y.charAt(i)) + 1);
            }
        }

        return result;
    }
}