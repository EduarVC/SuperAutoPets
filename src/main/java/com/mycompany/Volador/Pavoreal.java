package com.mycompany.Volador;

import com.mycompany.Mascotas.Mascota;
import com.mycompany.Clasificacion.Volador;

public class Pavoreal extends Mascota {

    public Pavoreal() {
        nombreMascota = "Pavoreal";
        habilidad = "Potenciacion";
        puntosAtaque = 2;
        puntosVida = 5;
        experiencia = 1;
    }

    @Override
    public Mascota[] aplicarHabilidad(Mascota[] mascotasJugador, Mascota mascotaHabilidad, Mascota[] mascotasEnemigo) {
        for (int i = 0; i < mascotasJugador.length; i++) {
            if (mascotasJugador[i].nombreMascota.equals(mascotaHabilidad.nombreMascota)) {
                double dañoDevuelto;
                dañoDevuelto = mascotasJugador[i].puntosAtaque * 0.50;
                int daño = (int) dañoDevuelto;
                switch (mascotaHabilidad.nivel) {
                    case 1:
                        mascotasJugador[i].puntosAtaque += daño;
                        break;
                    case 2:
                        mascotasJugador[i].puntosAtaque = (mascotasJugador[i].puntosAtaque += daño) * 2;

                        break;
                    case 3:
                        mascotasJugador[i].puntosAtaque = (mascotasJugador[i].puntosAtaque += daño) * 3;
                        break;
                    default:
                        break;
                }
            }
        }

        System.out.println("\nHabilidad del Pavoreal Aplicada;");
        return mascotasJugador;
    }
}
