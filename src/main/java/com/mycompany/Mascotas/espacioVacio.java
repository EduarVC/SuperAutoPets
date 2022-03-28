
package com.mycompany.Mascotas;

public class espacioVacio extends Mascota{
    
     public espacioVacio(){
        nombreMascota = "0";
        habilidad = "0";
        puntosAtaque = 0;
        puntosVida = 0;
        experiencia = 0;
        nivel = 0;
        cantidadFusionados = 0;
        tipoMascota = new String[1];
        tipoMascota[0] = "Sin tipo";
        efecto = false;
        alimento = false;
        nombreAlimento = "Sin Alimentar";
        nombreEfecto = "Sin Efecto";
        dañoRecivido = 0;
    }
}
