package com.mycompany.Insecto;

import com.mycompany.Clasificacion.Insecto;
import com.mycompany.Mascotas.Mascota;
import com.mycompany.Clasificacion.Volador;

public class Mosca extends Mascota{

    public Mosca(){
        nombreMascota = "Mosca";
        habilidad = "Invocacion";
        puntosAtaque = 5;
        puntosVida = 5;
        experiencia = 1;
    }
    
//    public Mosca(String nombreMascota, String habilidad, int puntosVida, int puntosAtaque, int experiencia) {
//        super("Mosca", "Invocacion", 5, 5, 1);
//    }
}
