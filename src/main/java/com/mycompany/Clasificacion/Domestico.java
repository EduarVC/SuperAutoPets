package com.mycompany.Clasificacion;

import com.mycompany.Mascotas.Mascota;

public class Domestico extends Clasificacion{
    public Domestico(){
        nombreTipo = "Domestico";
    }
    @Override
    public Mascota [] aplicarEfectoCampo(Mascota [] mascota){
        return mascota;
    }
}