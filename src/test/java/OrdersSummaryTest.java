import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by supersupa on 2016. 11. 15..
 */
public class OrdersSummaryTest {

    @Test
    public void testBalanceStatements() throws Exception {

    }

    @Test
    public void test1() {
//        String l = "ZNGA 1300 2.66 B, CLH15.NYM 50 56.32 B, OWW 1000 11.623 B, OGG 20 580.1 B";
        String l = "ZNGA 1300 2.66 ;";
        assertEquals("Buy: 29499 Sell: 0",
            OrdersSummary.balanceStatements(l));
    }
}