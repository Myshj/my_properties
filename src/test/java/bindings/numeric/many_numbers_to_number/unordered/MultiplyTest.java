package bindings.numeric.many_numbers_to_number.unordered;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyTest extends UnorderedManyNumbersToNumberPropertyTest {
    @Before
    public void setUp() throws Exception {
        super.setUp();
        binding = new Multiply(target, set);
    }

    @Test
    public void transfer() throws Exception {
        a.setValue(2);
        b.setValue(3);
        assertEquals(6, target.getValue());
    }

}