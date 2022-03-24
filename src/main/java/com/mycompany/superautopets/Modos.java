package com.mycompany.superautopets;

import com.mycompany.Alimento.Alimento;
import com.mycompany.Campo.Bosque;
import com.mycompany.Campo.Campo;
import com.mycompany.Campo.Granja;
import com.mycompany.Campo.Mar;
import com.mycompany.Campo.Nube;
import com.mycompany.Campo.Pantano;
import com.mycompany.Campo.Sabana;
import com.mycompany.Campo.SinCampo;
import com.mycompany.Mascotas.Mascota;
import java.util.Scanner;

public class Modos {
    
    private Jugador jugador;
    private IA enemigo;
    private Mascota[] mascotasIA;
    private Campo campo;
    private int ronda;
    private Tienda nuevaTienda;
    protected Mascota[] mascotasTienda;
    private Mascota[] mascotasJugador;
    private Alimento[] nuevoAlimento;

    //constructor de la clase
    public Modos() {
        jugador = new Jugador();
        enemigo = new IA();
        campo = new Campo();
        ronda = 1;
        nuevaTienda = new Tienda();
    }

    //se inicia el modo arrena
    public void ModoArena() {
        int accion;
        
        System.out.println("\nModo Arena\n");
        campo = obtenerCampo();
        mascotasTienda = nuevaTienda.mascotasTienda(ronda);
        nuevoAlimento = nuevaTienda.alimentosTienda(ronda);
        do {
            System.out.println("_________________________");
            System.out.println(String.format("\nTienes %d Monedas de Oro", jugador.monedasOro));
            System.out.println(String.format("Vida: %d", jugador.vidaJugador));
            accion = new MenuEntreClases().MenuEntreClases(ronda);
            if (accion == 1) {
                if (ronda == 1) {
                    System.out.println("\nBienvenido a la tienda de mascotas");
                    System.out.println("_____Crea tu propio equipo_____");
                } else {
                    System.out.println("\nTienda de Mascotas");
                }
                nuevaTienda.ImprimirMascotasTienda(mascotasTienda);
                mascotasJugador = jugador.ComprarMascotas(mascotasTienda);
            } else if (accion == 2) {
                System.out.println("\nAlimentos disponibles: ");
                nuevaTienda.ImprimirAlimentosTienda(nuevoAlimento);
            } else if (accion == 3) {
                System.out.println("_________________________________");
                System.out.println("\nOrdene sus mascotas como desee.");
                mascotasJugador = jugador.OrdenarMascotas(mascotasJugador);
            } else if (accion == 4) {
                mascotasJugador = jugador.FucionarMascotas(mascotasTienda, mascotasJugador);
            } else if (accion == 5) {
                System.out.println("_________________________________");
                System.out.println("\nVenda la mascota que desees y obtenga monedas de oro segun el nivel de su mascota");
                mascotasJugador = jugador.VenderMascotas(mascotasJugador);
            }
        } while (accion != 6);
        mascotasIA = enemigo.obtenreMascotasIA(ronda);
        enemigo.ImprimirMascotasIA(mascotasIA);
    }
    
    public static void ModoVersus() {
        
    }
    
    public static void ModoCreativo() {
        
    }
    
    public IA crearEnemigo() {
        
        return new IA();
    }

    //Metodo para obtener el campo
    public Campo obtenerCampo() {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        System.out.println("1. Pantano");
        System.out.println("2. Nubes");
        System.out.println("3. Mar");
        System.out.println("4. Bosque");
        System.out.println("5. Granja");
        System.out.println("6. Sin campo");
        System.out.println("7. Sabana");
        System.out.println("Elija el campo en el que desee jugar:");
        opcion = entrada.nextInt();
        
        switch (opcion) {
            case 1 ->
                campo = new Pantano();
            case 2 ->
                campo = new Nube();
            case 3 ->
                campo = new Mar();
            case 4 ->
                campo = new Bosque();
            case 5 ->
                campo = new Granja();
            case 6 ->
                campo = new SinCampo();
            case 7 ->
                campo = new Sabana();
            default -> {
                System.out.println("Opcion invalida");
                obtenerCampo();
            }
        }
        
        return campo;
    }
}
