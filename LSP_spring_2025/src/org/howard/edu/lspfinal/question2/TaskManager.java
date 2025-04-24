package org.howard.edu.lspfinal.question2;

import java.util.*;

public class TaskManager {
    private Map<String, Task> tasks = new HashMap<>();

    public void addTask(String name, int priority, String status) throws DuplicateTaskException {
        if (tasks.containsKey(name)) {
            throw new DuplicateTaskException("Task '" + name + "' already exists.");
        }
        tasks.put(name, new Task(name, priority, status));
    }

    public Task getTaskByName(String name) throws TaskNotFoundException {
        Task task = tasks.get(name);
        if (task == null) {
            throw new TaskNotFoundException("Task '" + name + "' not found.");
        }
        return task;
    }

    public void updateStatus(String name, String status) throws TaskNotFoundException {
        Task task = getTaskByName(name);
        task.setStatus(status);
    }

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
