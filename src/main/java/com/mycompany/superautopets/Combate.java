package com.mycompany.superautopets;

import com.mycompany.Alimento.Alimento;
import com.mycompany.Efecto.Efecto;
import com.mycompany.Mascotas.Mascota;
import com.mycompany.Mascotas.espacioVacio;

public class Combate {

    public Mascota espacioLibre;
    private AlimentarMascota efectosMascota;
    private Verificar verificarMascota;
    public Mascota [] jugador;
    public Mascota [] enemigo;
    private Modos obtenerArreglos;

    public Combate() {
        espacioLibre = new espacioVacio();
    }

    public void inicioCombate() {
        
        int contador = 0;
        int posicionMascotaJugador = 0;
        int posicionMascotaEnemigo = 0;
        Mascota guardaMascotaJugador = espacioLibre;
        Mascota guardaMascotaIA = espacioLibre;
        Alimento tipoAlimento = new Alimento();
        //jugador = verificarMascota.verificarHabilidad(jugador, 4);
        System.out.println("______________________");
        System.out.println("\nInicio del combate.");
        do{
        for (int i = 0; i < jugador.length; i++) {
            if (jugador[i] != espacioLibre && jugador[i].puntosVida > 0) {
                jugador[i] = guardaMascotaJugador;
                posicionMascotaJugador = i;
                break;
            }
        }
        for (int i = 0; i < enemigo.length; i++) {
            if (enemigo[i] != espacioLibre && enemigo[i].puntosVida > 0) {
                enemigo[i] = guardaMascotaIA;
                posicionMascotaEnemigo = i;
                break;
            }
        }

        if (guardaMascotaJugador != espacioLibre && guardaMascotaIA != espacioLibre) {
            guardaMascotaIA.RecivirDaño(guardaMascotaIA, guardaMascotaJugador.puntosAtaque);
            guardaMascotaJugador.RecivirDaño(guardaMascotaJugador, guardaMascotaIA.puntosAtaque);
            if (guardaMascotaJugador.efecto == true && guardaMascotaJugador.alimento == true) {
                efectosMascota.efectosAlimento(guardaMascotaJugador, guardaMascotaIA);
            }
            jugador[posicionMascotaJugador] = guardaMascotaJugador;
            enemigo[posicionMascotaEnemigo] = guardaMascotaIA;
//            jugador = verificarMascota.verificarHabilidad(jugador, 7);
//            jugador = verificarMascota.verificarHabilidad(jugador, 6);
           
            if(guardaMascotaJugador.puntosVida < 1){
                jugador[posicionMascotaJugador] = espacioLibre;
                System.out.println(String.format("\nMascota %s del jugador a muerto", guardaMascotaJugador.nombreMascota));
            }else{
                System.out.println(String.format("\nMascota %s del jugador sobrevivio \n%s", guardaMascotaJugador.nombreMascota, guardaMascotaIA));
            }
            if(guardaMascotaIA.puntosVida < 1){
                enemigo[posicionMascotaEnemigo] = espacioLibre;
                System.out.println(String.format("\nMascota %s del enemigo a muerto", guardaMascotaIA.nombreMascota));
            }else{
                System.out.println(String.format("\nMascota %s del enemigo sobrevivio \n%s", guardaMascotaIA.nombreMascota, guardaMascotaIA));
            }
        }
        
        }while(guardaMascotaJugador != espacioLibre && guardaMascotaIA != espacioLibre);
        
    }

    public Mascota verificarEfecto(Mascota mascota) {
        Efecto aplicarEfecto = new Efecto();
        if ("Mile de abeja".equals(mascota.nombreEfecto)) {
            mascota = aplicarEfecto.AplicarEfecto(mascota);
        }
        return mascota;
    }
}
