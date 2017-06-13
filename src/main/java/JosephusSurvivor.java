import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by supersupa on 2016. 12. 22..
 * Josephus Survivor
 * https://www.codewars.com/kata/555624b601231dc7a400017a/train/java
 * 5kyu
 */
public class JosephusSurvivor {
    public static int josephusSurvivor(final int n, final int k) {
        List<Integer> josephusList = IntStream
            .range(1, n + 1)
            .boxed()
            .collect(Collectors.toList());

        int lastNum = 0;
        int index = 0;
        while(!josephusList.isEmpty()) {
            index += k - 1;
            index %= josephusList.size();
            lastNum = josephusList.get(index);
            josephusList.remove(index);
        }

        return lastNum;
    }
}
