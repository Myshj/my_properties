package properties.collections;

import delegates.multicast.no_params.MulticastDelegateNoParamsListener;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.function.Predicate;

import static org.junit.Assert.assertEquals;

public class SetPropertyTest {
    private SetProperty<Object> set;
    private TestSimpleListener changedListener;

    private Integer firstValue = 1;
    private Integer secondValue = 2;

    @Before
    public void setUp() throws Exception {
        set = new SetProperty<>();
        changedListener = new TestSimpleListener();
        set.addListener(changedListener);
    }

    @Test
    public void add() throws Exception {
        set.add(firstValue);
        assertEquals(1, set.size());
    }

    @Test
    public void onAddedChangedBroadcasterCalled() throws Exception {
        set.add(firstValue);
        assertEquals(true, changedListener.isCalled());
    }

    @Test
    public void remove() throws Exception {
        set.add(firstValue);
        set.remove(firstValue);
        assertEquals(0, set.size());
    }

    @Test
    public void onRemovedChangedBroadcasterCalled() throws Exception {
        set.add(firstValue);
        changedListener.setCalled(false);
        set.remove(firstValue);
        assertEquals(true, changedListener.isCalled());
    }

    @Test
    public void clear() throws Exception {
        set.add(firstValue);
        set.clear();
        assertEquals(0, set.size());
    }

    @Test
    public void onClearedChangedBroadcasterCalled() throws Exception {
        set.add(firstValue);
        changedListener.setCalled(false);
        set.clear();
        assertEquals(true, changedListener.isCalled());
    }

    @Test
    public void removeAll() throws Exception {
        set.add(firstValue);
        set.add(secondValue);
        HashSet<Object> setToRemove = new HashSet<>();
        setToRemove.add(firstValue);
        setToRemove.add(secondValue);
        set.removeAll(setToRemove);
        assertEquals(0, set.size());
    }

    @Test
    public void addAll() throws Exception {
        HashSet<Object> setToAdd = new HashSet<>();
        setToAdd.add(firstValue);
        setToAdd.add(secondValue);
        set.addAll(setToAdd);
        assertEquals(2, set.size());
    }

    @Test
    public void retainAll() throws Exception {
        HashSet<Object> setToRetain = new HashSet<>();
        setToRetain.add(firstValue);
        set.add(firstValue);
        set.add(secondValue);
        set.retainAll(setToRetain);
        assertEquals(1, set.size());
    }

    @Test
    public void removeIf() throws Exception {
        set.add(firstValue);
        set.add(secondValue);
        set.removeIf(new TestSimplePredicate());
        assertEquals(0, set.size());
    }

    class TestSimpleListener extends MulticastDelegateNoParamsListener {
        private boolean called = false;

        public boolean isCalled() {
            return called;
        }

        public void setCalled(boolean called) {
            this.called = called;
        }

        @Override
        public void call() {
            called = true;
        }
    }

    class TestSimplePredicate implements Predicate<Object> {
        @Override
        public boolean test(Object o) {
            return true;
        }
    }

}