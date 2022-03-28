package com.mycompany.Terrestre;

import com.mycompany.Mascotas.Mascota;
import com.mycompany.Clasificacion.Terrestre;

public class Serpiente extends Mascota{
    
    public Serpiente(){
        nombreMascota = "Serpiente";
        habilidad = "Ataque discreto";
        puntosAtaque = 6;
        puntosVida = 6;
        experiencia = 1;
    }

//    public Serpiente(String nombreMascota, String habilidad, int puntosVida, int puntosAtaque, int experiencia) {
//        super("Serpiente", "Ataque-discreto", 6, 6, 1);
//    }
    
}
