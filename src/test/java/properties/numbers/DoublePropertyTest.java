package properties.numbers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoublePropertyTest {
    private DoubleProperty number;

    @Before
    public void setUp() throws Exception {
        number = new DoubleProperty();
    }

    @Test
    public void getValue() throws Exception {
        assertEquals(0.0, number.getValue(), 0.01);
    }

    @Test
    public void setValue() throws Exception {
        number.setValue(1.5);
        assertEquals(1.5, number.getValue(), 0.01);
    }

    @Test
    public void getAsDouble() throws Exception {
        assertEquals(0.0, number.doubleValue(), 0.01);
    }

    @Test
    public void setFromDouble() throws Exception {
        number.setFromDouble(1.5);
        assertEquals(1.5, number.getValue(), 0.01);
    }

    @Test
    public void getAsInt() throws Exception {
        assertEquals(0, number.intValue());
    }

    @Test
    public void setFromInt() throws Exception {
        number.setFromInt(1);
        assertEquals(1.0, number.getValue(), 0.01);
    }

}