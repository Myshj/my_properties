package bindings.numeric.many_numbers_to_number.unordered;

import bindings.numeric.many_numbers_to_number.ManyNumbersToNumber;
import properties.numbers.NumberProperty;

import java.util.HashSet;

/**
 * Base class for all numeric bindings with many source and unimportant order operation execution.
 */
public abstract class UnorderedManyNumbersToNumber extends ManyNumbersToNumber {
    protected HashSet<NumberProperty> numbers;

    public UnorderedManyNumbersToNumber(NumberProperty target, HashSet<NumberProperty> numbers) {
        super(target);
        this.numbers = numbers;
        for (NumberProperty number : numbers) {
            number.addListener(propertyListener);
        }
    }
}
