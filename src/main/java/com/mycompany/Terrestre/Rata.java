package com.mycompany.Terrestre;

import com.mycompany.Mascotas.Mascota;
import com.mycompany.Mascotas.espacioVacio;

public class Rata extends Mascota{
    
    public Rata(){
        nombreMascota = "Rata";
        habilidad = "Ayuda hipocrita";
        puntosAtaque = 4;
        puntosVida = 5;
        experiencia = 1;
        nivel = 1;
        cantidadFusionados = 0;
        tipoMascota = new String[2];
        tipoMascota[0] = "Solitario";
        tipoMascota[1] = "Terrestre";
        efecto = false;
        alimento = false;
        nombreAlimento = "Sin Alimentar";
        nombreEfecto = "Sin Efecto";
        dañoRecivido = 0;
    }

    @Override
    public Mascota[] aplicarHabilidad(Mascota[] mascotasJugador, Mascota mascotaHabilidad, Mascota[] mascotasEnemigo) {
           Mascota espacioLibre= new espacioVacio();
           Mascota retornarMascota;
        for (int i = 0; i < mascotasEnemigo.length; i++) {
            if(mascotasEnemigo[i]!= espacioLibre && i > 0){
                mascotaHabilidad.puntosAtaque=1;
                mascotaHabilidad.puntosVida = 1;
                if(mascotaHabilidad.nivel == 1){
                    mascotasEnemigo[i-1] = mascotaHabilidad;
                    System.out.println("\nHabilidad de la rata Aplicada.");
                    break;
                }else if(mascotaHabilidad.nivel == 2){
                    mascotasEnemigo[i-1] = mascotaHabilidad;
                    if(i > 1 ){
                        mascotasEnemigo[i-2] = mascotaHabilidad;
                    }
                    System.out.println("\nHabilidad de la rata Aplicada.");
                    break;
                }else if(mascotaHabilidad.nivel == 3){
                    mascotasEnemigo[i-1] = mascotaHabilidad;
                    if(i > 1 ){
                        mascotasEnemigo[i-2] = mascotaHabilidad;
                    }else if(i > 2){
                        mascotasEnemigo[i-3] = mascotaHabilidad;
                    }
                    System.out.println("\nHabilidad de la rata Aplicada.");
                    break;
                }
            }
        
        }
        return mascotasJugador;
    }
    
}
