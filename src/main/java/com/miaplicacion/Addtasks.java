package com.miaplicacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Addtasks {
    static ArrayList<String> tasks = new ArrayList<>();
    static void addTask() {
            System.out.print("Enter the new task: ");
            Scanner sc = new Scanner(System.in);
            String description = sc.nextLine();
            tasks.add(description);
            System.out.println("Task added successfully.");
            sc.close();
    }
}
