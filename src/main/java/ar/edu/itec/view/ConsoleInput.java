package ar.edu.itec.view;

import java.util.Scanner;

public final class ConsoleInput {

    private static final Scanner SCANNER = new Scanner(System.in);

    private ConsoleInput() {
    }

    /** Muestra el mensaje y devuelve la linea leida del teclado. */
    public static String readLine(String message) {
        System.out.print(message);
        return SCANNER.nextLine();
    }
}
