package bindings;

/**
 * Base class for all bindings.
 */
public abstract class Binding {
    /**
     * Executes binding.
     * Transfers data from source to target possibly with complex logic.
     */
    protected abstract void transfer();
}
