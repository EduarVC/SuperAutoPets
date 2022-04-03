package com.mycompany.Terrestre;

import com.mycompany.Mascotas.Mascota;
import com.mycompany.Clasificacion.Terrestre;
import com.mycompany.Mascotas.espacioVacio;

public class Oveja extends Mascota {

    public Oveja() {
        nombreMascota = "Oveja";
        habilidad = "Revolucion";
        puntosAtaque = 2;
        puntosVida = 2;
        experiencia = 1;
        nivel = 1;
        cantidadFusionados = 0;
        tipoMascota = new String[2];
        tipoMascota[0] = "Domestico";
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
        Mascota mascotaInvocada = new Cabra();

        Mascota espacioLibre = new espacioVacio();
        for (int i = 0; i < mascotasJugador.length; i++) {
            if (mascotasJugador[i].nombreMascota.equals(mascotaHabilidad.nombreMascota)) {
                posicion = i;
            }
        }

        if (mascotaHabilidad.nivel == 1) {
            if (posicion > 1) {
                mascotasJugador[posicion - 1] = mascotaInvocada;
                mascotasJugador[posicion - 2] = mascotaInvocada;
            } else if (posicion == 1) {
                mascotasJugador[posicion - 1] = mascotaInvocada;
            }
        } else if (mascotaHabilidad.nivel == 2) {
            if (posicion > 1) {
                mascotasJugador[posicion - 1] = mascotaInvocada;
                mascotasJugador[posicion - 2] = mascotaInvocada;
            } else if (posicion == 1) {
                mascotasJugador[posicion - 1] = mascotaInvocada;
            }
        } else if (mascotaHabilidad.nivel == 3) {
            if (posicion > 1) {
                mascotasJugador[posicion - 1] = mascotaInvocada;
                mascotasJugador[posicion - 2] = mascotaInvocada;
            } else if (posicion == 1) {
                mascotasJugador[posicion - 1] = mascotaInvocada;
            }
            System.out.println("\nHabilidad de la oveja aplicada");
        }

        return mascotasJugador;
    }
}
