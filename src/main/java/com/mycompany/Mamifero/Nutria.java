package com.mycompany.Mamifero;

import com.mycompany.Clasificacion.Mamifero;
import com.mycompany.Mascotas.Mascota;
import com.mycompany.Mascotas.espacioVacio;

public class Nutria extends Mascota {

    public boolean comprado;

    public Nutria() {
        nombreMascota = "Nutria";
        habilidad = "ventaja economica";
        puntosAtaque = 1;
        puntosVida = 2;
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
        comprado = false;
    }

    @Override
    public Mascota[] aplicarHabilidad(Mascota[] mascotasJugador, Mascota mascotaHabilidad, Mascota[] mascotasEnemigo) {
        Mascota espacioLibre = new espacioVacio();
        
        int numero = (int) (Math.random() * mascotasJugador.length + 1);
        if (mascotasJugador[numero - 1] != espacioLibre) {

            switch (mascotaHabilidad.nivel) {
                case 1:
                    mascotasJugador[numero - 1].puntosAtaque += 1;
                    mascotasJugador[numero - 1].puntosVida += 1;
                    System.out.println("\nHabilidad de la Nutria aplicada.");
                    break;
                case 2:
                    mascotasJugador[numero - 1].puntosAtaque += 2;
                    mascotasJugador[numero - 1].puntosVida += 2;
                    System.out.println("\nHabilidad de la Nutria aplicada.");
                    break;
                case 3:
                    mascotasJugador[numero - 1].puntosAtaque += 3;
                    mascotasJugador[numero - 1].puntosVida += 3;
                    System.out.println("\nHabilidad de la Nutria aplicada.");
                    break;
                default:
                    break;
            }
            return mascotasJugador;
        } else if (mascotasJugador[numero - 1] == espacioLibre) {
            aplicarHabilidad(mascotasJugador, mascotaHabilidad, mascotasEnemigo);
        }
        return mascotasJugador;
    }
}
