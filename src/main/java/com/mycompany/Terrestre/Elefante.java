package com.mycompany.Terrestre;

import com.mycompany.Mascotas.Mascota;
import com.mycompany.Clasificacion.Terrestre;
import com.mycompany.Mascotas.espacioVacio;

public class Elefante extends Mascota {

    public Elefante() {
        nombreMascota = "Elefante";
        habilidad = "Daño colateral";
        puntosAtaque = 3;
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
        int posicionMascotaAfectada;
        Mascota espacioLibre = new espacioVacio();
        for (int i = 0; i < mascotasJugador.length; i++) {
            if (mascotasJugador[i].nombreMascota.equals(mascotaHabilidad.nombreMascota)) {
                posicion = i;
                break;
            }
        }
        if (posicion < 4) {
            posicionMascotaAfectada = posicion + 1;
            if (mascotaHabilidad.nivel == 1) {
                while (posicionMascotaAfectada <= 4) {
                    if (mascotasJugador[posicionMascotaAfectada] != espacioLibre) {
                        mascotasJugador[posicionMascotaAfectada].puntosVida -= 1;
                        System.out.println("\nHabilidad de la mascota Elefante aplicada exitosamente");
                        break;
                    } else {
                        posicionMascotaAfectada++;
                    }
                }
            } else if (mascotaHabilidad.nivel == 2) {
                while (posicionMascotaAfectada <= 4) {
                    if (mascotasJugador[posicionMascotaAfectada] != espacioLibre) {
                        mascotasJugador[posicionMascotaAfectada].puntosVida -= 2;
                        System.out.println("\nHabilidad de la mascota Elefante aplicada exitosamente");
                        break;
                    } else {
                        posicionMascotaAfectada++;
                    }
                }
            } else if (mascotaHabilidad.nivel == 3) {
                while (posicionMascotaAfectada <= 4) {
                    if (mascotasJugador[posicionMascotaAfectada] != espacioLibre) {
                        mascotasJugador[posicionMascotaAfectada].puntosVida -= 3;
                        System.out.println("\nHabilidad de la mascota Elefante aplicada exitosamente");
                        break;
                    } else {
                        posicionMascotaAfectada++;
                    }
                }
            }else{
                System.out.println("\nNo se pudo aplicar la habilidad del elefante, no existe mascota detras.");
            }
        }
        return mascotasJugador;
    }
}
