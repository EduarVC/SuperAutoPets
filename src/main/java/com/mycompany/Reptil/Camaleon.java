package com.mycompany.Reptil;

import com.mycompany.Mascotas.Mascota;
import com.mycompany.Clasificacion.Reptil;

public class Camaleon extends Mascota{

    public Camaleon(){
        nombreMascota = "Camaleon";
        habilidad = "Por nivel";
        puntosAtaque = 8;
        puntosVida = 8;
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
    public Mascota[] aplicarHabilidad(Mascota[] mascotasJugador, Mascota mascotaHabilidad, Mascota[] mascotasEnemigo) {

        return mascotasJugador;
    }
}
