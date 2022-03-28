package com.mycompany.Mamifero;

import com.mycompany.Clasificacion.Mamifero;
import com.mycompany.Mascotas.Mascota;

public class Gato extends Mascota{

    public Gato(){
        nombreMascota = "Gato";
        habilidad = "Maullido";
        puntosAtaque = 4;
        puntosVida = 5;
        experiencia = 1;
    }
    
//    public Gato(String nombreMascota, String habilidad, int puntosVida, int puntosAtaque, int experiencia) {
//        super("Gato", "Maullido", 5, 4, 1);
//    }
    
}
