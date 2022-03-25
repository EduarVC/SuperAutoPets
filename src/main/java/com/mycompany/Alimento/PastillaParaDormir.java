package com.mycompany.Alimento;

import com.mycompany.Mascotas.Mascota;
import com.mycompany.Mascotas.espacioVacio;

public class PastillaParaDormir extends Alimento{
    public PastillaParaDormir(){
        nombreAlimento = "Pastilla para dormir";
        descripccion = "La mascota seleccionada se desmaya durante la fase de compra, \nlos efectos realizados por el mismo se haran permanentemente.";
        tipoEfecto = false;
    }
    public Mascota alimentarMascota(Mascota mascotaAlimentada){
        //mascotaAlimentada.efectoMascota();
        mascotaAlimentada = new espacioVacio();
        return mascotaAlimentada;
    }
}
