package com.mycompany.Insecto;

import com.mycompany.Clasificacion.Insecto;
import com.mycompany.Mascotas.Mascota;

public class Araña extends Mascota {

    public Araña() {
        nombreMascota = "Araña";
        habilidad = "Liberacion";
        puntosAtaque = 2;
        puntosVida = 2;
        experiencia = 1;
        nivel = 1;
        cantidadFusionados = 0;
        tipoMascota = new String[1];
        tipoMascota[0] = "Insecto";
        efecto = false;
        alimento = false;
        nombreAlimento = "Sin Alimentar";
        nombreEfecto = "Sin Efecto";
        dañoRecivido = 0;
    }

    @Override
    public Mascota[] aplicarHabilidad(Mascota[] mascotasJugador, Mascota mascotaHabilidad, Mascota[] mascotasEnemigo) {
        int posicion = 0;
        for (int i = 0; i < mascotasJugador.length; i++) {
            if (mascotasJugador[i].nombreMascota.equals(mascotaHabilidad.nombreMascota)) {
                posicion = i;
                break;
            }
        }
        
        if(mascotaHabilidad.nivel == 1){
            mascotasJugador[posicion].nivel = 1;
            mascotasJugador[posicion].puntosAtaque = 2;
            mascotasJugador[posicion].puntosVida = 2;
        }else if(mascotaHabilidad.nivel == 2){
            mascotasJugador[posicion].nivel = 2;
            mascotasJugador[posicion].puntosAtaque = 2;
            mascotasJugador[posicion].puntosVida = 2;
        }else if(mascotaHabilidad.nivel == 3){
            mascotasJugador[posicion].nivel = 3;
            mascotasJugador[posicion].puntosAtaque = 2;
            mascotasJugador[posicion].puntosVida = 2;
        }
        System.out.println("\nHabilidad de la araña aplicada.");
        return mascotasJugador;
    }

}
