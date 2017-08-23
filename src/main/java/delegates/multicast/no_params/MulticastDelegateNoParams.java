package delegates.multicast.no_params;

import java.util.WeakHashMap;

/**
 * Simplest multicast delegate without parameters.
 * Holds weak references to its listeners so they don't need to be explicitly removed.
 */
public class MulticastDelegateNoParams {
    private WeakHashMap<MulticastDelegateNoParamsListener, Boolean> listeners;

    public MulticastDelegateNoParams() {
        listeners = new WeakHashMap<>();
    }

    /**
     * Adds listener.
     * All further invocations of the broadcast() method will also call call() method of this listener.
     *
     * @param listener listener to add.
     */
    public void add(MulticastDelegateNoParamsListener listener) {
        listeners.put(listener, true);
    }

    /**
     * Removes listener.
     * All further invocations of the broadcast() method will not call call() method of this listener.
     *
     * @param listener listener to remove.
     */
    public void remove(MulticastDelegateNoParamsListener listener) {
        listeners.remove(listener);
    }

    /**
     * Calls call() method of all bound listeners.
     */
    public void broadcast() {
        for (MulticastDelegateNoParamsListener listener : listeners.keySet()) {
            listener.call();
        }
    }
}
