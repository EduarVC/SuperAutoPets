package com.mycompany.Volador;

import com.mycompany.Mascotas.Mascota;
import com.mycompany.Mascotas.espacioVacio;

public class Dodo extends Mascota {

    public Dodo() {
        nombreMascota = "Dodo";
        habilidad = "Divicion de poder";
        puntosAtaque = 2;
        puntosVida = 3;
        experiencia = 1;
        nivel = 1;
        cantidadFusionados = 0;
        tipoMascota = new String[1];
        tipoMascota[0] = "Volador";
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
        int posicionMascotaenfrente;
        for (int i = 0; i < mascotasJugador.length; i++) {
            if (mascotasJugador[i].nombreMascota.equals(mascotaHabilidad.nombreMascota)) {
                posicion = i;
                break;
            }
        }
        if (posicion > 0) {
            posicionMascotaenfrente = posicion - 1;
            if (mascotaHabilidad.nivel == 1) {
                while (posicionMascotaenfrente >= 0) {
                    if (mascotasJugador[posicionMascotaenfrente] != espacioLibre) {
                        mascotasJugador[posicion - 1].puntosAtaque += mascotasJugador[posicion - 1].puntosAtaque * 0.5;
                        System.out.println("\nHabilidad de la mascota Dodo aplicada exitosamente");
                        break;
                    } else {
                        posicionMascotaenfrente--;
                    }
                }
            } else if (mascotaHabilidad.nivel == 2) {
                while (posicionMascotaenfrente >= 0) {
                    if (mascotasJugador[posicionMascotaenfrente] != espacioLibre) {
                        mascotasJugador[posicion - 1].puntosAtaque += mascotasJugador[posicion - 1].puntosAtaque * 1;
                        System.out.println("\nHabilidad de la mascota Dodo aplicada exitosamente");
                        break;
                    } else {
                        posicionMascotaenfrente--;
                    }
                }
            } else if (mascotaHabilidad.nivel == 3) {
                while (posicionMascotaenfrente >= 0) {
                    if (mascotasJugador[posicionMascotaenfrente] != espacioLibre) {
                        mascotasJugador[posicion - 1].puntosAtaque += mascotasJugador[posicion - 1].puntosAtaque * 1.5;
                        System.out.println("\nHabilidad de la mascota Dodo aplicada exitosamente");
                        break;
                    } else {
                        posicionMascotaenfrente--;
                    }
                }
            }
        } else {
            System.out.println("\nNo se aplico la habilidad del Dodo porque no hay ni una mascota en frente.");
        }

        return mascotasJugador;
    }
}
