package com.mycompany.Insecto;

import com.mycompany.Mascotas.Mascota;
import com.mycompany.Mascotas.espacioVacio;

public class Hormiga extends Mascota {

    public Hormiga() {
        nombreMascota = "Hormiga";
        habilidad = "Compañerismo";
        puntosAtaque = 2;
        puntosVida = 1;
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
    public Mascota[] aplicarHabilidad(Mascota[] mascotasJugador, Mascota mascotaHabilidad,  Mascota [] mascotasEnemigo) {
        Mascota espacioLibre = new espacioVacio();
        boolean verificar = false;
        if (mascotaHabilidad.puntosVida < 1) {
            do {
                int numero = (int) (Math.random() * mascotasJugador.length + 1);
                if (mascotasJugador[numero + 1] != espacioLibre) {
                    switch (mascotaHabilidad.nivel) {
                        case 1:
                            mascotasJugador[numero + 1].puntosAtaque += 2;
                            mascotasJugador[numero + 1].puntosVida += 1;
                            verificar = true;
                            break;
                        case 2:
                            mascotasJugador[numero + 1].puntosAtaque += 4;
                            mascotasJugador[numero + 1].puntosVida += 2;
                            verificar = true;
                            break;
                        default:
                            mascotasJugador[numero + 1].puntosAtaque += 6;
                            mascotasJugador[numero + 1].puntosVida += 3;
                            verificar = true;
                            break;
                    }

                }
            } while (verificar != true);
        }
        return mascotasJugador;
    }
}
