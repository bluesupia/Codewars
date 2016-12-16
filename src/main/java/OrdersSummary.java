import java.util.function.DoubleFunction;

/**
 * Created by supersupa on 2016. 11. 15..
 * https://www.codewars.com/kata/54de3257f565801d96001200/train/java
 */
public class OrdersSummary {
    public static String balanceStatements(String lst) {
        String[] arr1 = lst.split(", ");
        double buyPrice = 0D;
        double sellPrice = 0D;
        for (int i=0; i < arr1.length; i++) {
            String[] arr2 = arr1[i].split(" ");
            if (arr2.length == 4) {
                if (arr2[3].equals("B")) {
                    buyPrice += Double.valueOf(arr2[1]) * Double.valueOf(arr2[2]);
                } else if (arr2[3].equals("S")) {
                    sellPrice += Double.valueOf(arr2[1]) * Double.valueOf(arr2[2]);
                }
            }
        }
        return String.format("Buy: %d Sell: %d", (long) buyPrice, (long)sellPrice);
    }
}
