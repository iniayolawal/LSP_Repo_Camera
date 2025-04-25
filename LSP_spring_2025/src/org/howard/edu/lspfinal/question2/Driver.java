/**
 * Name: Inioluwa Ayo-Lawal
 */
package org.howard.edu.lspfinal.question2;

/**
 * Custom driver to demonstrate TaskManager functionality
 * using original task names and scenarios.
 */
public class Driver {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        System.out.println("=== Adding Tasks ===");
        try {
            manager.addTask("Code Review", 2, "TODO");
            manager.addTask("Design Meeting", 1, "IN_PROGRESS");
            manager.addTask("Update Roadmap", 3, "TODO");
        } catch (DuplicateTaskException e) {
            System.out.println("Duplicate error: " + e.getMessage());
        }

        System.out.println("\n=== Trying to Add Duplicate Task ===");
        try {
            manager.addTask("Code Review", 5, "DONE");
        } catch (DuplicateTaskException e) {
            System.out.println("Duplicate error: " + e.getMessage());
        }

        System.out.println("\n=== Retrieving a Task ===");
        try {
            Task task = manager.getTaskByName("Design Meeting");
            System.out.println("Retrieved Task: " + task);
        } catch (TaskNotFoundException e) {
            System.out.println("Retrieval error: " + e.getMessage());
        }

        System.out.println("\n=== Updating Task Status ===");
        try {
            manager.updateStatus("Update Roadmap", "DONE");
            manager.updateStatus("Nonexistent", "TODO");
        } catch (TaskNotFoundException e) {
            System.out.println("Update error: " + e.getMessage());
        }

        System.out.println("\n=== Printing All Tasks by Status ===");
        manager.printTasksGroupedByStatus();
    }
}
