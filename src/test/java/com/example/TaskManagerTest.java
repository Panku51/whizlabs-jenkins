package com.example;

import java.time.LocalDate;
import static org.junit.Assert.*;
import org.junit.Test;

public class TaskManagerTest {

    @Test
    public void testAddTask() {
        TaskManager manager = new TaskManager();
        manager.addTask("Complete project", LocalDate.of(2024, 9, 30));
        assertEquals(1, manager.getTasks().size());  // Access the tasks list via the getter
    }

    @Test
    public void testDeleteTask() {
        TaskManager manager = new TaskManager();
        manager.addTask("Complete project", LocalDate.of(2024, 9, 30));
        manager.deleteTask(1);
        assertEquals(0, manager.getTasks().size());  // Access the tasks list via the getter
    }
}

