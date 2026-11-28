package com.itec.view;

import java.util.Scanner;

/**
 * Lector unico de entrada por consola.
 *
 * <p>Debe existir UN solo Scanner sobre System.in en toda la aplicacion:
 * si cada vista crea el suyo, los buffers compiten y se pierden lineas.
 * Todas las vistas leen a traves de esta clase.
 */
public final class ConsoleInput {

    private static final Scanner SCANNER = new Scanner(System.in);

    private ConsoleInput() {
    }

    /** Muestra el mensaje y devuelve la linea leida del teclado. */
    public static String leerLinea(String mensaje) {
        System.out.print(mensaje);
        return SCANNER.nextLine();
    }
}
