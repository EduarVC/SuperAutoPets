package com.mycompany.superautopets;

import com.mycompany.Campo.Bosque;
import com.mycompany.Campo.Campo;
import com.mycompany.Campo.Granja;
import com.mycompany.Campo.Mar;
import com.mycompany.Campo.Nube;
import com.mycompany.Campo.Pantano;
import com.mycompany.Campo.Sabana;
import com.mycompany.Campo.SinCampo;
import java.util.Scanner;

public class Modos {

    private Jugador jugador;
    private Campo campo;
    
    public Modos(){
        jugador = new Jugador();
        campo = new Campo();
    }
    public void ModoArena() {
        System.out.println("Modo Arena\n");
        
        
    }

    public static void ModoVersus() {
        
    }

    public static void ModoCreativo() {

    }
    public Enemigo crearEnemigo(){
        
        return new Enemigo();
    }
    
    public Campo obtenerCampo(){
        Scanner entrada =  new Scanner(System.in);
        int opcion;
        
        System.out.println("Elija el campo en el que desee jugar:");
        System.out.println("1. Pantano");
        System.out.println("2. Nubes");
        System.out.println("3. Mar");
        System.out.println("4. Bosque");
        System.out.println("5. Granja");
        System.out.println("6. Sin campo");
        System.out.println("7. Sabana");
        opcion = entrada.nextInt();
        
        switch (opcion){
            case 1:
                campo = new Pantano();
            case 2:
                campo = new Nube();
            case 3:
                campo = new Mar();
            case 4:
                campo = new Bosque();
            case 5: 
                campo = new Granja();
            case 6:
                campo = new SinCampo();
            case 7:
                campo = new Sabana();
            default:
                 System.out.println("Opcion invalida");
                 obtenerCampo();
        }
        
        return campo;
    }
}
