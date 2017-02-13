import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created by supersupa on 2017. 2. 13..
 *
 * 5kyu / Phone Directory
 * https://www.codewars.com/kata/56baeae7022c16dd7400086e/train/java
 */
public class PhoneDir {

    public static String phone(String strng, String num) {
        String regExpForPhone = "\\+\\d{1,2}-\\d{3}-\\d{3}-\\d{4}";
        String regExpForName = "\\<([a-z 'A-z])+\\>";
        String regExpForSpecial = ":|;|\\\\|/|\\$|\\*|!|,|\\?";

        String[] arr = Arrays.stream
                (strng.split("\n"))
                .filter(str -> str.indexOf("+"+num) > -1)
                .collect(Collectors.joining("\n"))
                .split("\n");

        String _phone = "", _name = "", _addr = "";

        if (arr.length == 1 && arr[0].length() == 0) return String.format("Error => Not found: %s", num);
        if (arr.length > 1) return String.format("Error => Too many people: %s", num);

        Pattern p = Pattern.compile(regExpForPhone);
        Matcher m = p.matcher(arr[0]);
        while(m.find()) {
            _phone = m.group().replaceAll("\\+", "");
        }

        p = Pattern.compile(regExpForName);
        m = p.matcher(arr[0]);
        while(m.find()) {
            _name = m.group().replaceAll("<|>", "");
        }
        _addr = arr[0]
                .replaceAll(regExpForPhone,"")
                .replaceAll(regExpForName, "")
                .replaceAll(regExpForSpecial, "")
                .replaceAll("_", " ")
                .replaceAll("\\s\\s", " ")
                .trim();

        return String.format(
                "Phone => %s, Name => %s, Address => %s", _phone, _name, _addr
        );
    }
}
