package bindings.numeric;

import properties.numbers.NumberProperty;

/**
 * Base class for all bindings with numeric target.
 */
public abstract class Numeric extends bindings.PropertyBinding {
    protected NumberProperty target;

    public Numeric(NumberProperty target) {
        super();
        this.target = target;
        target.addListener(propertyListener);
    }

    public NumberProperty getTarget() {
        return target;
    }

}
