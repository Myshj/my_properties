package bindings.numeric.number_to_number;

import properties.numbers.DoubleProperty;
import properties.numbers.NumberProperty;

/**
 * Copies negated value from source to target.
 */
public class Negate extends NumberToNumber {
    public Negate(NumberProperty target, NumberProperty source) {
        super(target, source);
    }

    protected void transfer() {
        if (source instanceof DoubleProperty || target instanceof DoubleProperty) {
            target.setFromDouble(-source.doubleValue());
        } else {
            target.setFromInt(-source.intValue());
        }
    }
}
