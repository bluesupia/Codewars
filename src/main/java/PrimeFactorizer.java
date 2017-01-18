import java.util.HashMap;
import java.util.Vector;

/**
 * Created by supersupa on 2016. 12. 20..
 * Prime factorization
 * https://www.codewars.com/kata/534a0c100d03ad9772000539/train/java
 * 5kyu
 */
public class PrimeFactorizer {
    public java.util.Map<Long, Integer> factor(long n){
        Vector<Integer> ret = new Vector<Integer>();
        java.util.Map<Long, Integer> map = new HashMap<>();

        // n=1인 경우 예외처리
        if (n == 1) {
            ret.add(1);
        }

        for (int div = 2; n > 1; div++) {
            while(n % div == 0) {
                n /= div;
                ret.add(div);
            }
        }

        return null;
    }
}
