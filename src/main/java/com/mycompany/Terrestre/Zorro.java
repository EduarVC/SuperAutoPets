package com.mycompany.Terrestre;

import com.mycompany.Mascotas.Mascota;
import com.mycompany.Clasificacion.Terrestre;

public class Zorro extends Mascota {

    public Zorro() {
        nombreMascota = "Zorro";
        habilidad = "Ataque rapido";
        puntosAtaque = 5;
        puntosVida = 2;
        experiencia = 1;
    }

    @Override
    public Mascota[] aplicarHabilidad(Mascota[] mascotasJugador, Mascota mascotaHabilidad, Mascota[] mascotasEnemigo) {
        int posicion= 0;
        for (int i = 0; i < mascotasJugador.length; i++) {
            if(mascotasJugador[i].nombreMascota.equals(mascotaHabilidad.nombreMascota)){
                posicion = i;
            }
        }
        if(mascotaHabilidad.nivel == 1){
           mascotasJugador[posicion].puntosAtaque *=2; 
        }else if(mascotaHabilidad.nivel == 2){
           mascotasJugador[posicion].puntosAtaque *=3;
            
        }else if(mascotaHabilidad.nivel == 3){
           mascotasJugador[posicion].puntosAtaque *=4;   
        }
        System.out.println("\nHabilidad del zorro aplicada.");
        return mascotasJugador;
    }

}
