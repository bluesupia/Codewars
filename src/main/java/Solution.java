import java.math.BigInteger;

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
        BigInteger factorial = factorial(n);
        BigInteger ten = new BigInteger("10");
        int result = 0;
        while ( factorial.remainder(ten) == BigInteger.ZERO ) {
            factorial = factorial.divide(ten);
            result++;
        }
        return result;
    }

    private static BigInteger factorial(int n) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}