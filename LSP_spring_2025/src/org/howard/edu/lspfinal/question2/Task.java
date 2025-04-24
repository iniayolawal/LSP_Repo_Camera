package org.howard.edu.lspfinal.question2;

/**
 * Represents a task in the TaskManager system.
 * Each task has a unique name, a numeric priority (lower = higher priority),
 * and a status ("TODO", "IN_PROGRESS", or "DONE").
 */
public class Task {
    private String name;
    private int priority;
    private String status;

    /**
     * Constructs a new task with the given name, priority, and status.
     *
     * @param name the name of the task
     * @param priority the priority of the task
     * @param status the initial status of the task
     */
    public Task(String name, int priority, String status) {
        this.name = name;
        this.priority = priority;
        this.status = status;
    }

    /**
     * @return the task name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the priority of the task
     */
    public int getPriority() {
        return priority;
    }

    /**
     * @return the current status of the task
     */
    public String getStatus() {
        return status;
    }

    /**
     * Updates the task's status.
     *
     * @param status the new status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return string representation of the task
     */
    @Override
    public String toString() {
        return "Task{name='" + name + "', priority=" + priority + ", status='" + status + "'}";
    }
}
