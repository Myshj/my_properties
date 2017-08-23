package bindings.numeric.number_to_number;

import org.junit.Before;
import org.junit.Test;
import properties.numbers.DoubleProperty;
import properties.numbers.IntProperty;

import static org.junit.Assert.assertEquals;

public class CopyTest {
    private IntProperty intA;
    private IntProperty intB;
    private DoubleProperty doubleA;
    private DoubleProperty doubleB;

    private Copy binding;

    @Before
    public void setUp() throws Exception {
        intA = new IntProperty();
        intB = new IntProperty();
        doubleA = new DoubleProperty();
        doubleB = new DoubleProperty();

    }

    @Test
    public void transferIntToInt() throws Exception {
        binding = new Copy(intA, intB);
        intB.setValue(1);
        assertEquals(1, intA.getValue());
    }

    @Test
    public void transferDoubleToInt() throws Exception {
        binding = new Copy(intA, doubleB);
        doubleB.setValue(1.5);
        assertEquals(1, intA.getValue());
    }

    @Test
    public void transferIntToDouble() throws Exception {
        binding = new Copy(doubleA, intB);
        intB.setValue(1);
        assertEquals(1.0, doubleA.getValue(), 0.01);
    }

    @Test
    public void transferDoubleToDouble() throws Exception {
        binding = new Copy(doubleA, doubleB);
        doubleB.setValue(1.5);
        assertEquals(1.5, doubleA.getValue(), 0.01);
    }

}