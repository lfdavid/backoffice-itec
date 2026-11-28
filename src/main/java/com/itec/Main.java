package com.itec;

import com.itec.view.MenuPrincipalView;

/**
 * Punto de entrada de la aplicacion.
 *
 * <p>Esta clase es el "composition root": el unico lugar donde se crean las
 * implementaciones concretas. Las demas capas dependen solo de interfaces.
 * En esta etapa base solo arma el menu principal minimo; los repositorios,
 * services y controladores se cablean en cada rama feature/*.
 */
public class Main {

    public static void main(String[] args) {
        MenuPrincipalView menuPrincipalView = new MenuPrincipalView();
        menuPrincipalView.mostrar();
    }
}
