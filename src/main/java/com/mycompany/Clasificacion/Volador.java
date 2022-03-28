package com.mycompany.Clasificacion;

import com.mycompany.Mascotas.Mascota;

public class Volador extends Clasificacion{
    public Volador(){
        nombreTipo = "Volador";
    }
    @Override
    public Mascota [] aplicarEfectoCampo(Mascota [] mascota){
        
        return mascota;
    }
}
