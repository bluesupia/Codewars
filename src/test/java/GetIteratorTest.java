import static org.junit.Assert.*;

import java.util.function.Function;

import org.junit.Test;

/**
 * Created by supersupa on 2016. 11. 4..
 */
public class GetIteratorTest {

    @Test
    public void testGetIterator() throws Exception {
        Function<Integer, Integer> getDouble = x -> x*2;
        Function<Integer, Integer> custDouble = GetIterator.getIterator(getDouble, 1);
        assertEquals("getDouble", (int)4, (int)custDouble.apply(2));
        Function<Integer, Integer> getQuadruple = GetIterator.getIterator(getDouble, 2);
        assertEquals("getQuadruple", (int)8, (int)getQuadruple.apply(2));
    }
}