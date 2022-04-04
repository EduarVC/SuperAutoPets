package com.mycompany.Alimento;

import com.mycompany.Mascotas.Mascota;
import com.mycompany.Mascotas.espacioVacio;

public class ComidaEnlatada extends Alimento{
    public ComidaEnlatada(){
        nombreAlimento = "Comida enlatada";
        descripccion = "Aumenta 2 puntos de vida y 1 de daño a las mascotas de la tienda actuales, y a los próximos."; 
        tipoEfecto = false;
    }
    public Mascota[] aplicarEfectoAlimento(Mascota[] mascotasTienda){
        Mascota espacioLibre = new espacioVacio();
        for (int i = 0; i < mascotasTienda.length; i++) {
            if(mascotasTienda[i] != espacioLibre){
                mascotasTienda[i].puntosAtaque +=2;
                mascotasTienda[i].puntosVida +=1;
            }
        }
        return mascotasTienda;
    }
}
