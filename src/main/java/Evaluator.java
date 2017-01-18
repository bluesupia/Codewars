/**
 * Created by supersupa on 2016. 12. 23..
 * Evaluate a postfix expression
 * https://www.codewars.com/kata/577e9095d648a15b800000d4/train/java
 * 5kyu
 */
public class Evaluator {
    public long evaluate(String s) {
        // write your magic code here

        String[] arr = s.split(" ");

        int max = (arr.length + 1) / 2;

        int result = Integer.valueOf(arr[0]);
        for (int i = 1; i < max; i++) {
            String mathStr = arr[i+max-1];
            switch (mathStr) {
                case "+" :
                    result = result + Integer.valueOf(arr[i]);
                    break;
                case "*" :
                    result = result * Integer.valueOf(arr[i]);
                    break;
                case "/" :
                    result = result / Integer.valueOf(arr[i]);
                    break;

            }
        }
        return result;
    }
}
