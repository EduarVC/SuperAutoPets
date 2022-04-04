package com.mycompany.Acuatico;
import com.mycompany.Clasificacion.Acuatico;
import com.mycompany.Mascotas.Mascota;

public class Delfin extends Mascota{

    public Delfin(){
        nombreMascota = "Delfin";
        habilidad = "Salpicon";
        puntosAtaque = 4;
        puntosVida = 6;
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
        
    return mascotasJugador;
    }
}
