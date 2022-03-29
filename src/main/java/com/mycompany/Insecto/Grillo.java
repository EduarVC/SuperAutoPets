package com.mycompany.Insecto;

import com.mycompany.Mascotas.Mascota;

public class Grillo extends Mascota {

    public Grillo() {
        nombreMascota = "Grillo";
        habilidad = "Zombificacion";
        puntosAtaque = 1;
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
        Mascota zombie = new GrilloZombie();
        if (mascotaHabilidad.puntosVida != 0) {
            return mascotasJugador;
        } else {

            for (int i = 0; i < mascotasJugador.length; i++) {

                if (mascotasJugador[i] == mascotaHabilidad) {
                    switch (mascotaHabilidad.nivel) {
                        case 1:
                            mascotasJugador[i] = zombie;
                            break;
                        case 2:
                            zombie.puntosVida += 1;
                            zombie.puntosAtaque += 1;
                            mascotasJugador[i] = zombie;
                            break;
                        default:
                            zombie.puntosVida += 2;
                            zombie.puntosAtaque += 2;
                            mascotasJugador[i] = zombie;
                            break;
                    }
                    break;
                }
            }

            return mascotasJugador;
        }
    }

}
