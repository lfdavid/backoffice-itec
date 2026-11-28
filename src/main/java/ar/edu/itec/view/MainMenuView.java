package ar.edu.itec.view;

public class MainMenuView {

    /** Muestra el menu y espera la opcion del usuario. */
    public void show() {
        int option;
        do {
            System.out.println();
            System.out.println("############################");
            System.out.println("#     BACKOFFICE ITEC      #");
            System.out.println("############################");
            System.out.println("0. Salir");
            option = readOption("Selecciona una Opción: ");
            if (option != 0) {
                System.out.println("ERROR: Opción Inválida");
            }
        } while (option != 0);
        System.out.println("Adiós!");
    }

    /** Lee un numero de opcion; si no es numerico devuelve -1. */
    private int readOption(String message) {
        try {
            return Integer.parseInt(ConsoleInput.readLine(message).trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
