package com.mycompany.Alimento;

import com.mycompany.Mascotas.Mascota;

public class Ajo extends Alimento{
    public Ajo (){
        nombreAlimento = "Ajo";
        descripccion = "Reduce el daño recivido 2 puntos, para la mascota seleccionada.";
        tipoEfecto = true;
    }
    public Mascota alimentarMascota(Mascota mascotaAlimentda, Mascota mascotaAtaca){
        Mascota daño = new Mascota();
       if(mascotaAlimentda.puntosVida < 2){
           mascotaAlimentda = mascotaAlimentda.RecivirDaño(mascotaAlimentda, 1);
       }else {
           mascotaAlimentda = mascotaAlimentda.RecivirDaño(mascotaAlimentda,daño.dañoRecivido(mascotaAtaca)-2 );
       }
        return mascotaAlimentda;
    }
    
}
