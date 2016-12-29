import java.util.Arrays;

/**
 * Created by supersupa on 2016. 12. 29..
 * Dead Ants
 * https://www.codewars.com/kata/57d5e850bfcdc545870000b7/train/java
 * 6kyu
 */
public class Dinglemouse {
    public static int deadAntCount(final String ants) {

        if (ants == null) return 0;
        else {
            String _ants = ants.replaceAll("ant", "").trim();
            if (_ants.length() == 0) return 0;
            else {
                int a_count = (int)Arrays
                    .stream(_ants.split(""))
                    .filter(x -> "a".equals(x))
                    .count();

                int n_count = (int)Arrays
                    .stream(_ants.split(""))
                    .filter(x -> "n".equals(x))
                    .count();

                int t_count = (int)Arrays
                    .stream(_ants.split(""))
                    .filter(x -> "t".equals(x))
                    .count();

                if (a_count >= n_count && a_count >= t_count) {
                    return a_count;
                } else if (n_count >= t_count && n_count >= a_count) {
                    return n_count;
                } else {
                    return t_count;
                }
            }
        }
    }
}
