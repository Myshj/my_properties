package bindings.numeric.two_numbers_to_number;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractTest extends NumericBindingTest {

    private Subtract binding;

    @Override
    @Test
    public void transferIntAndIntToInt() throws Exception {
        binding = new Subtract(intTarget, intA, intB);
        intA.setValue(2);
        intB.setValue(1);
        assertEquals(1, intTarget.getValue());
    }

    @Override
    @Test
    public void transferIntAndDoubleToInt() throws Exception {
        binding = new Subtract(intTarget, intA, doubleB);
        intA.setValue(3);
        doubleB.setValue(1.5);
        assertEquals(1, intTarget.getValue());
    }

    @Override
    @Test
    public void transferDoubleAndIntToDouble() throws Exception {
        binding = new Subtract(doubleTarget, doubleA, intB);
        doubleA.setValue(2.5);
        intB.setValue(1);
        assertEquals(1.5, doubleTarget.getValue(), 0.01);
    }

    @Override
    @Test
    public void transferDoubleAndDoubleToDouble() throws Exception {
        binding = new Subtract(doubleTarget, doubleA, doubleB);
        doubleA.setValue(2.5);
        doubleB.setValue(1.5);
        assertEquals(1.0, doubleTarget.getValue(), 0.01);
    }

}