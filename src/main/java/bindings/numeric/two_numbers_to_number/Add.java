package bindings.numeric.two_numbers_to_number;

import properties.numbers.DoubleProperty;
import properties.numbers.NumberProperty;

/**
 * Performs addition of two numbers.
 */
public class Add extends TwoNumbersToNumber {
    public Add(NumberProperty target, NumberProperty left, NumberProperty right) {
        super(target, left, right);
    }

    @Override
    protected void transfer() {
        if (left instanceof DoubleProperty || right instanceof DoubleProperty) {
            target.setFromDouble(left.doubleValue() + right.doubleValue());
        } else {
            target.setFromInt(left.intValue() + right.intValue());
        }
    }
}
