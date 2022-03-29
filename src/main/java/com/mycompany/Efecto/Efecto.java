package com.mycompany.Efecto;

import com.mycompany.Alimento.Alimento;
import com.mycompany.Mascotas.Mascota;

public class Efecto {
    protected String nombreEfecto;
    protected Alimento alimentoRelacionado;
    
    public Mascota AplicarEfecto( Mascota mascota){
        return mascota;
    }
}
