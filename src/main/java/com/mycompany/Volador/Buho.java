package com.mycompany.Volador;

import com.mycompany.Mascotas.Mascota;
import com.mycompany.Clasificacion.Volador;
import com.mycompany.Mascotas.espacioVacio;

public class Buho extends Mascota {

    public Buho() {
        nombreMascota = "Buho";
        habilidad = "Suerte amigos";
        puntosAtaque = 5;
        puntosVida = 3;
        experiencia = 1;
        nivel = 1;
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
        Mascota espacioLibre = new espacioVacio();
        boolean verificar = false;
        do {
            int numero = (int) (Math.random() * mascotasJugador.length);
            if (mascotasJugador[numero] != espacioLibre) {
                if (mascotaHabilidad.nivel == 1) {
                    mascotasJugador[numero].puntosAtaque += 2;
                    mascotasJugador[numero].puntosVida += 2;
                    verificar = true;
                } else if (mascotaHabilidad.nivel == 2) {
                    mascotasJugador[numero].puntosAtaque += 4;
                    mascotasJugador[numero].puntosVida += 4;
                    verificar = true;
                } else if (mascotaHabilidad.nivel == 3) {
                    mascotasJugador[numero].puntosAtaque += 6;
                    mascotasJugador[numero].puntosVida += 6;
                    verificar = true;
                }
                System.out.println("\nHabilidad del Buho aplicada.");
            }
        } while (verificar != true);
        return mascotasJugador;
    }

}
