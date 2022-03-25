package com.mycompany.Alimento;

import com.mycompany.Mascotas.Mascota;

public class HuesoDeCarne extends Alimento{
    public HuesoDeCarne(){
        nombreAlimento = "Hueso de carne";
        descripccion = "Aumenta 5 puntos de daño generado y reduce el daño recivido a 1 punto.";
        tipoEfecto = true;
    }
    public Mascota alimentarMascota (Mascota mascotaAlimentada){
        mascotaAlimentada.RecivirDaño(mascotaAlimentada,1);
        mascotaAlimentada.puntosAtaque =+ 5;
        return mascotaAlimentada;
    }
}
