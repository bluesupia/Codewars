import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * Created by supersupa on 2016. 12. 16..
 * https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/java
 */
public class Order {
    public static String order(String words) {
        String str = Arrays
            .stream(words.split(" "))
            .sorted(Comparator.comparing(word -> Integer.valueOf()))
            .sorted((word1, word2) ->
                Integer.compare(Integer.valueOf(word1.replaceAll("[^0-9]", "")), Integer.valueOf(word2.replaceAll("[^0-9]", "")))
            )
            .collect(Collectors.joining(" "));
        return str;
    }
}
