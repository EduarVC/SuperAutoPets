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

    }

    @Override
    public Mascota[] aplicarHabilidad(Mascota[] mascotasJugador, Mascota mascotaHabilidad) {
        Mascota espacioLibre = new espacioVacio();
        if(vendido != false){
           do{
            int numero = (int) (Math.random() * mascotasJugador.length + 1);
            if(mascotasJugador[numero-1] != espacioLibre){
                if(mascotaHabilidad.nivel == 1){
                    
                }
            }
           }while(vendido == false);
        }
        return mascotasJugador;
    }

}
