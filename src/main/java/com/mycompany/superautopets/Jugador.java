package com.mycompany.superautopets;

import java.util.Scanner;

public class Jugador {

    static Scanner entrada = new Scanner(System.in);

    int vidaJugador;
    int monedasOro;
    String nombreJugador;
    int cantidadMascotas = 3;

    public String[] Jugador() {

        int turnoTier;

        System.out.println("Ingrese su Nombre: ");
        nombreJugador = entrada.next();
//        switch (ronda) {
//            case 1:
//                turnoTier = 1;
//                cantidadMascotas = 
//                break;
//            case 2:
//                turnoTier = 2;
//                break;
//            case 4:
//                turnoTier = 3;
//                break;
//            case 6:
//                turnoTier = 4;
//                break;
//            case 8:
//                turnoTier = 5;
//                break;
//            case 10:
//                turnoTier = 6;
//                break;
//            case 12:
//                turnoTier = 7;
//        }

        String[] mascotas = new String[cantidadMascotas];

        return mascotas;
    }

    public String[] ComprarMascotas() {
        String[] mascotasCompradas = new String[cantidadMascotas];
        
        return mascotasCompradas;
    }

    public String[] ComprarAlimentops() {
        String [] alimentos = new String[2];
        
        return alimentos;
    }
    public String [] VenderMascotas(){
        String [] ventaMacotas = new String[cantidadMascotas];
        
        return ventaMacotas;
    }
    public String [] OrdenarMascotas(){
        String [] ordenMascotas = new String[cantidadMascotas];
        
        return ordenMascotas;
    }
    public String [] FucionarMascotas(){
        String [] fucionMascotas = new String[cantidadMascotas];
        
        return fucionMascotas;
    }

}
