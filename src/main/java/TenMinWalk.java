/**
 * Created by supersupa on 2017. 1. 4..
 * Take a Ten Minute Walk
 * https://www.codewars.com/kata/54da539698b8a2ad76000228/train/java
 * 6kyu
 */
public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        // Insert brilliant code here
        int cnt_n = 0, cnt_s = 0, cnt_e = 0, cnt_w = 0;

        if (walk.length == 10) {

            for (int i = 0; i < walk.length; i++) {
                switch (walk[i]) {
                    case 'n':
                        cnt_n++;
                        break;
                    case 's':
                        cnt_s++;
                        break;
                    case 'e':
                        cnt_e++;
                        break;
                    case 'w':
                        cnt_w++;
                        break;
                }
            }

            if (cnt_e == cnt_w && cnt_n == cnt_s) {
                return true;
            } else {
                return false;
            }
        } else
            return false;
    }
}
