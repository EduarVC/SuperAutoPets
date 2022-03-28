package com.mycompany.Clasificacion;

import com.mycompany.Mascotas.Mascota;

public class Mamifero extends Clasificacion{
    public Mamifero(){
        nombreTipo = "Mamifero";
    }
    @Override
    public Mascota [] aplicarEfectoCampo(Mascota [] mascota){
        return mascota;
    }
}
