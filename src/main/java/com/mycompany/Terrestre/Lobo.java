package com.mycompany.Terrestre;

import com.mycompany.Mascotas.Mascota;
import com.mycompany.Clasificacion.Terrestre;

public class Lobo extends Mascota {

    public Lobo() {
        nombreMascota = "Lobo";
        habilidad = "Aullido";
        puntosAtaque = 3;
        puntosVida = 4;
        experiencia = 1;
        nivel = 1;
        cantidadFusionados = 0;
        tipoMascota = new String[2];
        tipoMascota[0] = "Insecto";
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
                break;
            }
        }

        if (mascotaHabilidad.nivel == 1) {
            mascotasJugador[posicion].puntosAtaque += 2;
            mascotasJugador[posicion].puntosVida += 2;
        } else if (mascotaHabilidad.nivel == 2) {
            mascotasJugador[posicion].puntosAtaque += 3;
            mascotasJugador[posicion].puntosVida += 3;
        } else if (mascotaHabilidad.nivel == 3) {
            mascotasJugador[posicion].puntosAtaque += 5;
            mascotasJugador[posicion].puntosVida += 5;
        }
        System.out.println("\nHabilidad del Lobo aplicada.");
        return mascotasJugador;
    }
}
