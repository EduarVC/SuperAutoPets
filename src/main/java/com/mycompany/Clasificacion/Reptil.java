package com.mycompany.Clasificacion;

import com.mycompany.Mascotas.Mascota;

public class Reptil extends Clasificacion{
    public Reptil(){
        nombreTipo = "Reptil";
    }
    @Override
    public Mascota [] aplicarEfectoCampo(Mascota [] mascota){
        return mascota;
    }
}
