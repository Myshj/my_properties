package properties;

import delegates.multicast.no_params.MulticastDelegateNoParams;

/**
 * Represents ability to be changed and notify about that.
 */
public interface Changeable {
    MulticastDelegateNoParams getChangedBroadcaster();
}
