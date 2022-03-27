package com.mycompany.Mamifero;

import com.mycompany.Mascotas.Mamifero;
import com.mycompany.Mascotas.Mascota;

public class Nutria extends Mascota{
        public boolean comprado;
    public Nutria(){
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
    public Mascota[] aplicarHabilidad(Mascota[] mascotasJugador, Mascota mascotaHabilidad) {
        
        if(comprado == true){
            int numero = (int) (Math.random() * mascotasJugador.length + 1);
            switch (mascotaHabilidad.nivel) {
                case 1:
                    mascotasJugador[numero -1].puntosAtaque +=1;
                    mascotasJugador[numero -1].puntosVida +=1;
                    break;
                case 2:
                    mascotasJugador[numero -1].puntosAtaque +=2;
                    mascotasJugador[numero -1].puntosVida +=2;
                    break;
                case 3:
                    mascotasJugador[numero -1].puntosAtaque +=3;
                    mascotasJugador[numero -1].puntosVida +=3;
                    break;
                default:
                    break;
            }
            System.out.println("\nHabilidad de la Nutria aplicada.");
        }
        return mascotasJugador;
    }
}
