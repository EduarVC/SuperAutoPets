package com.mycompany.Insecto;

import com.mycompany.Clasificacion.Insecto;
import com.mycompany.Mascotas.Mascota;
import com.mycompany.Mascotas.espacioVacio;

public class Caracol extends Mascota {

    public Caracol() {
        nombreMascota = "Caracol";
        habilidad = "Resurgir";
        puntosAtaque = 2;
        puntosVida = 2;
        experiencia = 1;
        nivel = 1;
        cantidadFusionados = 0;
        tipoMascota = new String[2];
        tipoMascota[0] = "Insecto";
        tipoMascota[1] = "Solitario";
        efecto = false;
        alimento = false;
        nombreAlimento = "Sin Alimentar";
        nombreEfecto = "Sin Efecto";
        dañoRecivido = 0;
    }

    @Override
    public Mascota[] aplicarHabilidad(Mascota[] mascotasJugador, Mascota mascotaHabilidad, Mascota[] mascotasEnemigo) {
        int posicion;
        Mascota espacioLibre = new espacioVacio();
        for (int i = 0; i < mascotasJugador.length; i++) {
            if (mascotasJugador[i].nombreMascota.equals(mascotaHabilidad.nombreMascota)) {
                posicion = i;
                break;
            }
        }

        for (int i = 0; i < mascotasJugador.length; i++) {
            if (mascotasJugador[i] != espacioLibre) {
                if (mascotaHabilidad.nivel == 1) {
                    mascotasJugador[i].puntosAtaque += 1;
                    mascotasJugador[i].puntosVida += 1;
                } else if (mascotaHabilidad.nivel == 2) {
                    mascotasJugador[i].puntosAtaque += 2;
                    mascotasJugador[i].puntosVida += 2;
                } else if (mascotaHabilidad.nivel == 3) {
                    mascotasJugador[i].puntosAtaque += 3;
                    mascotasJugador[i].puntosVida += 3;
                }
            }
        }
        System.out.println("\nHabilidad del caracol aplicada");

        return mascotasJugador;
    }
}
