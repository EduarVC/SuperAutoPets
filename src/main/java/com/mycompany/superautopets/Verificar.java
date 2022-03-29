
package com.mycompany.superautopets;

import com.mycompany.Acuatico.Castor;
import com.mycompany.Mascotas.Mascota;

public class Verificar {
    public Verificar(){
    }
    public Mascota [] verificarHabilidad(Mascota [] mascotasJugador, int numVerificacion, Mascota [] mascotasEnemigo){
        switch (numVerificacion) {
            case 1:
                for (int i = 0; i < mascotasJugador.length; i++) {
                    if("Nutria".equals(mascotasJugador[i].nombreMascota)){
                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i], mascotasEnemigo);
                    }
                }   break;
            case 2:
//                for (int i = 0; i < mascotasJugador.length; i++) {
//                    if("Castor".equals(mascotasJugador[i].nombreMascota)){
//                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i]);
//                    }
//                }   break;
            case 3:
                for (int i = 0; i < mascotasJugador.length; i++) {
                    if("Escarabajo".equals(mascotasJugador[i].nombreMascota)){
                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i], mascotasEnemigo);
                    }
                }   break;
            case 4:
                for (int i = 0; i < mascotasJugador.length; i++) {
                    if("Mosquito".equals(mascotasJugador[i].nombreMascota)){
                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i], mascotasEnemigo);
                    }
                }   break;
            case 5:
                for (int i = 0; i < mascotasJugador.length; i++) {
                    if("Pescado".equals(mascotasJugador[i].nombreMascota)){
                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i], mascotasEnemigo);
                    }
                }   break;
            case 6:
                for (int i = 0; i < mascotasJugador.length; i++) {
                    if("Caballo".equals(mascotasJugador[i].nombreMascota)){
                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i], mascotasEnemigo);
                    }
                }   break;
            case 7:
                for (int i = 0; i < mascotasJugador.length; i++) {
                    if("Hormiga".equals(mascotasJugador[i].nombreMascota)){
                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i], mascotasEnemigo);
                    }else if("Grillo".equals(mascotasJugador[i].nombreMascota)){
                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i], mascotasEnemigo);
                    }
                }   break;
            default:
                break;
        }
        return mascotasJugador;
    }
    public Mascota [] aplicarHabilidadVendidos (Mascota [] mascotasJugador, Mascota mascotaVendida, Mascota [] mascotasEnemigo){
        if ("Castor".equals(mascotaVendida.nombreMascota)){  
         ((Castor) mascotaVendida).vendido = true;
         mascotaVendida.aplicarHabilidad(mascotasJugador, mascotaVendida, mascotasEnemigo);
        }
        return mascotasJugador;
    }
}
