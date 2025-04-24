package org.howard.edu.lspfinal.question2;

/**
 * Exception thrown when a task cannot be found in the task list by name.
 */
public class TaskNotFoundException extends Exception {
    /**
     * Constructs a new TaskNotFoundException with the specified message.
     *
     * @param message the detail message explaining the exception
     */
    public TaskNotFoundException(String message) {
        super(message);
    }
}
