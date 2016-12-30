import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by supersupa on 2016. 12. 16..
 * https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java
 * 6kyu
 *
 * Simple Encryption #1 - Alternating Split
 * https://www.codewars.com/kata/simple-encryption-number-1-alternating-split/train/java
 * 6kyu
 *
 * Data Reverse
 * https://www.codewars.com/kata/569d488d61b812a0f7000015/train/java
 * 6kyu
 */
public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        if (numbers.length != 10) return "";
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(numbers).boxed().toArray());
    }

    public static String encrypt(final String text, final int n) {
        String result = text;

        for (int i = 0; i < n; i++) {
            String arr[] = result.split("");
            String head = "";
            String tail = "";

            for (int j=0; j < arr.length; j++) {
                if (j % 2 == 1) head = head + arr[j];
                else tail = tail + arr[j];
            }
            result = head+tail;
        }
        return result;
    }

    public static String decrypt(final String encryptedText, final int n) {
        String result = encryptedText;
        String arr[];

        for (int i = 0; i < n; i++) {
            arr = result.split("");
            result = "";
            for (int j = 0; j < arr.length / 2; j++) {
                result = result + arr[j + (arr.length / 2)] + arr[j];
            }
            if (arr.length % 2 == 1) {
                result += arr[arr.length -1];
            }
        }
        return result;
    }

    public static int[] DataReverse(int[] data) {
        return IntStream
            .range(0, data.length)
            .map(i -> data[data.length - 8 - (i / 8 * 8) + (i % 8)])
            .toArray();
    }
}
