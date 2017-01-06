/**
 * Created by supersupa on 2017. 1. 4..
 * Take a Ten Minute Walk
 * https://www.codewars.com/kata/54da539698b8a2ad76000228/train/java
 * 6kyu
 */
public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        // Insert brilliant code here
        int y_direction = 0, x_direction = 0;

        if (walk.length == 10) {
            for (int i = 0; i < walk.length; i++) {
                switch (walk[i]) {
                    case 'n':
                        y_direction++;
                        break;
                    case 's':
                        y_direction--;
                        break;
                    case 'e':
                        x_direction++;
                        break;
                    case 'w':
                        x_direction--;
                        break;
                }
            }

            if (y_direction == 0 && x_direction == 0) {
                return true;
            }
        }
        return false;
    }
}
