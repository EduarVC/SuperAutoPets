package com.mycompany.Clasificacion;

import com.mycompany.Mascotas.Mascota;

public class Terrestre extends Clasificacion{
    public Terrestre(){
        nombreTipo = "Terrestre";
    }
    @Override
    public Mascota [] aplicarEfectoCampo(Mascota [] mascota){
        return mascota;
    }
}
