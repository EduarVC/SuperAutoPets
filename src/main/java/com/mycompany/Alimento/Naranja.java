package com.mycompany.Alimento;


public class Naranja extends Alimento {
    public Naranja() {
        nombreAlimento = "Naranja";
        descripccion = "Regresa un 10% de daño.";
        nombreEfecto = "Efecto Regresa daño";
        tipoEfecto = true;
    }

    public int darAlimento(int dañoRecivido) {
        double dañoDevuelto;
        dañoDevuelto = dañoRecivido * 0.10;
        int daño = (int) dañoDevuelto;

        return daño;
    }
}
