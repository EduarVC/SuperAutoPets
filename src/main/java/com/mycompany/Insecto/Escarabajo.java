package com.mycompany.Insecto;

import com.mycompany.Clasificacion.Insecto;
import com.mycompany.Mascotas.Mascota;
import com.mycompany.Mascotas.espacioVacio;
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
    public Mascota[] aplicarHabilidad(Mascota[] mascotasJugador, Mascota mascotaHabilidad, Mascota [] mascotasTienda) {
        Modos mascotasTien = new Modos();
        Mascota espacioLibre = new espacioVacio();
//        Mascota [] mascotasTienda;
//        mascotasTienda = mascotasTien.mascotasTienda;
        if (alimento == true) {
            for (int i = 0; i < mascotasTienda.length; i++) {
                if(mascotasTienda[i] != espacioLibre){
                switch (mascotaHabilidad.nivel) {
                    case 1:
                        mascotasTienda[i].puntosVida += 1;
                        alimento = false;
                        break;
                    case 2:
                        mascotasTienda[i].puntosVida += 2;
                        alimento = false;
                        break;
                    case 3:
                        mascotasTienda[i].puntosVida += 3;
                        alimento = false;
                        break;
                    default:
                        break;
                }
                }
            }
            System.out.println("\nHabilidad del Escarabajo aplicada.");
        }
        return mascotasJugador;
    }
}
