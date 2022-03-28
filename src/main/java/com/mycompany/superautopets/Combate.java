
package com.mycompany.superautopets;

import com.mycompany.Mascotas.Mascota;
import com.mycompany.Mascotas.espacioVacio;


public class Combate {
    public Mascota espacioLibre;
   public Combate(){
       espacioLibre = new espacioVacio();
   }
   
   public Mascota [] inicioCombate(Mascota [] mascotasJugador, Mascota [] mascotasEnemigo){
       int contador = 0;
       Mascota guardaMascotaJugador =espacioLibre;
       System.out.println("______________________");
       System.out.println("\nInicio del combate.");
       
       for (int i = 0; i < mascotasJugador.length; i++) {
           if(mascotasJugador[i] != espacioLibre){
               mascotasJugador[i] = guardaMascotaJugador;
               
               break;
           }
       }
       for (int i = 0; i < mascotasEnemigo.length; i++) {
           if(mascotasEnemigo[i] != espacioLibre){
               
           }
       }
       return mascotasJugador;
   }
   public Mascota verificarMascota (Mascota mascota){
       
       return mascota;
   }
}
