import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by supersupa on 2017. 2. 10..
 */
public class PowerSumDigTest {
    private static void testing(long act, long exp) {
        assertEquals(exp, act);
    }
    @Test
    public void test1() {
//        testing(PowerSumDig.powerSumDigTerm(1), 81); //=> 9
//        testing(PowerSumDig.powerSumDigTerm(2), 512); //=> 8
//        testing(PowerSumDig.powerSumDigTerm(3), 2401); //=> 7
//        testing(PowerSumDig.powerSumDigTerm(4), 4913); //=> 17
//        testing(PowerSumDig.powerSumDigTerm(5), 5832); //=> 18
//        testing(PowerSumDig.powerSumDigTerm(6), 17576); //=> 17
        testing(PowerSumDig.powerSumDigTerm(30), 248155780267521);
    }

}