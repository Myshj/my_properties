package bindings.numeric.two_numbers_to_number;

import bindings.numeric.Numeric;
import properties.numbers.NumberProperty;

/**
 * Base class for all numeric bindings with two numeric sources.
 */
public abstract class TwoNumbersToNumber extends Numeric {
    NumberProperty left;
    NumberProperty right;

    public TwoNumbersToNumber(NumberProperty target, NumberProperty left, NumberProperty right) {
        super(target);
        this.left = left;
        left.addListener(propertyListener);
        this.right = right;
        right.addListener(propertyListener);
    }

    public NumberProperty getLeft() {
        return left;
    }

    public NumberProperty getRight() {
        return right;
    }
}
