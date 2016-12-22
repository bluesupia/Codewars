/**
 * Created by supersupa on 2016. 12. 22..
 * Human Readable Time
 * https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java
 * 5kyu
 */
public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int _hours = seconds / 3600;
        int _minutes = (seconds % 60) / 60;
        int _seconds = (seconds % 60);
        return String.format("%02d:%02d:%02d", _hours, _minutes, _seconds);
    }
}
