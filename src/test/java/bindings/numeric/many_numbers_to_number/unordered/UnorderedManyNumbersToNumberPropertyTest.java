package bindings.numeric.many_numbers_to_number.unordered;

import org.junit.Before;
import org.junit.Test;
import properties.numbers.IntProperty;
import properties.numbers.NumberProperty;

import java.util.HashSet;

public abstract class UnorderedManyNumbersToNumberPropertyTest {
    IntProperty a;
    IntProperty b;
    IntProperty target;
    UnorderedManyNumbersToNumber binding;
    HashSet<NumberProperty> set = new HashSet<>();

    @Before
    public void setUp() throws Exception {
        a = new IntProperty();
        b = new IntProperty();
        target = new IntProperty();
        set.add(a);
        set.add(b);
    }

    @Test
    public abstract void transfer() throws Exception;
}
