package bindings.numeric.two_numbers_to_number;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddTest extends NumericBindingTest {

    private Add binding;

    @Override
    @Test
    public void transferIntAndIntToInt() throws Exception {
        binding = new Add(intTarget, intA, intB);
        intB.setValue(1);
        intA.setValue(1);
        assertEquals(2, intTarget.getValue());
    }

    @Override
    @Test
    public void transferIntAndDoubleToInt() throws Exception {
        binding = new Add(intTarget, intA, doubleB);
        intA.setValue(1);
        doubleB.setValue(1.5);
        assertEquals(2, intTarget.getValue());
    }

    @Override
    @Test
    public void transferDoubleAndIntToDouble() throws Exception {
        binding = new Add(doubleTarget, doubleA, intB);
        doubleA.setValue(1.5);
        intB.setValue(1);
        assertEquals(2.5, doubleTarget.getValue(), 0.01);
    }

    @Override
    @Test
    public void transferDoubleAndDoubleToDouble() throws Exception {
        binding = new Add(doubleTarget, doubleA, doubleB);
        doubleA.setValue(1.5);
        doubleB.setValue(1.5);
        assertEquals(3.0, doubleTarget.getValue(), 0.01);
    }

}