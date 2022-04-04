package com.mycompany.Mamifero;

import com.mycompany.Clasificacion.Mamifero;
import com.mycompany.Mascotas.Mascota;

public class Mono extends Mascota {

    public Mono() {
        nombreMascota = "Mono";
        habilidad = "Amistad";
        puntosAtaque = 1;
        puntosVida = 2;
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
