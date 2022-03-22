package com.mycompany.superautopets;

import static com.mycompany.superautopets.Modos.ModoCreativo;
import static com.mycompany.superautopets.Modos.ModoVersus;
import static com.mycompany.superautopets.Reportes.Reportes;
import java.util.Scanner;

public class MenuPrincipal {

    static Scanner entrada = new Scanner(System.in);

    public static void MenuPrincipal() {

        int opcion;

        System.out.println("");
        System.out.println("Menu Principal");
        System.out.println("1- Elegir Modo de Juego");
        System.out.println("2- Reportes");
        System.out.println("3- Salir del Juego");
        System.out.println("Elija una opcion: ");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                modoJuego();
                MenuPrincipal();
                break;
            case 2:
                Reportes();
                MenuPrincipal();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Opcion Invalida");
                MenuPrincipal();
                break;
        }
    }

    public static void modoJuego() {

        int opcion;
        Modos tipoModo = new Modos();

        System.out.println("\nModos de Juego");
        System.out.println("\n1- Modo Arena");
        System.out.println("2- Modo Versus");
        System.out.println("3- Modo Creativo");
        System.out.println("4- Regresar al Menu Principal");
        System.out.println("Elija una opcion: ");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                tipoModo.ModoArena();
                break;
            case 2:
                ModoVersus();
                break;
            case 3:
                ModoCreativo();
                break;
            case 4:
                MenuPrincipal();
            default:
                System.out.println("Opcion Invalida");
                modoJuego();
                break;

        }
    }
}
