package bindings.numeric.many_numbers_to_number;

import bindings.numeric.Numeric;
import properties.numbers.NumberProperty;

/**
 * Base class for all numeric binding with many numeric sources.
 */
public abstract class ManyNumbersToNumber extends Numeric {
    public ManyNumbersToNumber(NumberProperty target) {
        super(target);
    }
}
