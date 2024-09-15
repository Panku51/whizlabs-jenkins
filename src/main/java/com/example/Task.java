package com.example;

import java.time.LocalDate;

public class Task {
    private int id;
    private String description;
    private LocalDate dueDate;

    public Task(int id, String description, LocalDate dueDate) {
        this.id = id;
        this.description = description;
        this.dueDate = dueDate;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    @Override
    public String toString() {
        return "Task ID: " + id + ", Description: " + description + ", Due Date: " + dueDate;
    }
}

