package bindings.numeric.two_numbers_to_number;

import org.junit.Before;
import org.junit.Test;
import properties.numbers.DoubleProperty;
import properties.numbers.IntProperty;

public abstract class NumericBindingTest {
    protected IntProperty intA;
    protected IntProperty intB;
    protected IntProperty intTarget;
    protected DoubleProperty doubleA;
    protected DoubleProperty doubleB;
    protected DoubleProperty doubleTarget;

    @Before
    public void setUp() throws Exception {
        intA = new IntProperty();
        intB = new IntProperty();
        intTarget = new IntProperty();
        doubleA = new DoubleProperty();
        doubleB = new DoubleProperty();
        doubleTarget = new DoubleProperty();
    }

    @Test
    public abstract void transferIntAndIntToInt() throws Exception;

    @Test
    public abstract void transferIntAndDoubleToInt() throws Exception;

    @Test
    public abstract void transferDoubleAndIntToDouble() throws Exception;

    @Test
    public abstract void transferDoubleAndDoubleToDouble() throws Exception;
}
