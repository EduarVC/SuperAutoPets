package com.mycompany.Alimento;

import com.mycompany.Mascotas.Mascota;

public class Alimento {

    public String nombreAlimento;
    protected String descripccion;
    public boolean tipoEfecto;
    public String nombreEfecto;

    @Override
    public String toString(){
        String efecto;
        if (tipoEfecto == true) {
            return "Nombre: " + nombreAlimento + "\nDescripcción: " + descripccion + "\nEs de Tipo Efecto";
        } else {
            return "Nombre: " + nombreAlimento + "\nDescripcción: " + descripccion;
        }
    }
    
   
}
