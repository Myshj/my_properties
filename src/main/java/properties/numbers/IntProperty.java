package properties.numbers;

/**
 * Integer property.
 */
public class IntProperty extends NumberProperty {
    private int value;

    public IntProperty() {
        this.value = 0;
    }

    public IntProperty(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (this.value == value) {
            return;
        }
        this.value = value;
        changedBroadcaster.broadcast();
    }

    public double doubleValue() {
        return getValue();
    }

    public void setFromDouble(double value) {
        int newValue = (int) value;
        setValue(newValue);
    }

    public int intValue() {
        return getValue();
    }

    @Override
    public long longValue() {
        return (long) value;
    }

    @Override
    public float floatValue() {
        return (float) value;
    }

    public void setFromInt(int value) {
        setValue(value);
    }
}
