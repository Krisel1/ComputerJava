package com;
public class deleteTask {
    
    static void deleteTask() {
        System.out.print("Enter the task number to delete: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // Clear the buffer
    
        if (index >= 0 && index < counter) {
            for (int i = index; i < counter - 1; i++) {
                tasks[i] = tasks[i + 1];
                completed[i] = completed[i + 1];
            }
            tasks[counter - 1] = null;
            completed[counter - 1] = false;
            counter--;
            System.out.println("Task deleted successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }
    
}
