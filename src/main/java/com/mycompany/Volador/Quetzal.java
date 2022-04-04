package com.mycompany.Volador;

import com.mycompany.Mascotas.Mascota;
import com.mycompany.Clasificacion.Volador;

public class Quetzal extends Mascota {

    public Quetzal() {
        nombreMascota = "Quetzal";
        habilidad = "Por nivel";
        puntosAtaque = 10;
        puntosVida = 10;
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
