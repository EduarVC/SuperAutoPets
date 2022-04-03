package com.mycompany.Terrestre;

import com.mycompany.Mascotas.Mascota;
import com.mycompany.superautopets.AlimentarMascota;

public class Cabra extends Mascota{

    public Cabra() {
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
        
        return mascotasJugador;
    }

}
