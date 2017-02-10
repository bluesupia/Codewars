import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by supersupa on 2016. 12. 23..
 *
 * 5kyu / Delta Bits
 * https://www.codewars.com/kata/538948d4daea7dc4d200023f/train/java
 */
public class DeltaBits {
    public static int convertBits(int a, int b) {
        return Integer.bitCount(a ^ b);
    }
}

