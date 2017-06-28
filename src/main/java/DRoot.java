import java.util.ArrayList;
import java.util.List;

/**
 * Created by supersupa on 2017. 6. 28..
 *
 * 6kyu / Sum of Digits / Digital Root
 * https://www.codewars.com/kata/541c8630095125aba6000c00/train/java
 */
public class DRoot {
    public static int digital_root(int n) {
        do {
            List<Integer> integerList = new ArrayList<>();
            int _n = n;

            while (_n != 0){
                integerList.add(_n % 10);
                _n /= 10;
            }

            n = integerList
                    .stream()
                    .mapToInt(i -> i.intValue())
                    .sum();
        } while(n / 10 >= 1);
        return n;
    }
}
