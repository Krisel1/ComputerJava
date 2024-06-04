package com.miaplicacion;

import java.util.Scanner;

public class Enter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select your program: ");
            System.out.print("ToDo List; Weather; File manager: ");
            String start = scanner.nextLine();
            if (start.equals("ToDo List")) {
                System.out.println("You entered ToDo List");
                break;
            } else
                if (start.equals("Weather")) {
                System.out.println("De momento esta app no functiona");
            } else
                if (start.equals("File Manager")) {
                System.out.println("De momento esta app no functiona");
            } else {
                System.out.println("You wrote something wrong");
            }
        }
        System.out.println("Cicle is closed");

        int exitList = 0;
        while (exitList == 0) {
            System.out.println("Select: (Delete) (Create) (List) (Exit)");
            int enterDeleat = 0;
            int enterCreat = 0;
            int enterList = 0;
            while (true) {
                String start = scanner.nextLine();
                if (start.equals("Delete")) {
                    enterDeleat++;
                    break;
                }
                if (start.equals("Create")) {
                    enterCreat++;
                    break;
                }
                if (start.equals("Exit")) {
                    exitList++;
                    break;
                } else if (start.equals("List")) {
                    enterList++;
                    break;
                } else {
                    System.out.println("You wrote something wrong");
                }
            }
            if (enterDeleat == 1) {
                System.out.println("You entered Delete");
            }
            if (enterCreat == 1) {
                System.out.println("You entered Create");
            }
            if (enterList == 1) {
                System.out.println("You entered List");
            }
        }
        scanner.close();
    }
}
