package com.mycompany.Alimento;

import com.mycompany.Mascotas.Mascota;
import com.mycompany.Mascotas.espacioVacio;

public class Ensalada extends Alimento{
    public Ensalada(){
        nombreAlimento = "Ensalada";
        descripccion = "Aumenta 1 punto de vida y de daño a 2 mascotas aleatorias.";
        tipoEfecto = false;
    }
    public Mascota[] alimentarMascota(Mascota [] mascotasJugador , Alimento alimento){
        Mascota espacioLibre = new espacioVacio();
        int contador = 0;
        while(contador <2){
        int numero = (int)(Math.random()*mascotasJugador.length);
        if(mascotasJugador[numero] != espacioLibre){
            mascotasJugador[numero].nombreAlimento = alimento.nombreAlimento;
            mascotasJugador[numero].puntosAtaque +=1;
            mascotasJugador[numero].puntosVida +=1;
            contador++;
        }
        }
        return mascotasJugador;
    }
}
