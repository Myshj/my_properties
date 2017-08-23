package bindings.numeric.number_to_number;

import bindings.numeric.Numeric;
import properties.numbers.NumberProperty;

/**
 * Base class for all numeric bindings with one numeric source.
 */
public abstract class NumberToNumber extends Numeric {
    protected NumberProperty source;

    public NumberToNumber(NumberProperty target, NumberProperty source) {
        super(target);
        this.source = source;
        source.addListener(propertyListener);
    }

    public NumberProperty getSource() {
        return source;
    }
}
