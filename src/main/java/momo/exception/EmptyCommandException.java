package momo.exception;

/**
 * Thrown when user gives empty or null command.
 */
public class EmptyCommandException extends MomoException {
    public EmptyCommandException() {
        super("I dare you to leave an empty command again...");
    }

}
