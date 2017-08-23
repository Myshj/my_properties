package bindings;

import delegates.multicast.no_params.MulticastDelegateNoParamsListener;

/**
 * Base class for all property related bindings.
 */
public abstract class PropertyBinding extends Binding {
    /**
     * Called each time source properties changed.
     */
    protected PropertyListener propertyListener = new PropertyListener();

    protected class PropertyListener extends MulticastDelegateNoParamsListener {
        @Override
        public void call() {
            transfer();
        }
    }
}
