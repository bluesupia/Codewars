import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by supersupa on 2016. 12. 12..
 * https://www.codewars.com/kata/54dc6f5a224c26032800005c/train/java
 */
public class StockList {

    // 1st parameter is the stocklist (L in example),
    // 2nd parameter is list of categories (M in example)
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0)
            return "";
        Map<String, Integer> resultMap = new HashMap<>();

        Arrays
            .stream(lstOf1stLetter)
            .forEach(_1stLetter -> {
                resultMap.put(_1stLetter, 0);
            });

        long maxCnt = Arrays
            .stream(lstOfArt)
            .filter( art ->
                Arrays
                    .stream(lstOf1stLetter)
                    .filter( _1stLetter -> art.startsWith(_1stLetter)
                    )
                    .count() > 0
            )
            .count();

        if (maxCnt != 0L) {
            Arrays
                .stream(lstOfArt)
                .filter(art ->
                    Arrays
                        .stream(lstOf1stLetter)
                        .filter(_1stLetter -> art.startsWith(_1stLetter)
                        )
                        .count() > 0
                )
                .forEach(art -> {
                    String[] arr = art.split(" ");
                    if (arr != null && arr.length > 0) {
                        if (resultMap.get(art.substring(0, 1)) != 0) {
                            resultMap.put(art.substring(0, 1), Integer.valueOf(arr[1]) + resultMap.get(art.substring(0, 1)));
                        } else {
                            resultMap.put(art.substring(0, 1), Integer.valueOf(arr[1]));
                        }
                    }
                });
            // your code here
            return resultMap
                .entrySet()
                .stream()
                .map(e -> String.format("(%s : %d)", e.getKey(), e.getValue()))
                .collect(Collectors.joining(" - "));
        } else {
            return "";
        }
    }
}
