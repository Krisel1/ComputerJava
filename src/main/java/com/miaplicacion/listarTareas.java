
static void listarTareas() {
    System.out.println("Lista de Tareas:");
    for (int i = 0; i < contador; i++) {
        String estado = completadas[i] ? "[X]" : "[ ]";
        System.out.println((i + 1) + ". " + estado + " " + tareas[i]);
    }
}

static void marcarTareaCompletada() {
    System.out.print("Ingrese el número de la tarea a marcar como completada: ");
    int indice = scanner.nextInt() - 1;
    scanner.nextLine(); // Limpiar el buffer

    if (indice >= 0 && indice < contador) {
        completadas[indice] = true;
        System.out.println("Tarea marcada como completada.");
    } else {
        System.out.println("Índice inválido.");
    }
}
