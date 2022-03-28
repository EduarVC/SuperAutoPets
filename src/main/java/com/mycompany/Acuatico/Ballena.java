package com.mycompany.Acuatico;
import com.mycompany.Clasificacion.Acuatico;
import com.mycompany.Mascotas.Mascota;

public class Ballena extends Mascota{
    
    public Ballena(){
        nombreMascota = "Ballena";
        habilidad = "Succion";
        puntosAtaque = 3;
        puntosVida = 8;
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
