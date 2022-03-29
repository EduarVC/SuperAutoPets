package com.mycompany.Acuatico;

import com.mycompany.Mascotas.Mascota;
import com.mycompany.Mascotas.espacioVacio;

public class Pescado extends Mascota {

    private boolean habilidadAplicada = false;

    public Pescado() {
        nombreMascota = "Pescado";
        habilidad = "Power-up";
        puntosAtaque = 2;
        puntosVida = 3;
        experiencia = 1;
        nivel = 1;
        cantidadFusionados = 0;
        tipoMascota = new String[1];
        tipoMascota[0] = "Acuatico";
        efecto = false;
        alimento = false;
        nombreAlimento = "Sin Alimentar";
        nombreEfecto = "Sin Efecto";
        dañoRecivido = 0;

    }

    @Override
    public Mascota[] aplicarHabilidad(Mascota[] mascotasJugador, Mascota mascotaHabilidad, Mascota  [] mascotasEnemigo) {
        Mascota espacioLibre = new espacioVacio();
        for (int i = 0; i < mascotasJugador.length; i++) {
            if (mascotasJugador[i] != espacioLibre) {
                if (mascotaHabilidad.cantidadFusionados == 2 && habilidadAplicada == false) {
                    mascotasJugador[i].puntosAtaque += 1;
                    mascotasJugador[i].puntosVida += 1;

                } else if (mascotaHabilidad.cantidadFusionados == 5 && habilidadAplicada == true) {
                    mascotasJugador[i].puntosAtaque += 2;
                    mascotasJugador[i].puntosVida += 2;
                }
            }
        }
        habilidadAplicada = !habilidadAplicada;
        return mascotasJugador;
    }
}
