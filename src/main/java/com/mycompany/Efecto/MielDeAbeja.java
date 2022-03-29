package com.mycompany.Efecto;

import com.mycompany.Alimento.Alimento;
import com.mycompany.Alimento.Miel;
import com.mycompany.Mascotas.Mascota;

public class MielDeAbeja extends Efecto {

    public MielDeAbeja() {
        alimentoRelacionado = new Miel();
    }

//    @Override
//    public Mascota AplicarEfecto(Mascota mascota) {
//
//        if (mascota.puntosVida < 1) {
//            mascota = ((Miel) alimentoRelacionado).devolverMascota(mascota);
//            return mascota;
//        } else {
//            return mascota;
//        }
//    }
}
