package com.mycompany.Alimento;

public class Alimento {

    protected String nombreAlimento;
    protected String descripccion;
    protected boolean tipoEfecto;

    public String ToString() {
        String efecto;
        if (tipoEfecto == true) {
            return "Nombre: " + nombreAlimento + "\nDescripcción: " + descripccion + "\nEs de Tipo Efecto";
        } else {
            return "Nombre: " + nombreAlimento + "\nDescripcción: " + descripccion;
        }
    }
}
