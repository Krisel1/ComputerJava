package orderlist;

import java.util.Scanner;

public class ToDoList {
    static String[] tareas = new String[100];
    static boolean[] completadas = new boolean[100];
    static int contador = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            ejecutarOpcion(opcion);
        } while (opcion != 5);

        System.out.println("Saliendo de la aplicación...");
    }

    static void mostrarMenu() {
        System.out.println("Bienvenido a la ToDo List");
        System.out.println("=========================");
        System.out.println("1. Agregar Tarea");
        System.out.println("2. Eliminar Tarea");
        System.out.println("3. Listar Tareas");
        System.out.println("4. Marcar Tarea como Completada");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                agregarTarea();
                break;
            case 2:
                eliminarTarea();
                break;
            case 3:
                listarTareas();
                break;
            case 4:
                marcarTareaCompletada();
                break;
            case 5:
                // Salir
                break;
            default:
                System.out.println("Opción inválida. Intente nuevamente.");
        }
    }
}
