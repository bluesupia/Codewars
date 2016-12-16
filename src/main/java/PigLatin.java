/**
 * Created by supersupa on 2016. 11. 11..
 * https://www.codewars.com/kata/558878ab7591c911a4000007/train/java
 */
public class PigLatin {
    public String translate(String str) {
        System.out.println(str.matches(".*[0-9].*"));
        if(str.matches(".*[0-9].*")) return null;

        String result = "";
        String[] arr = str.split("");

        int i=0;
        for (; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i].equals("a") || arr[i].equals("e") || arr[i].equals("i") || arr[i].equals("o") || arr[i].equals("u")) {
                if (i == 0) result = "w";
                break;
            } else {
                result = result + arr[i];

            }
        }

        return str.toLowerCase().substring(i)+result + "ay";
    }
}
