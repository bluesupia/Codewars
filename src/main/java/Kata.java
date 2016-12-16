import java.util.stream.IntStream;

/**
 * Created by supersupa on 2016. 12. 16..
 * https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java
 * 6kyu
 */
public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        if (numbers.length != 10) return "";
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(numbers).boxed().toArray());
    }
}
