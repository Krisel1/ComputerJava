package com.miaplicacion;



public class ToDoList {

    static final int MAX_TAREAS = 100;
    static String[] tareas = new String[MAX_TAREAS];
    static boolean[] completadas = new boolean[MAX_TAREAS];
    static int contadorTareas = 0;

    public static void agregarTarea(String nuevaTarea) {
        if (contadorTareas < MAX_TAREAS) {
            tareas[contadorTareas] = nuevaTarea;
            completadas[contadorTareas] = false;
            contadorTareas++;
            System.out.println("Tarea agregada exitosamente.");
        } else {
            System.out.println("Error: No se pueden agregar más tareas.");
        }
    }

    public static void listarTareas() {
        System.out.println("\nLista de Tareas:");
        for (int i = 0; i < contadorTareas; i++) {
            String estado = completadas[i] ? "[Completada]" : "[Pendiente]";
            System.out.println(i + ". " + tareas[i] + " " + estado);
        }
    }

    public static void marcarTareaComoCompletada(int indice) {
        if (indice >= 0 && indice < contadorTareas) {
            completadas[indice] = true;
            System.out.println("Tarea marcada como completada.");
        } else {
            System.out.println("Índice no válido.");
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso del método agregarTarea
        agregarTarea("Tarea 1");
        agregarTarea("Tarea 2");
        
        // Listar las tareas para verificar que se han agregado correctamente
        listarTareas();
        
        // Marcar la primera tarea como completada
        marcarTareaComoCompletada(0);
        
        // Listar las tareas para verificar que se ha marcado correctamente
        listarTareas();
    }
}




