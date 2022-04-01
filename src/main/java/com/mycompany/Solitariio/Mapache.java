package com.mycompany.Solitariio;

import com.mycompany.Mascotas.Mascota;
import com.mycompany.Clasificacion.Solitario;
import com.mycompany.Mascotas.espacioVacio;

public class Mapache extends Mascota {

    public Mapache() {
        nombreMascota = "Mapache";
        habilidad = "Repartir poder";
        puntosAtaque = 5;
        puntosVida = 4;
        experiencia = 1;
    }

    @Override
    public Mascota[] aplicarHabilidad(Mascota[] mascotasJugador, Mascota mascotaHabilidad, Mascota[] mascotasEnemigo) {
        int posicion = 0;
        Mascota espacioLibre = new espacioVacio();
        for (int i = 0; i < mascotasJugador.length; i++) {
            if (mascotasJugador[i].nombreMascota == mascotaHabilidad.nombreMascota) {
                posicion = i;
                break;
            }
        }
        
        if (posicion < 4 && posicion > 0 && mascotasJugador[posicion + 1] != espacioLibre && mascotasJugador[posicion - 1] != espacioLibre) {
            if (mascotaHabilidad.nivel == 1) {
                mascotasJugador[posicion - 1].puntosAtaque *= 1;
                mascotasJugador[posicion + 1].puntosAtaque *= 1;
            } else if (mascotaHabilidad.nivel == 2) {
                mascotasJugador[posicion - 1].puntosAtaque *= 2;
                mascotasJugador[posicion + 1].puntosAtaque *= 2;
            } else if (mascotaHabilidad.nivel == 3) {
                mascotasJugador[posicion - 1].puntosAtaque *= 3;
                mascotasJugador[posicion + 1].puntosAtaque *= 3;
            }
        } else if (posicion < 4 && posicion == 0 && mascotasJugador[posicion + 1] != espacioLibre) {
            if (mascotaHabilidad.nivel == 1) {
                mascotasJugador[posicion + 1].puntosAtaque *= 1;
            } else if (mascotaHabilidad.nivel == 2) {
                mascotasJugador[posicion + 1].puntosAtaque *= 2;
            } else if (mascotaHabilidad.nivel == 3) {
                mascotasJugador[posicion + 1].puntosAtaque *= 3;
            }
        } else if (posicion == 4 && posicion > 0 && mascotasJugador[posicion - 1] != espacioLibre) {
            if (mascotaHabilidad.nivel == 1) {
                mascotasJugador[posicion - 1].puntosAtaque *= 1;
            } else if (mascotaHabilidad.nivel == 2) {
                mascotasJugador[posicion - 1].puntosAtaque *= 2;
            } else if (mascotaHabilidad.nivel == 3) {
                mascotasJugador[posicion - 1].puntosAtaque *= 3;
            }
        }
        return mascotasJugador;
    }
}
