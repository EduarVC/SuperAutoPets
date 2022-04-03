package com.mycompany.Terrestre;

import com.mycompany.Mascotas.Mascota;
import com.mycompany.Clasificacion.Terrestre;
import com.mycompany.Mascotas.espacioVacio;

public class PuercoEspin extends Mascota{

    public PuercoEspin(){
        nombreMascota = "Puerco Espin";
        habilidad = "Espinas salvajes";
        puntosAtaque = 3;
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
        Mascota espacioLibre = new espacioVacio();
        for (int i = 0; i < mascotasJugador.length; i++) {
             if(mascotasJugador[i] !=espacioLibre){
                 if(mascotaHabilidad.nivel == 1){
                 mascotasJugador[i].puntosVida -=2;
             }else if(mascotaHabilidad.nivel == 2){
                 mascotasJugador[i].puntosVida -=4;
             }else if(mascotaHabilidad.nivel == 3){
                 mascotasJugador[i].puntosVida -=6;
             }
             }
         }
         System.out.println("\nHabilidad del Puerco Espin aplicada.");
        
        return mascotasJugador;
    }
}
