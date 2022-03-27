package com.mycompany.Insecto;

import com.mycompany.Mascotas.Insecto;
import com.mycompany.Mascotas.Mascota;
import com.mycompany.superautopets.Modos;

public class Escarabajo extends Mascota {

    public Escarabajo() {
        nombreMascota = "Escarabajo";
        habilidad = "Apetito";
        puntosAtaque = 2;
        puntosVida = 3;
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
    public Mascota[] aplicarHabilidad(Mascota[] mascotasJugador, Mascota mascotaHabilidad) {
        Modos mascotasTien = new Modos();
        if (alimento == true) {
            for (int i = 0; i < mascotasTien.mascotasTienda.length; i++) {
                switch (mascotaHabilidad.nivel) {
                    case 1:
                        mascotasTien.mascotasTienda[i].puntosVida += 1;
                        break;
                    case 2:
                        mascotasTien.mascotasTienda[i].puntosVida += 2;
                        break;
                    case 3:
                        mascotasTien.mascotasTienda[i].puntosVida += 3;
                        break;
                    default:
                        break;
                }
            }
        }
        return mascotasJugador;
    }
}
