/**
 * Created by supersupa on 2016. 12. 13..
 * https://www.codewars.com/kata/surrounding-primes-for-a-value/train/java
 */
public class BeforeAfterPrimes {

    public static long[] primeBefAft(long num) {
        // your code

        long[] result = {num, num};
        do {
            result[0] -= 1;

            if (isPrime(result[0])) break;

        } while (result[0] > 0);

        do {
            result[1] += 1;

            if (isPrime(result[1])) break;

        } while (true);

        return result;
    }

    static boolean isPrime(long n) {
        for(int i=2; 2*i < n; i++) {
            if(n%i == 0)
                return false;
        }
        return true;
    }
}
