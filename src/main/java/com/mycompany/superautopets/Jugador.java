package com.mycompany.superautopets;

import com.mycompany.Mascotas.Mascota;
import com.mycompany.Mascotas.espacioVacio;
import java.util.Scanner;

public class Jugador extends Personaje {

    static Scanner entrada = new Scanner(System.in);

    private int vidaJugador;
    private int monedasOro;
//    private String nombreJugador;
//    private String nombreEquipo;
    private Mascota espacioLibre;

    public Jugador() {
//        System.out.println("Ingrese su Nombre: ");
//        nombreJugador = entrada.next();
//        System.out.println("Ingrese el nombre de su Equipo: ");
//        nombreEquipo = entrada.next();
        vidaJugador = 10;
        monedasOro = 10;
        cantidadDerrotas = 0;
        cantidadVictorias = 0;
        espacioLibre = new espacioVacio();
        mascotasObtenidas[0] = espacioLibre;
        mascotasObtenidas[1] = espacioLibre;
        mascotasObtenidas[2] = espacioLibre;
        mascotasObtenidas[3] = espacioLibre;
        mascotasObtenidas[4] = espacioLibre;

    }

    public void ImprimirDatosJugador() {
        System.out.println("");
    }

    public Mascota[] ComprarMascotas(Mascota[] mascotasTienda) {
        int opcion;

        while (monedasOro > 0) {
            System.out.println("\nTienes: " + monedasOro + " monedas de oro");
            System.out.println("Elija la Mascota que desee comprar:");
            opcion = entrada.nextInt();

            for (int i = 0; i < mascotasObtenidas.length; i++) {
                if (mascotasObtenidas[i] == espacioLibre) {
                    mascotasObtenidas[i] = mascotasTienda[opcion-1];
                    System.out.println("Mascota Obtenida");
                    monedasOro -= 3;
                    break;
                }
            }
        }

        return mascotasObtenidas;
    }

    public String[] ComprarAlimentos() {
        String[] alimentos = new String[2];

        return alimentos;
    }

    public String[] VenderMascotas() {
        String[] ventaMacotas = new String[cantidadMascotas];

        return ventaMacotas;
    }

    public String[] OrdenarMascotas() {
        String[] ordenMascotas = new String[cantidadMascotas];

        return ordenMascotas;
    }

    public String[] FucionarMascotas() {
        String[] fucionMascotas = new String[cantidadMascotas];

        return fucionMascotas;
    }

    public int RestarMonedas(int monedasGastadas) {
        return monedasOro -= monedasGastadas;
    }

}
