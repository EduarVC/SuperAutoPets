package com.mycompany.Solitariio;

import com.mycompany.Mascotas.Mascota;
import com.mycompany.Clasificacion.Solitario;

public class Escorpion extends Mascota {

    public Escorpion() {
        nombreMascota = "Escorpion";
        habilidad = "Aguja";
        puntosAtaque = 1;
        puntosVida = 1;
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
