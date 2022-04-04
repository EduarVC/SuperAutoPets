package com.mycompany.Domestico;

import com.mycompany.Clasificacion.Domestico;
import com.mycompany.Mascotas.Mascota;

public class Ardilla extends Mascota{

    public Ardilla(){
        nombreMascota = "Ardilla";
        habilidad = "Rebajas";
        puntosAtaque = 2;
        puntosVida = 5;
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
