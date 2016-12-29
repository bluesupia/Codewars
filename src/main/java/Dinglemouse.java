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

        String bits = ants.replace("ant", "");
        return "ant"
            .chars()
            .map(x -> (int)bits.chars().filter(y -> x == y).count())
            .max()
            .getAsInt();
    }
}
