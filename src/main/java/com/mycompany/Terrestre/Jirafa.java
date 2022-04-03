package com.mycompany.Terrestre;

import com.mycompany.Mascotas.Mascota;
import com.mycompany.Clasificacion.Terrestre;
import com.mycompany.Mascotas.espacioVacio;

public class Jirafa extends Mascota {

    public Jirafa() {
        nombreMascota = "Jirafa";
        habilidad = "Fortaleza aliada";
        puntosAtaque = 2;
        puntosVida = 5;
        experiencia = 1;
        nivel = 1;
        cantidadFusionados = 0;
        tipoMascota = new String[2];
        tipoMascota[0] = "Mamifero";
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
        Mascota espaciolibre = new espacioVacio();
        for (int i = 0; i < mascotasJugador.length; i++) {
            if (mascotasJugador[i].nombreMascota.equals(mascotaHabilidad.nombreMascota)) {
                posicion = i;
                break;
            }
        }
        if (mascotasJugador[posicion].nivel == 1) {
            if (posicion != 0 && mascotasJugador[posicion - 1] != espaciolibre) {
                mascotasJugador[posicion - 1].puntosAtaque += 1;
                mascotasJugador[posicion - 1].puntosVida += 1;

            }
        } else if (mascotasJugador[posicion].nivel == 2) {
            if (posicion > 1) {
                if (mascotasJugador[posicion - 1] != espaciolibre) {
                    mascotasJugador[posicion - 1].puntosAtaque += 1;
                    mascotasJugador[posicion - 1].puntosVida += 1;
                } else if (mascotasJugador[posicion - 2] != espaciolibre) {
                    mascotasJugador[posicion - 2].puntosAtaque += 1;
                    mascotasJugador[posicion - 2].puntosVida += 1;
                }
            } else if (posicion == 1 && mascotasJugador[posicion - 1] != espaciolibre) {
                mascotasJugador[posicion - 1].puntosAtaque += 1;
                mascotasJugador[posicion - 1].puntosVida += 1;
            }
        } else if (mascotasJugador[posicion].nivel == 3) {
            if (posicion > 2) {
                if (mascotasJugador[posicion - 1] != espaciolibre) {
                    mascotasJugador[posicion - 1].puntosAtaque += 1;
                    mascotasJugador[posicion - 1].puntosVida += 1;
                } else if (mascotasJugador[posicion - 2] != espaciolibre) {
                    mascotasJugador[posicion - 2].puntosAtaque += 1;
                    mascotasJugador[posicion - 2].puntosVida += 1;
                } else if (mascotasJugador[posicion - 3] != espaciolibre) {
                    mascotasJugador[posicion - 3].puntosAtaque += 1;
                    mascotasJugador[posicion - 3].puntosVida += 1;
                }
            } else if (posicion == 2) {
                if (mascotasJugador[posicion - 1] != espaciolibre) {
                    mascotasJugador[posicion - 1].puntosAtaque += 1;
                    mascotasJugador[posicion - 1].puntosVida += 1;
                } else if (mascotasJugador[posicion - 2] != espaciolibre) {
                    mascotasJugador[posicion - 2].puntosAtaque += 1;
                    mascotasJugador[posicion - 2].puntosVida += 1;
                }
            } else if (posicion == 1 && mascotasJugador[posicion - 1] != espaciolibre ) {
                mascotasJugador[posicion - 1].puntosAtaque += 1;
                mascotasJugador[posicion - 1].puntosVida += 1;
            }
        }
        return mascotasJugador;
    }

}
