package com.miaplicacion;

public class tasks {
    static void addTask() {
        if (counter < 100) {
            System.out.print("Enter the description of the new task: ");
            String description = scanner.nextLine();
            tasks[counter] = description;
            completed[counter] = false;
            counter++;
            System.out.println("Task added successfully.");
        } else {
            System.out.println("The task list is full.");
        }
    }
}
