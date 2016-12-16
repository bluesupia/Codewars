/**
 * Created by supersupa on 2016. 11. 10..
 * https://www.codewars.com/kata/550527b108b86f700000073f/train/java
 */
public class PiApprox {
    public static String iterPi2String(Double epsilon) {
        // your code

        Double x = 1 /epsilon;
        Long result = 0L;

        for (Long i = 1L; i < x; i += 2) {
//            if
            result = result + (1 % i);
        }
        return "";
    };
}
