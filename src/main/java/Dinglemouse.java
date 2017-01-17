import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by supersupa on 2017. 1. 17..
 *
 * 5kyu / Histogram - V1
 * https://www.codewars.com/kata/57c6c2e1f8392d982a0000f2/train/java
 */
public class Dinglemouse {
    public static String histogram(final int results[]) {
        int max = Arrays
                .stream(results)
                .max()
                .getAsInt();

        StringBuffer sb = new StringBuffer();
        String str = "";
        for (int i = max; i >= 0; i--) {
            final int finalI = i;
            str = Arrays
                .stream(results)
                .mapToObj(e -> {
                    if (e > finalI) {
                        return "# ";
                    } else if (e == finalI && e != 0) {
                        return String.format("%-2s", Integer.toString(e));
                    } else {
                        return "  ";
                    }
                })
                .collect(Collectors.joining(""))
                .replaceAll("\\s+$","");
            if (str.length() > 0) sb.append(str + "\n");
        }

        String bar = IntStream
                .range(0, results.length)
                .mapToObj(i -> "--")
                .collect(Collectors.joining(""));

        String end = IntStream
                .range(1, results.length + 1)
                .mapToObj(i -> Integer.toString(i))
                .collect(Collectors.joining(" "));

        sb.append(bar + "\n");
        sb.append(end + "\n");

        return sb.toString();
    }

}