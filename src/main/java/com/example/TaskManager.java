package com.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();
    private int taskIdCounter = 1;

    public List<Task> getTasks() {
        return tasks;
    }

    public void addTask(String description, LocalDate dueDate) {
        Task task = new Task(taskIdCounter++, description, dueDate);
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    public void deleteTask(int id) {
        tasks.removeIf(task -> task.getId() == id);
        System.out.println("Task ID " + id + " deleted.");
    }

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Task\n2. View Tasks\n3. Delete Task\n4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter task description:");
                    String description = scanner.nextLine();
                    System.out.println("Enter task due date (yyyy-mm-dd):");
                    LocalDate dueDate = LocalDate.parse(scanner.nextLine());
                    manager.addTask(description, dueDate);
                    break;
                case 2:
                    manager.viewTasks();
                    break;
                case 3:
                    System.out.println("Enter task ID to delete:");
                    int id = scanner.nextInt();
                    manager.deleteTask(id);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
