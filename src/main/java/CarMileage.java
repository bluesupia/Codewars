import java.util.Arrays;

/**
 * Created by supersupa on 2017. 2. 17..
 *
 * 4kyu / Catching Car Mileage Numbers
 * https://www.codewars.com/kata/catching-car-mileage-numbers/train/java
 */
public class CarMileage {

    public static int isInteresting(int number, int[] awesomePhrases) {
        if (number < 8 || (number > 13 && number < 97)) return 0;

        String str = String.valueOf(number);
        String firstStr = str.substring(0, 1);

        // Any digit followed by all zeros
        int allZeros = 0;
        if ( (firstStr + String.format("%0"+ (str.length()-1)+"d", 0)).equals(str))
            allZeros = number;
        else if (firstStr.equals("9")) {
            allZeros = Integer.valueOf(1 + String.format("%0" + str.length() + "d", 0));
            if (str.length() > 2 && str.replaceAll("9","").length() == 0) return 2;
        } else
            allZeros = Integer.valueOf( (Integer.valueOf(firstStr)+1) + String.format("%0"+ (str.length()-1)+"d", 0));
        int result = getValue(allZeros, number);
        if (result != -1 ) return result;

        // Every digit is the same number:
        int sameNumber = Integer.valueOf(String.valueOf(allZeros).replaceAll("0", firstStr));
        result = getValue(sameNumber, number);
        if (result != -1 ) return result;

        // The digits are sequential, incementing
        if (str.length() > 2) {
            int incrementingNumber = Integer.valueOf(firstStr);
            String strIncrementingNumber = String.valueOf(incrementingNumber);
            for (int i = 0; i < str.length() - 1; i++) {
                int temp = Integer.valueOf(String.valueOf(incrementingNumber).substring(i, i + 1)) + 1;
                if (temp > 9) temp = 0;
                strIncrementingNumber += String.valueOf(temp);
                incrementingNumber = Integer.valueOf(strIncrementingNumber);
            }
            result = getValue(incrementingNumber, number);
            if (result != -1) return result;

            // The digits are sequential, decrementing
            int decrementingNumber = Integer.valueOf(firstStr);
            String strDecrementingNumber = String.valueOf(decrementingNumber);
            for (int i = 0; i < str.length() - 1; i++) {
                int _temp = Integer.valueOf(String.valueOf(decrementingNumber).substring(i, i + 1)) - 1;
                if (_temp < 0) {
                    break;
                }
                strDecrementingNumber += String.valueOf(_temp);
                decrementingNumber = Integer.valueOf(strDecrementingNumber);
            }
            if (strDecrementingNumber.length() == str.length()) result = getValue(decrementingNumber, number);
            if (result != -1) return result;

            // The digits are a palindrome
            String strPalindromeNumber = str.substring(0, str.length() / 2);
            for (int i = (str.length() % 2 == 1) ? (str.length() / 2) : (str.length() / 2 - 1); i >= 0; i--) {
                strPalindromeNumber += str.substring(i, i + 1);
            }
            int palindromeNumber = Integer.valueOf(strPalindromeNumber);
            if (palindromeNumber < number) {
                palindromeNumber += Math.pow(10, str.length() - 2);
            }
            result = getValue(palindromeNumber, number);
            if (result != -1) return result;
        }

        // The digits match one of the values in the awesomePhrases array
        return Arrays
                .stream(awesomePhrases)
                .map(
                        awesomePhrase -> {
                            if (Math.abs(awesomePhrase - number) == 0)
                                return 2;
                            else if (Math.abs(awesomePhrase - number) < 3) {
                                return 1;
                            } else {
                                return 0;
                            }
                        }
                )
                .max()
                .orElse(0);
    }

    private static int getValue(int interestingNumber, int number) {
        int temp = Math.abs(interestingNumber - number);
        if (temp == 0)
            return 2;
        else if (temp <= 2)
            return 1;
        else
            return -1;
    }
}
