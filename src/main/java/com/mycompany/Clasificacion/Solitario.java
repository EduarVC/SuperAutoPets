package com.mycompany.Clasificacion;

import com.mycompany.Mascotas.Mascota;

public class Solitario extends Clasificacion{
    public Solitario(){
        nombreTipo = "Solitario";
    }
    @Override
    public Mascota [] aplicarEfectoCampo(Mascota [] mascota){
        return mascota;
    }
}
