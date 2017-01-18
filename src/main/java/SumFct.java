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

        BigInteger result = BigInteger.valueOf(0);

        BigInteger[] arr = new BigInteger[n.intValue() + 1];

        for (int i = 0; i <= n.intValue(); i++ ) {
            if ( i == 0 || i == 1) arr[i] = BigInteger.valueOf(1);
            else arr[i] = arr[i-2].add(arr[i -1]);
            result = result.add(arr[i]);

        }

        return result.multiply(BigInteger.valueOf(4));
    }
}
