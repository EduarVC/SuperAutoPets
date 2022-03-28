package com.mycompany.Clasificacion;

import com.mycompany.Mascotas.Mascota;

public class Desertico extends Clasificacion{
    public Desertico(){
        nombreTipo = "Desertico";
    }
    @Override
    public Mascota [] aplicarEfectoCampo(Mascota [] mascota){
        return mascota;
    }
}
