package com.mycompany.Alimento;

import com.mycompany.Efecto.Efecto;
import com.mycompany.Mascotas.Mascota;

public class Naranja extends Alimento {

    public Naranja() {
        nombreAlimento = "Naranja";
        descripccion = "Regresa un 10% de daño.";
        tipoEfecto = true;
    }

    public double aplicarEfectoAlimento(int dañoRecivido) {
        double dañoDevuelto;
        dañoDevuelto = dañoRecivido * 0.10;

        return dañoDevuelto;
    }
}
