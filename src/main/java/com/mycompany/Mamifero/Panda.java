package com.mycompany.Mamifero;

import com.mycompany.Clasificacion.Mamifero;
import com.mycompany.Mascotas.Mascota;

public class Panda extends Mascota{

    public Panda(){
        nombreMascota = "Panda";
        habilidad = "Fortaleza";
        puntosAtaque = 5;
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
