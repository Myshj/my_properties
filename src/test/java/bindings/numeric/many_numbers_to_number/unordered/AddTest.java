package bindings.numeric.many_numbers_to_number.unordered;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddTest extends UnorderedManyNumbersToNumberPropertyTest {

    @Override
    public void setUp() throws Exception {
        super.setUp();
        binding = new Add(target, set);
    }

    @Override
    @Test
    public void transfer() throws Exception {
        a.setValue(2);
        b.setValue(2);
        assertEquals(4, target.getValue());
    }

}