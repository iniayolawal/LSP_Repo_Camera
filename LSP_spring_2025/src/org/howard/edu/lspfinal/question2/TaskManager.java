package org.howard.edu.lspfinal.question2;

import java.util.*;

/**
 * TaskManager class manages the collection of tasks.
 * Provides methods for adding, retrieving, updating, and grouping tasks.
 */
public class TaskManager {
    private Map<String, Task> tasks = new HashMap<>();

    /**
     * Adds a new task to the manager.
     *
     * @param name     the name of the task
     * @param priority the priority of the task
     * @param status   the initial status of the task
     * @throws DuplicateTaskException if a task with the same name already exists
     */
    public void addTask(String name, int priority, String status) throws DuplicateTaskException {
        if (tasks.containsKey(name)) {
            throw new DuplicateTaskException("Task '" + name + "' already exists.");
        }
        tasks.put(name, new Task(name, priority, status));
    }

    /**
     * Retrieves a task by name.
     *
     * @param name the name of the task to retrieve
     * @return the Task object
     * @throws TaskNotFoundException if the task is not found
     */
    public Task getTaskByName(String name) throws TaskNotFoundException {
        Task task = tasks.get(name);
        if (task == null) {
            throw new TaskNotFoundException("Task '" + name + "' not found.");
        }
        return task;
    }

    /**
     * Updates the status of a specified task.
     *
     * @param name   the name of the task to update
     * @param status the new status to set
     * @throws TaskNotFoundException if the task does not exist
     */
    public void updateStatus(String name, String status) throws TaskNotFoundException {
        Task task = getTaskByName(name);
        task.setStatus(status);
    }

    /**
     * Prints all tasks grouped by their current status.
     * Groups include: TODO, IN_PROGRESS, and DONE.
     */
    public void printTasksGroupedByStatus() {
        Map<String, List<Task>> grouped = new HashMap<>();
        for (Task task : tasks.values()) {
            grouped.computeIfAbsent(task.getStatus(), k -> new ArrayList<>()).add(task);
        }

        System.out.println("Tasks grouped by status:");
        for (String status : List.of("TODO", "IN_PROGRESS", "DONE")) {
            System.out.println(status + ":");
            List<Task> taskList = grouped.getOrDefault(status, new ArrayList<>());
            for (Task task : taskList) {
                System.out.println("  " + task);
            }
        }
    }
}
