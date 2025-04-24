package org.howard.edu.lspfinal.question2;

/**
 * Exception thrown when attempting to add a task that already exists in the task list.
 */
public class DuplicateTaskException extends Exception {
    /**
     * Constructs a new DuplicateTaskException with the specified message.
     *
     * @param message the detail message explaining the exception
     */
    public DuplicateTaskException(String message) {
        super(message);
    }
}
