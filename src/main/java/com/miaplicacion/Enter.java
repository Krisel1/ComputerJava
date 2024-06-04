package com.miaplicacion;

import java.util.Scanner;

public class enter {
    // Enter in your program
    Scanner scanner = new Scanner(System.in);
        while (true) {
        System.out.println("Select your program: ");
        System.out.print("ToDo List; Weather; File manager: ");
        String start = scanner.nextLine();
        if (start.equals("ToDo List")) {
            System.out.println("You entered ToDo List");
            break;
        } else if (start.equals("Weather")) {
            System.out.println("De momento esta app no functiona");
        } else if (start.equals("File Manager")) {
            System.out.println("De momento esta app no functiona");
        } else {
            System.out.println("You wrote something wrong");
        }
    }
        System.out.println("El ciclo ha cerrado");
    //Enter in your program (END)
}
