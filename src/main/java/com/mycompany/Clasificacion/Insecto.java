
package com.mycompany.Clasificacion;

import com.mycompany.Mascotas.Mascota;

public class Insecto extends Clasificacion{
    
    public Insecto(){
        nombreTipo = "Insecto";
    }
    @Override
    public Mascota [] aplicarEfectoCampo(Mascota [] mascota){
        return mascota;
    }
}
