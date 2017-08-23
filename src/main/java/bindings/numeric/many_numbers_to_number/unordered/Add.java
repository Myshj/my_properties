package bindings.numeric.many_numbers_to_number.unordered;

import properties.numbers.NumberProperty;

import java.util.HashSet;

/**
 * Performs addition of many numbers.
 */
public class Add extends UnorderedManyNumbersToNumber {
    public Add(NumberProperty target, HashSet<NumberProperty> numbers) {
        super(target, numbers);
    }

    @Override
    protected void transfer() {
        double result = 0.0;
        for (NumberProperty number : numbers) {
            result += number.doubleValue();
        }
        target.setFromDouble(result);
    }
}
