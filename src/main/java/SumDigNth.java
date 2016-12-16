/**
 * Created by supersupa on 2016. 12. 9..
 * https://www.codewars.com/kata/55ffb44050558fdb200000a4/train/java
 */
public class SumDigNth {
    public static long sumDigNthTerm(long initval, long[] patternl, int nthterm) {
        // your code
        long termVal = initval;

        for (int i = 2 ; i <= nthterm ; i++ ) {
            termVal += patternl[ (i - 2) % patternl.length ];
        }

        long resultVal = 0L;
        do {
            resultVal += termVal % 10;

            termVal /= 10;
        } while ( termVal > 0);

        return resultVal;
    }
}
