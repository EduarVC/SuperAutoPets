package com.mycompany.Terrestre;

import com.mycompany.Mascotas.Mascota;
import com.mycompany.Clasificacion.Terrestre;

public class Canguro extends Mascota {

    public Canguro() {
        nombreMascota = "Canguro";
        habilidad = "Ya quiero pelear";
        puntosAtaque = 1;
        puntosVida = 2;
        experiencia = 1;
        nivel = 1;
        cantidadFusionados = 0;
        tipoMascota = new String[2];
        tipoMascota[0] = "Mamifero";
        tipoMascota[1] = "Terrestre";
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
            }
        }

        if (mascotaHabilidad.nivel == 1) {
            mascotasJugador[posicion].puntosAtaque += 2;
            mascotasJugador[posicion].puntosVida += 2;
        } else if (mascotaHabilidad.nivel == 2) {
            mascotasJugador[posicion].puntosAtaque += 4;
            mascotasJugador[posicion].puntosVida += 4;
        } else if (mascotaHabilidad.nivel == 3) {
            mascotasJugador[posicion].puntosAtaque += 6;
            mascotasJugador[posicion].puntosVida += 6;
        }
        System.out.println("\nHabilidad del canguro aplicada.");
        return mascotasJugador;
    }

}
