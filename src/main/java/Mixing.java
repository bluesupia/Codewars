import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by supersupa on 2017. 1. 19..
 *
 * 4kyu / Strings Mix
 * https://www.codewars.com/kata/5629db57620258aa9d000014/train/java
 *
 */
public class Mixing {
    public static String mix(String s1, String s2) {

        Map<String, String> resultS1 = getStringMap(s1);
        Map<String, String> resultS2 = getStringMap(s2);

        ArrayList<String> result = new ArrayList<>();

        resultS1
                .forEach((str, strNum) -> {
                    int numS1 = strNum.length();
                    int numS2 = (resultS2.get(str) == null) ? 0 : resultS2.get(str).length();

                    if ( numS1 > numS2  && strNum.length() > 1) {
                        result.add("1:" + strNum);
                    } else if (numS1 == numS2 && numS1 > 1) {
                        result.add("=:" + strNum);
                    } else if (numS1 < numS2 && numS2 > 1) {
                        result.add("2:" + resultS2.get(str));
                    }
                    if (resultS2.get(str) != null) resultS2.remove(str);

                });

        if (result.size() > 0) {
            resultS2
                    .forEach((str, strNum) -> {
                        int numS2 = strNum.length();
                        int numS1 = (resultS1.get(str) == null) ? 0 : resultS1.get(str).length();

                        if ( numS1 > numS2  && strNum.length() > 1) {
                            result.add("1:" + strNum);
                        } else if (numS1 == numS2 && numS1 > 1) {
                            result.add("=:" + strNum);
                        } else if (numS1 < numS2 && numS2 > 1) {
                            result.add("2:" + resultS2.get(str));
                        }
                    });
        }


        Comparator<String> compByLength = (a, b) -> b.length() - a.length();
        Comparator<String> compByAlphabet = (a, b) -> a.compareTo(b);

        String str = result
                .stream()
                .sorted(compByLength.thenComparing(compByAlphabet))
                .collect(Collectors.joining("/"));

        return str;
    }


    private static Map<String, String> getStringMap(String str) {
        Map<String, String> result = new HashMap<>();
        Arrays
            .stream(str.split(""))
            .filter(s ->  Character.isLowerCase(s.charAt(0)))
            .forEach(s -> {
                if (result.get(s) != null) {
                    result.put(s, result.get(s)+s );
                } else {
                    result.put(s, s);
                }
            });

        return result;
    }

}
