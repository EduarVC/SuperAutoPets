package com.mycompany.superautopets;

import java.util.Scanner;

public class Jugador extends Personaje{

    static Scanner entrada = new Scanner(System.in);

    private int vidaJugador;
    private int monedasOro;
    private String nombreJugador;
    private String nombreEquipo;

    public void Jugador() {
        System.out.println("Ingrese su Nombre: ");
        nombreJugador = entrada.next();
        System.out.println("Ingrese el nombre de su Equipo: ");
        nombreEquipo = entrada.next();
        vidaJugador = 10;
        monedasOro = 10;
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
    public int RestarMonedas(int monedasGastadas){
        return monedasOro -= monedasGastadas;
    }

}
