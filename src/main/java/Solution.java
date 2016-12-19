/**
 * Created by supersupa on 2016. 12. 16..
 * https://www.codewars.com/kata/fun-with-lists-length/train/java
 * https://www.codewars.com/kata/582041237df353e01d000084/train/java
 * 6kyu
 * https://www.codewars.com/kata/52f787eb172a8b4ae1000a34/train/java
 * 5kyu
 */
public class Solution {
    public static int zeros(int n) {
        int result = 0;
        int j = 0;
        for (int i = 1; i <= n; i++) {
            j = i;
            while (j % 5 == 0) {
                result ++;
                j = j / 5;
            }
        }
        return result;
    }
}