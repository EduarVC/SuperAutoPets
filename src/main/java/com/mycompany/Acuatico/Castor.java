package com.mycompany.Acuatico;

import com.mycompany.Mascotas.Mascota;
import com.mycompany.Mascotas.espacioVacio;

public class Castor extends Mascota {

    public boolean vendido;

    public Castor() {
        nombreMascota = "Castor";
        habilidad = "Represa";
        puntosAtaque = 2;
        puntosVida = 2;
        experiencia = 1;
        vendido = false;
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
    //metodo especial

    @Override
    public Mascota[] aplicarHabilidad(Mascota[] mascotasJugador, Mascota mascotaHabilidad) {
        Mascota espacioLibre = new espacioVacio();
        int contador = 0;
        if (vendido != false) {
            do {
                int numero = (int) (Math.random() * mascotasJugador.length + 1);
                if (mascotasJugador[numero - 1] != espacioLibre) {

                    if (mascotaHabilidad.nivel == 1 && contador != 2) {
                        mascotasJugador[numero - 1].puntosVida += 1;
                        contador++;
                    } else if (mascotaHabilidad.nivel == 2 && contador != 2) {
                        mascotasJugador[numero - 1].puntosVida += 2;
                        contador++;
                    } else if (mascotaHabilidad.nivel == 3 && contador != 2) {
                        mascotasJugador[numero - 1].puntosVida += 3;
                        contador++;
                    }
                }
            } while (vendido == false);
        }
        return mascotasJugador;
    }

}
