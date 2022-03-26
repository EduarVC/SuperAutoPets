package com.mycompany.Volador;

import com.mycompany.Mascotas.Mascota;

public class Abeja extends Mascota{
    public Abeja(){
        nombreMascota = "Abeja";
        habilidad = "Ninguna";
        puntosAtaque = 1;
        puntosVida = 1;
        experiencia = 1;
        nivel = 1;
        cantidadFusionados = 0;
        tipoMascota = new String[1];
        tipoMascota[0] = "Sin Tipo";
        efecto = false;
        alimento = false;
        nombreAlimento = "Sin Alimentar";
        nombreEfecto = "Sin Efecto";
        dañoRecivido = 0;
         
    }
}
