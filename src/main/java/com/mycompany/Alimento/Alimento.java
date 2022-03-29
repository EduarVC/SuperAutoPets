package com.mycompany.Alimento;


public class Alimento {

    public String nombreAlimento;
    protected String descripccion;
    public boolean tipoEfecto;
    public String nombreEfecto;

    @Override
    public String toString(){
        if (tipoEfecto == true) {
            return "Nombre: " + nombreAlimento + "\nDescripcción: " + descripccion + "\nEs de Tipo Efecto";
        } else {
            return "Nombre: " + nombreAlimento + "\nDescripcción: " + descripccion;
        }
    }
    
   
}
