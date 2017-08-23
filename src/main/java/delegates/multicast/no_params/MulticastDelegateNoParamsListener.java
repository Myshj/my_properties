package delegates.multicast.no_params;

/**
 * Base class for all listeners of MulticastDelegateNoParams.
 */
public abstract class MulticastDelegateNoParamsListener {

    /**
     * Invoked when broadcast() method of bound delegate called.
     */
    public abstract void call();
}
