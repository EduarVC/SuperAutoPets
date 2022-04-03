package com.mycompany.Reptil;

import com.mycompany.Alimento.Alimento;
import com.mycompany.Alimento.Melon;
import com.mycompany.Mascotas.Mascota;
import com.mycompany.Clasificacion.Reptil;
import com.mycompany.Mascotas.espacioVacio;
import com.mycompany.superautopets.AlimentarMascota;

public class Tortuga extends Mascota {

    private AlimentarMascota alimentar;

    public Tortuga() {
        alimentar = new AlimentarMascota();
        nombreMascota = "Tortuga";
        habilidad = "Proteccion aliada";
        puntosAtaque = 1;
        puntosVida = 2;
        experiencia = 1;
        nivel = 1;
        cantidadFusionados = 0;
        tipoMascota = new String[2];
        tipoMascota[0] = "Reptil";
        efecto = false;
        alimento = false;
        nombreAlimento = "Sin Alimentar";
        nombreEfecto = "Sin Efecto";
        dañoRecivido = 0;
    }

    @Override
    public Mascota[] aplicarHabilidad(Mascota[] mascotasJugador, Mascota mascotaHabilidad, Mascota[] mascotasEnemigo) {
        int posicion = 0;
        Alimento melon = new Melon();
        Mascota espacioLibre = new espacioVacio();
        for (int i = 0; i < mascotasJugador.length; i++) {
            if (mascotasJugador[i].nombreMascota.equals(mascotaHabilidad.nombreMascota)) {
                posicion = i;
                break;
            }
        }
        if (mascotaHabilidad.nivel == 1 && posicion < 4) {
            if (mascotasJugador[posicion + 1] != espacioLibre) {
                mascotasJugador[posicion + 1] = alimentar.darAlimento(mascotasJugador[posicion + 1], melon);
            }
        } else if (mascotaHabilidad.nivel == 2) {
            if (posicion < 3) {
                if (mascotasJugador[posicion + 1] != espacioLibre) {
                    mascotasJugador[posicion + 1] = alimentar.darAlimento(mascotasJugador[posicion + 1], melon);
                }
                if (mascotasJugador[posicion + 2] != espacioLibre) {
                    mascotasJugador[posicion + 2] = alimentar.darAlimento(mascotasJugador[posicion + 2], melon);
                }
            } else if (posicion == 3) {
                if (mascotasJugador[posicion + 1] != espacioLibre) {
                    mascotasJugador[posicion + 1] = alimentar.darAlimento(mascotasJugador[posicion + 1], melon);
                }
            }
            System.out.println("\nHabilidad de la tortuga aplicada");
        } else if (mascotaHabilidad.nivel == 3 && posicion < 2) {
            if (posicion < 2) {
                if (mascotasJugador[posicion + 1] != espacioLibre) {
                    mascotasJugador[posicion + 1] = alimentar.darAlimento(mascotasJugador[posicion + 1], melon);
                }
                if (mascotasJugador[posicion + 2] != espacioLibre) {
                    mascotasJugador[posicion + 2] = alimentar.darAlimento(mascotasJugador[posicion + 2], melon);
                }
                if (mascotasJugador[posicion + 3] != espacioLibre) {
                    mascotasJugador[posicion + 3] = alimentar.darAlimento(mascotasJugador[posicion + 3], melon);
                }
            } else if (posicion == 2) {
                if (mascotasJugador[posicion + 1] != espacioLibre) {
                    mascotasJugador[posicion + 1] = alimentar.darAlimento(mascotasJugador[posicion + 1], melon);
                }
                if (mascotasJugador[posicion + 2] != espacioLibre) {
                    mascotasJugador[posicion + 2] = alimentar.darAlimento(mascotasJugador[posicion + 2], melon);
                }
            } else if (posicion == 3) {
                if (mascotasJugador[posicion + 1] != espacioLibre) {
                    mascotasJugador[posicion + 1] = alimentar.darAlimento(mascotasJugador[posicion + 1], melon);
                }
            }
            System.out.println("\nHabilidad de la tortuga aplicada");
        }

        return mascotasJugador;
    }
}
