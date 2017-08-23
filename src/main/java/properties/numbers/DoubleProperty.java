package properties.numbers;

/**
 * Double property.
 */
public class DoubleProperty extends NumberProperty {
    private double value;

    public DoubleProperty() {
        this.value = 0;
    }

    public DoubleProperty(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
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
        setValue(value);
    }

    public int intValue() {
        return (int) getValue();
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
