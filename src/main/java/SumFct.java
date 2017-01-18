import java.math.BigInteger;

/**
 * Created by supersupa on 2017. 1. 18..
 *
 * 5kyu / Perimeter of squares in a rectangle
 * https://www.codewars.com/kata/559a28007caad2ac4e000083/train/java
 */
public class SumFct {
    public static BigInteger perimeter(BigInteger n) {
        // your code

        BigInteger result = BigInteger.ZERO;
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ONE;

        for (int i = 0; i <= n.intValue(); i++ ) {
            a = b;
            b = c;
            c = a.add(b);
            result = result.add(a);
        }

        return result.multiply(BigInteger.valueOf(4));
    }
}
