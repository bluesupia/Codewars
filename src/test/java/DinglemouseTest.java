import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by supersupa on 2017. 1. 17..
 */
public class DinglemouseTest {
    @Test
    public void basic() {
        final String expected =
                "    10\n"+
                "    #\n"+
                "    #\n"+
                "7   #\n"+
                "#   #\n"+
                "#   #     5\n"+
                "#   #     #\n"+
                "# 3 #     #\n"+
                "# # #     #\n"+
                "# # # 1   #\n"+
                "# # # #   #\n"+
                "-----------\n"+
                "1 2 3 4 5 6\n";
        assertEquals(expected, Dinglemouse.histogram(new int[]{7,3,10,1,0,5}));
    }

    @Test
    public void test() {
        String result = Dinglemouse.histogram(new int[]{0, 0, 0, 0, 0, 0});
        System.out.println(result);


//        String result = Dinglemouse.histogram(new int[]{9, 5, 11, 13, 4, 8});
//        System.out.println(result);
    }
}