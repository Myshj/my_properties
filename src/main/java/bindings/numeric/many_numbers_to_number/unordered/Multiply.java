package bindings.numeric.many_numbers_to_number.unordered;

import properties.numbers.NumberProperty;

import java.util.HashSet;

/**
 * Performs multiplication of many numbers.
 */
public class Multiply extends UnorderedManyNumbersToNumber {
    public Multiply(NumberProperty target, HashSet<NumberProperty> numbers) {
        super(target, numbers);
    }

    @Override
    protected void transfer() {
        double result = 1.0;
        for (NumberProperty number : numbers) {
            result *= number.doubleValue();
        }
        target.setFromDouble(result);
    }
}
