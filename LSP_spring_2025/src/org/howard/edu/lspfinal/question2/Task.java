package org.howard.edu.lspfinal.question2;

/**
 * Represents a Task with a unique name, a priority value, and a status.
 * Each task belongs to one of three statuses: "TODO", "IN_PROGRESS", or "DONE".
 */
public class Task {
    private String name;
    private int priority;
    private String status;

    /**
     * Constructs a new Task object.
     *
     * @param name     the unique name of the task
     * @param priority the task's priority level (lower number = higher priority)
     * @param status   the current status of the task
     */
    public Task(String name, int priority, String status) {
        this.name = name;
        this.priority = priority;
        this.status = status;
    }

    /**
     * Gets the task's name.
     *
     * @return the task name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the task's priority.
     *
     * @return the task priority
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Gets the current status of the task.
     *
     * @return the task status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status of the task.
     *
     * @param status the new status to assign to the task
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Returns a string representation of the task.
     *
     * @return string describing the task
     */
    @Override
    public String toString() {
        return "Task{name='" + name + "', priority=" + priority + ", status='" + status + "'}";
    }
}
