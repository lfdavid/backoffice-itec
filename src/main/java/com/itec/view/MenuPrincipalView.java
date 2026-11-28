package com.itec.view;

/**
 * Menu principal minimo de la etapa base.
 *
 * <p>Se repite hasta que el usuario elige salir. En la rama feature/auth se
 * agregara el filtrado por rol; en cada rama feature/* se agregara una
 * opcion que delegue en la vista correspondiente.
 */
public class MenuPrincipalView {

    /** Muestra el menu y espera la opcion del usuario. */
    public void mostrar() {
        int opcion;
        do {
            System.out.println();
            System.out.println("############################");
            System.out.println("#     BACKOFFICE ITEC      #");
            System.out.println("############################");
            System.out.println("0. Salir");
            opcion = leerOpcion("Seleccione una opcion: ");
            if (opcion != 0) {
                System.out.println("ERROR: opcion invalida");
            }
        } while (opcion != 0);
        System.out.println("Hasta luego!");
    }

    /** Lee un numero de opcion; si no es numerico devuelve -1. */
    private int leerOpcion(String mensaje) {
        try {
            return Integer.parseInt(ConsoleInput.leerLinea(mensaje).trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
