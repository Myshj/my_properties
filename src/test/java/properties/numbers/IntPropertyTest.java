package properties.numbers;

import static org.junit.Assert.assertEquals;

public class IntPropertyTest {
    private IntProperty int32;

    @org.junit.Before
    public void setUp() throws Exception {
        int32 = new IntProperty();
    }

    @org.junit.Test
    public void getValue() throws Exception {
        assertEquals(0, int32.getValue());
    }

    @org.junit.Test
    public void setValue() throws Exception {
        int32.setValue(1);
        assertEquals(1, int32.getValue());
    }

    @org.junit.Test
    public void getAsDouble() throws Exception {
        assertEquals(0.0, int32.doubleValue(), 0.01);
    }

    @org.junit.Test
    public void setFromDouble() throws Exception {
        int32.setFromDouble(1.5);
        assertEquals(1.0, int32.doubleValue(), 0.01);
    }

    @org.junit.Test
    public void getAsInt() throws Exception {
        assertEquals(0, int32.intValue());
    }

    @org.junit.Test
    public void setFromInt() throws Exception {
        int32.setFromInt(1);
        assertEquals(1, int32.intValue());
    }

}