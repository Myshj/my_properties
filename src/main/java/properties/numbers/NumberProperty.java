package properties.numbers;

import delegates.multicast.no_params.MulticastDelegateNoParams;
import delegates.multicast.no_params.MulticastDelegateNoParamsListener;
import properties.Property;
import properties.numbers.interfaces.SettableNumber;

/**
 * Base class for all numeric properties.
 */
public abstract class NumberProperty extends Number implements Property, SettableNumber {
    MulticastDelegateNoParams changedBroadcaster = new MulticastDelegateNoParams();

    @Override
    public void addListener(MulticastDelegateNoParamsListener listener) {
        changedBroadcaster.add(listener);
    }

    @Override
    public void removeListener(MulticastDelegateNoParamsListener listener) {
        changedBroadcaster.remove(listener);
    }

    @Override
    public MulticastDelegateNoParams getChangedBroadcaster() {
        return changedBroadcaster;
    }
}
