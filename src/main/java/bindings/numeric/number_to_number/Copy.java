package bindings.numeric.number_to_number;

import properties.numbers.DoubleProperty;
import properties.numbers.NumberProperty;

/**
 * Copies value from source to target.
 */
public class Copy extends NumberToNumber {
    public Copy(NumberProperty target, NumberProperty source) {
        super(target, source);
    }

    protected void transfer() {
        if (source instanceof DoubleProperty || target instanceof DoubleProperty) {
            target.setFromDouble(source.doubleValue());
        } else {
            target.setFromInt(source.intValue());
        }
    }
}
