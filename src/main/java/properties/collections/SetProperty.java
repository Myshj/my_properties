package properties.collections;

import delegates.multicast.no_params.MulticastDelegateNoParams;
import delegates.multicast.no_params.MulticastDelegateNoParamsListener;
import properties.Property;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

/**
 * Generic set property.
 * Has the same behaviour as HashSet.
 * Includes delegate for notifications about changes.
 * Changes include the next events:
 * 1. Element(-s) added.
 * 2. Element(-s) removed.
 * 3. Set cleared.
 * @param <E> type of elements to contain.
 */
public class SetProperty<E> extends HashSet<E> implements Property {

    private MulticastDelegateNoParams changedBroadcaster = new MulticastDelegateNoParams();

    public SetProperty() {
        super();
    }

    public SetProperty(Collection<? extends E> c) {
        super(c);
    }

    public SetProperty(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    public SetProperty(int initialCapacity) {
        super(initialCapacity);
    }

    public MulticastDelegateNoParams getChangedBroadcaster() {
        return changedBroadcaster;
    }

    @Override
    public boolean add(E e) {
        boolean success = super.add(e);
        if (success) {
            changedBroadcaster.broadcast();
        }
        return success;
    }

    @Override
    public boolean remove(Object o) {
        boolean success = super.remove(o);
        if (success) {
            changedBroadcaster.broadcast();
        }
        return success;
    }

    @Override
    public void clear() {
        super.clear();
        changedBroadcaster.broadcast();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean success = false;
        for (Object e : c) {
            success = remove(e) || success;
        }
        return success;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean success = false;
        for (E e : c) {
            success = add(e) || success;
        }
        return success;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean success = false;
        for (Object e : this) {
            if (!c.contains(e)) {
                remove(e);
                success = true;
            }
        }
        return success;
    }

    @Override
    public boolean removeIf(Predicate<? super E> filter) {
        boolean success = false;
        Object myCopy = this.clone();

        for (E e : (SetProperty<E>) myCopy) {
            if (filter.test(e)) {
                remove(e);
                success = true;
            }
        }
        return success;
    }

    @Override
    public void addListener(MulticastDelegateNoParamsListener listener) {
        changedBroadcaster.add(listener);
    }

    @Override
    public void removeListener(MulticastDelegateNoParamsListener listener) {
        changedBroadcaster.remove(listener);
    }
}
