import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

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
 *
 * 4kyu / Simple Fun #27: Rectangle Rotation (X)
 * https://www.codewars.com/kata/5886e082a836a691340000c3/train/java
 *
 * 4kyu / Range Extraction
 * https://www.codewars.com/kata/range-extraction/train/java
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

    static int rectangleRotation(final int a, final int b) {


        return 0;
    }


    public static String rangeExtraction(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, Arrays.stream(arr).boxed().toArray(Integer[]::new));
        String result = list.stream().collect(
                Collector.of(
                        () -> new SupplierFormat(),          // supplier : 그릇
                        (a, t) -> {                 // accumulator
                            a.before = a.now;
                            a.now = t;
                            if ( a.now - a.before == 1) {
                                if (a.count == 0) {
                                    a.start = a.now;
                                }
                                a.count ++;
                            } else {
                                a.result = getResult(a.now, a.start, a.count, a.result);
                                a.count = 0;
                                a.result += "," + String.valueOf(a.now) ;
                            }
                        },
                        (a, b) -> null,             // combiner
                        a ->  getResult(a.now, a.start, a.count, a.result)  // finisher
                )
        );
        return result.substring(1);
    }

    public static String getResult(int now, int start, int count, String result) {
        if (count > 1) {
            result += "-" + String.valueOf(start + count - 1);
        } else if (count == 1) {
            result += "," + String.valueOf(start + count - 1);
        }
        return result;
    }
    public static class SupplierFormat {
        int now = 0;
        int before = 0;
        int count = 0;
        int start = 0;
        String result = "";
    }
}