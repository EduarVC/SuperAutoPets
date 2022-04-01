package com.mycompany.Acuatico;

import com.mycompany.Clasificacion.Acuatico;
import com.mycompany.Mascotas.Mascota;
import com.mycompany.Mascotas.espacioVacio;

public class Sapo extends Mascota {

    public Sapo() {
        nombreMascota = "Sapo";
        habilidad = "Metamorfosis";
        puntosAtaque = 3;
        puntosVida = 3;
        experiencia = 1;
        nivel = 1;
        cantidadFusionados = 0;
        tipoMascota = new String[2];
        tipoMascota[0] = "Acuatico";
        tipoMascota[1] = "Terrestre";
        efecto = false;
        alimento = false;
        nombreAlimento = "Sin Alimentar";
        nombreEfecto = "Sin Efecto";
        dañoRecivido = 0;
    }

    @Override
    public Mascota[] aplicarHabilidad(Mascota[] mascotasJugador, Mascota mascotaHabilidad, Mascota[] mascotasEnemigo) {
        Mascota espacioLibre = new espacioVacio();
        int vidaMayor = 0;
        for (int i = 0; i < mascotasJugador.length; i++) {
            if (mascotasJugador[i] != espacioLibre) {
                if (mascotasJugador[i].puntosVida > vidaMayor) {
                    mascotasJugador[i].puntosVida = vidaMayor;
                }
            }
        }
        for (int i = 0; i < mascotasJugador.length; i++) {
            if(mascotasJugador[i].nombreMascota.equals(mascotaHabilidad.nombreMascota)){
                 mascotasJugador[i].puntosVida = vidaMayor;
                 System.out.println("\nHabilidad de la mascota sapo ah sido aplicada con exito...");
                 break;
            }
        }
       
        
        return mascotasJugador;
    }

}
