package properties;

import delegates.multicast.no_params.MulticastDelegateNoParamsListener;

/**
 * Base interface for all properties.
 */
public interface Property extends Changeable {

    /**
     * Shortcut to getChangedBroadcaster().add()
     * Adds listener to changedBroadcaster.
     *
     * @param listener listener to add
     */
    void addListener(MulticastDelegateNoParamsListener listener);

    /**
     * Shortcut to getChangedBroadcaster().remove()
     * Removes listener from changedBroadcaster.
     *
     * @param listener listener to remove.
     */
    void removeListener(MulticastDelegateNoParamsListener listener);
}
