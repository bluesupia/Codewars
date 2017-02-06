import java.util.Stack;

/**
 * Created by supersupa on 2017. 2. 6..
 *
 * 4kyu / Valid Braces
 * https://www.codewars.com/kata/5277c8a221e209d3f6000b56/train/java
 */
public class BraceChecker {
    public boolean isValid(String braces) {
        Stack<String> stack = new Stack<>();
        String s1 = "";
        String s2 = "";

        for (int i = 0; i < braces.length(); i++) {
            s1 = "" + braces.charAt(i);
            if ( s1.equals("(") || s1.equals("{") || s1.equals("[")) {
                stack.push("" + braces.charAt(i));
            } else {
                if (stack.empty()) return false;
                s2 = stack.pop();
                if ( !((s2.equals("(") && s1.equals(")")) || (s2.equals("{") && s1.equals("}")) || (s2.equals("[") && s1.equals("]"))) ) {
                    return false;
                }
            }
        }

        if (stack.empty())
            return true;
        else
            return false;

    }
}
