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
        List<T> rest = new ArrayList<>();
        int i = 0;
        int max = items.size();

        while(rest.size() > 0) {

            if (i % 3 == 2) {
                result.add(items.get(i));
            } else {
                rest.add(items.get(i));
            }

            if (i == max) {
                rest = new ArrayList<>();
                i = 0;
            }
            i++;
        }
        return result;
    }
}