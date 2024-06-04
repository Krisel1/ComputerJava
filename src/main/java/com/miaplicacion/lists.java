import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {

    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean running = true;

        while (running) {
            System.out.println("Select an option:");
            System.out.println("1. Do you want to add a task");
            System.out.println("2. Delete a task");
            System.out.println("3. Exit");

            input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.println("Ingrese la descripción de la tarea:");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Tarea agregada.");
                    break;
                case "2":
                    System.out.println("Ingrese el número de la tarea que desea eliminar:");
                    int taskNumber;
                    try {
                        taskNumber = Integer.parseInt(scanner.nextLine());
                        if (taskNumber > 0 && taskNumber <= tasks.size()) {
                            tasks.remove(taskNumber - 1);
                            System.out.println("Tarea eliminada.");
                        } else {
                            System.out.println("Número de tarea no válido.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada no válida. Por favor ingrese un número.");
                    }
                    break;
                case "3":
                    System.out.println("Lista de tareas:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    break;
            }
        }
        scanner.close();
    }
}
