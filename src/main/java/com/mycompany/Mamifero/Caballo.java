package com.mycompany.Mamifero;

import com.mycompany.Clasificacion.Mamifero;
import com.mycompany.Mascotas.Mascota;

public class Caballo extends Mascota {

    public boolean invocar = false;

    public Caballo() {
        nombreMascota = "Caballo";
        habilidad = "Rugido aliado";
        puntosAtaque = 2;
        puntosVida = 1;
        experiencia = 1;
        nivel = 1;
        cantidadFusionados = 0;
        tipoMascota = new String[2];
        tipoMascota[0] = "Mamifero";
        tipoMascota[1] = "Domestico";
        efecto = false;
        alimento = false;
        nombreAlimento = "Sin Alimentar";
        nombreEfecto = "Sin Efecto";
        dañoRecivido = 0;
    }

    @Override
    public Mascota[] aplicarHabilidad(Mascota[] mascotasJugador, Mascota mascotaHabilidad) {

        if (invocar == true) {
            
            for (int i = 0; i < mascotasJugador.length; i++) {
                if("Invocada".equals(mascotasJugador[i].tipoMascota[0])){
                    switch (mascotaHabilidad.nivel) {
                        case 1:
                            mascotasJugador[i].puntosAtaque += 1;
                            break;
                        case 2:
                            mascotasJugador[i].puntosAtaque += 2;
                            break;
                        case 3:
                            mascotasJugador[i].puntosAtaque += 3;
                            break;
                        default:
                            break;
                    }
                    System.out.println("\nHabilidad del caballo aplicada.");
                    break;
                }
            }
        }
        return mascotasJugador;
    }
}
