package com.mycompany.Alimento;

import com.mycompany.Mascotas.Mascota;

public class Alimento {

    protected String nombreAlimento;
    protected String descripccion;
    protected boolean tipoEfecto;

    @Override
    public String toString(){
        String efecto;
        if (tipoEfecto == true) {
            return "Nombre: " + nombreAlimento + "\nDescripcción: " + descripccion + "\nEs de Tipo Efecto";
        } else {
            return "Nombre: " + nombreAlimento + "\nDescripcción: " + descripccion;
        }
    }
    public boolean aplicarEfecto(Mascota mascotaObtieneAlimento){
        if(tipoEfecto == true){
            mascotaObtieneAlimento.efecto = true;
        }else{
            mascotaObtieneAlimento.efecto = false;
        }
        
        return mascotaObtieneAlimento.efecto;
    }
}
