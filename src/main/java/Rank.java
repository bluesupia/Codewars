import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by supersupa on 2016. 12. 29..
 * Prize Draw
 * https://www.codewars.com/kata/5616868c81a0f281e500005c/train/java
 * 6kyu
 */
public class Rank {
    public static String nthRank(String st, Integer[] we, int n) {
        if ("".equals(st))
            return "No participants";

        String[] arrSt = st.split(",");
        if (arrSt.length < n) {
            return "Not enough participants";
        }

        Map<String, Integer> resultMap = new HashMap<>();

        for (int i = 0; i < arrSt.length; i++) {
            Long sum = arrSt[i]
                .toLowerCase()
                .chars()
                .mapToLong(c -> (char) c - 'a' + 1)
                .sum();
            resultMap.put(arrSt[i], Integer.valueOf((int) ((arrSt[i].length() + sum) * we[i])));
        }

        Comparator<Map.Entry<String, Integer>> comparator1 = (o1, o2)->o1.getValue().compareTo(o2.getValue());
        Comparator<Map.Entry<String, Integer>> comparator2 = (o1, o2)->o1.getKey().compareTo(o2.getKey());

        return resultMap
            .entrySet()
            .stream()
            .sorted(comparator1.reversed().thenComparing(comparator2))
            .limit(n)
            .sorted(comparator1.thenComparing(comparator2.reversed()))
            .findFirst()
            .get()
            .getKey();
    }
}
