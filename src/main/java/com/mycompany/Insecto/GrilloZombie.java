
package com.mycompany.Insecto;

import com.mycompany.Mascotas.Mascota;

public class GrilloZombie extends Mascota{
    public GrilloZombie(){
        nombreMascota = "Grillo Zombie";
        habilidad = "Sin habilidad";
        puntosAtaque = 1;
        puntosVida = 1;
        experiencia = 1;
        nivel = 1;
        cantidadFusionados = 0;
        tipoMascota = new String[1];
        tipoMascota[0] = "Invocada";
        efecto = false;
        alimento = false;
        nombreAlimento = "Sin Alimentar";
        nombreEfecto = "Sin Efecto";
        dañoRecivido = 0;
    }
}
