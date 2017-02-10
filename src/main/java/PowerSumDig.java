import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by supersupa on 2017. 2. 10..
 *
 * 5kyu / Numbers that are a power of their sum of digits
 * https://www.codewars.com/kata/numbers-that-are-a-power-of-their-sum-of-digits/train/java
 */
public class PowerSumDig {
    public static long powerSumDigTerm(int n) {
        long _sum = 0L;
        List<Long> a = new ArrayList<>();
        for (int b = 2; b < 70; b++) {
            long value = b;
            for (int e = 1; e < 20; e++) {
                value *= b;
                if (value < 0) break;
                _sum = Arrays
                        .stream(String
                                .valueOf(value)
                                .split(""))
                        .mapToLong(s -> Long.valueOf(s))
                        .sum();

                if (_sum == b) {
                    a.add(value);
                }
                if (a.size() > n * 2) break;
            }
            if (a.size() > n * 2) break;
        }

        Collections.sort(a);
        return a.get(n-1);
    }
}
