import java.util.ArrayList;
import java.util.List;

/**
 * Created by supersupa on 2016. 12. 22..
 * Josephus Permutation
 * http://www.codewars.com/kata/josephus-permutation/train/java
 * 5kyu
 */
public class Josephus {
    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        List<T> result = new ArrayList<>();

        int index = 0;
        while(!items.isEmpty()) {
            index += k - 1;
            if (index >= items.size()) {
                index %= items.size();
            }

            result.add(items.remove(index));
        }
        return result;
    }
}