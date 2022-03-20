package com.mycompany.superautopets;

public class Modos {

    private Jugador jugador;
    
    public Modos(){
        jugador = new Jugador();
    }
    public void ModoArena() {
        
    }

    public static void ModoVersus() {

    }

    public static void ModoCreativo() {

    }
    public Enemigo crearEnemigo(){
        
        return new Enemigo();
    }
}
