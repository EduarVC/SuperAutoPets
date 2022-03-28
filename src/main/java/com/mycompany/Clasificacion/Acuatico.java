package com.mycompany.Clasificacion;

import com.mycompany.Mascotas.Mascota;

public class Acuatico extends Clasificacion{
    public Acuatico(){
        nombreTipo = "Acuatico";
    }
    @Override
    public Mascota [] aplicarEfectoCampo(Mascota [] mascota){
        for (int i = 0; i < mascota.length; i++) {
            
        }
        return mascota;
    }
}
