package com.mycompany.Mamifero;

import com.mycompany.Clasificacion.Mamifero;
import com.mycompany.Mascotas.Mascota;
import com.mycompany.Mascotas.espacioVacio;

public class Conejo extends Mascota {

    public Conejo() {
        nombreMascota = "Conejo";
        habilidad = "Cariño";
        puntosAtaque = 3;
        puntosVida = 2;
        experiencia = 1;
        nivel = 1;
        cantidadFusionados = 0;
        tipoMascota = new String[2];
        tipoMascota[0] = "Mamifero";
        efecto = false;
        alimento = false;
        nombreAlimento = "Sin Alimentar";
        nombreEfecto = "Sin Efecto";
        dañoRecivido = 0;
    }

    @Override
    public Mascota[] aplicarHabilidad(Mascota[] mascotasJugador, Mascota mascotaHabilidad, Mascota[] mascotasEnemigo) {
        int posicion = 0;
        int posicionMascota = 0;
        Mascota espacioLibre = new espacioVacio();

        for (int i = 0; i < mascotasJugador.length; i++) {
            if ("Conejo".equals(mascotasJugador[i].nombreMascota)) {
                posicion = i;
            }
            if (mascotasJugador[i].nombreMascota == mascotaHabilidad.nombreMascota) {
                posicionMascota = i;
            }
        }
        if (mascotasJugador[posicion].nivel == 1) {
            mascotasJugador[posicionMascota].puntosVida +=1;
        } else if (mascotasJugador[posicion].nivel == 2) {
            mascotasJugador[posicionMascota].puntosVida +=2;
        } else if (mascotasJugador[posicion].nivel == 3) {
            mascotasJugador[posicionMascota].puntosVida +=3;
        }
        System.out.println("\nHabilidad del conejo aplicada.");

        return mascotasJugador;
    }
}
