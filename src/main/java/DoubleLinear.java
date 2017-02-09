import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by supersupa on 2017. 2. 8..
 *
 * 4kyu / Twice linear
 * https://www.codewars.com/kata/5672682212c8ecf83e000050/train/java
 *
 */
public class DoubleLinear {
    public static int dblLinear(int n) {
        SortedSet<Integer> result = new TreeSet<Integer>();
        result.add(1);
        int j = 0;
        for (int i = 0;  i < n; i++) {
            j = result.first();
            result.add( 2 * j + 1 );
            result.add( 3 * j + 1 );
            result.remove(j);
        }
        return result.first();
    }
}
