/**
 * Created by supersupa on 2016. 12. 15..
 * https://www.codewars.com/kata/555615a77ebc7c2c8a0000b8/train/java
 */
public class Line {
    public static String Tickets(int[] peopleInLine) {
        //Your code is here...
        int pricePerTicket = 25;
        int sum = 0;
        for (int price : peopleInLine) {
            if (price != 25 && price != 50 && price != 100)
                return "NO";

            if (price > pricePerTicket) {
                if (sum < (price - pricePerTicket))
                    return "NO";
            }
            sum += pricePerTicket;
        }

        if (sum % pricePerTicket == 0) return "YES";
        else return "NO";
    }
}
