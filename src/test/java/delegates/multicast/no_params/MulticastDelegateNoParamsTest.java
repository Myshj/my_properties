package delegates.multicast.no_params;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MulticastDelegateNoParamsTest {
    private MulticastDelegateNoParams delegate;
    private TestListener listener;
    private int testValueToChange;

    @Before
    public void setUp() throws Exception {
        delegate = new MulticastDelegateNoParams();
        listener = new TestListener();

        testValueToChange = 0;
    }

    @Test
    public void add() throws Exception {
        delegate.add(listener);
        delegate.broadcast();
        assertEquals(1, testValueToChange);
    }

    @Test
    public void remove() throws Exception {
        delegate.add(listener);
        delegate.remove(listener);
        delegate.broadcast();
        assertEquals(0, testValueToChange);
    }

    @Test
    public void broadcast() throws Exception {
        delegate.add(listener);
        delegate.broadcast();
        assertEquals(1, testValueToChange);
    }

    class TestListener extends MulticastDelegateNoParamsListener {
        @Override
        public void call() {
            testValueToChange = 1;
        }
    }

}