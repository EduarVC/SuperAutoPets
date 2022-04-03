package com.mycompany.Mamifero;

import com.mycompany.Alimento.Alimento;
import com.mycompany.Alimento.Melon;
import com.mycompany.Mascotas.Mascota;
import com.mycompany.superautopets.AlimentarMascota;

public class Buey extends Mascota {

    AlimentarMascota alimentar = new AlimentarMascota();

    public Buey() {
        nombreMascota = "Buey";
        habilidad = "Mejor me protejo";
        puntosAtaque = 1;
        puntosVida = 4;
        experiencia = 1;
        nivel = 1;
        cantidadFusionados = 0;
        tipoMascota = new String[1];
        tipoMascota[0] = "Mamifero";
        efecto = false;
        alimento = false;
        nombreAlimento = "Sin Alimentar";
        nombreEfecto = "Sin Efecto";
        dañoRecivido = 0;
    }

    @Override
    public Mascota[] aplicarHabilidad(Mascota[] mascotasJugador, Mascota mascotaHabilidad, Mascota[] mascotasEnemigo) {
        Alimento melon = new Melon();

        int posicion = 0;
        for (int i = 0; i < mascotasJugador.length; i++) {
            if (mascotasJugador[i].nombreMascota == mascotaHabilidad.nombreMascota) {
                posicion = i;
            }
        }
        mascotasJugador[posicion] = alimentar.darAlimento(mascotasJugador[posicion + 1], melon);
        if (mascotaHabilidad.nivel == 1) {
            mascotasJugador[posicion].puntosAtaque += 2;
        } else if (mascotaHabilidad.nivel == 2) {
            mascotasJugador[posicion].puntosAtaque += 4;
        } else if (mascotaHabilidad.nivel == 3) {
            mascotasJugador[posicion].puntosAtaque += 6;
        }
        System.out.println("\nHabilidad del Buey aplicada.");
        return mascotasJugador;
    }

}
