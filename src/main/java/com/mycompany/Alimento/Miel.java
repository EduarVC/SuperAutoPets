package com.mycompany.Alimento;

import com.mycompany.Mascotas.Mascota;
import com.mycompany.Volador.Abeja;

public class Miel extends Alimento{
    public Miel(){
        nombreAlimento = "Miel";
        descripccion = "Invoca una abaje despues de morir la mascota seleccionada.";
        tipoEfecto = true;
    }
    public Mascota devolverMascota (){
        Mascota mascotaAbeja = new Abeja();
        return mascotaAbeja;
    }
}
