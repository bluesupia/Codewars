import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by supersupa on 2016. 12. 23..
 */
public class DeltaBitsTest {

    @Test
    public void test() throws Exception {
//        assertThat(DeltaBits.convertBits(31, 14), is(2));
        assertThat(DeltaBits.convertBits(7, 17), is(3));
//        assertThat(DeltaBits.convertBits(312312312, 5645657), is(8));;
    }
}