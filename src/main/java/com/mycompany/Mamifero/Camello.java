package com.mycompany.Mamifero;

import com.mycompany.Clasificacion.Mamifero;
import com.mycompany.Mascotas.Mascota;
import com.mycompany.Mascotas.espacioVacio;

public class Camello extends Mascota {

    public Camello() {
        nombreMascota = "Camello";
        habilidad = "Joroba";
        puntosAtaque = 2;
        puntosVida = 5;
        experiencia = 1;
        nivel = 1;
        cantidadFusionados = 0;
        tipoMascota = new String[2];
        tipoMascota[0] = "Mamifer";
        tipoMascota[1] = "Desertico";
        efecto = false;
        alimento = false;
        nombreAlimento = "Sin Alimentar";
        nombreEfecto = "Sin Efecto";
        dañoRecivido = 0;
    }

    @Override
    public Mascota[] aplicarHabilidad(Mascota[] mascotasJugador, Mascota mascotaHabilidad, Mascota[] mascotasEnemigo) {
        Mascota espacioLibre = new espacioVacio();
        int posicion = 0;

        for (int i = 0; i < mascotasJugador.length; i++) {
            if (mascotasJugador[i].nombreMascota.equals(mascotaHabilidad.nombreMascota)) {
                posicion = i;
                break;
            }
        }
        if (posicion < 4 && mascotasJugador[posicion + 1] != espacioLibre) {
            if (mascotaHabilidad.nivel == 1) {
                mascotasJugador[posicion + 1].puntosAtaque += 1;
                mascotasJugador[posicion + 1].puntosVida += 2;
            } else if (mascotaHabilidad.nivel == 2) {
                mascotasJugador[posicion + 1].puntosAtaque += 2;
                mascotasJugador[posicion + 1].puntosVida += 4;
            } else if (mascotaHabilidad.nivel == 3) {
                mascotasJugador[posicion + 1].puntosAtaque += 3;
                mascotasJugador[posicion + 1].puntosVida += 6;
            }
            System.out.println("\nHabilidad del camello aplicada.");
        }
        return mascotasJugador;
    }

}
