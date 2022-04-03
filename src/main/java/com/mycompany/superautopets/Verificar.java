package com.mycompany.superautopets;

import com.mycompany.Acuatico.Castor;
import com.mycompany.Mascotas.Mascota;
import com.mycompany.Volador.Buho;

public class Verificar {

    public Verificar() {
    }

    public Mascota[] verificarHabilidad(Mascota[] mascotasJugador, int numVerificacion, Mascota[] mascotasEnemigo) {
        switch (numVerificacion) {
            case 1:
                for (int i = 0; i < mascotasJugador.length; i++) {
                    if ("Nutria".equals(mascotasJugador[i].nombreMascota)) {
                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i], mascotasEnemigo);
                    }else if ("Caracol".equals(mascotasJugador[i].nombreMascota)) {
                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i], mascotasEnemigo);
                    }
                }
                break;
            case 2:
                for (int i = 0; i < mascotasJugador.length; i++) {
                    if ("Elefante".equals(mascotasJugador[i].nombreMascota)) {
                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i], mascotasEnemigo);
                    }else if ("Zorro".equals(mascotasJugador[i].nombreMascota)) {
                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i], mascotasEnemigo);
                    }else if ("Buey".equals(mascotasJugador[i].nombreMascota)) {
                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i], mascotasEnemigo);
                    }else if ("Canguro".equals(mascotasJugador[i].nombreMascota)) {
                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i], mascotasEnemigo);
                    }
                }
                break;
            case 3:
                for (int i = 0; i < mascotasJugador.length; i++) {
                    if ("Escarabajo".equals(mascotasJugador[i].nombreMascota)) {
                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i], mascotasEnemigo);
                    }else if ("Conejo".equals(mascotasJugador[i].nombreMascota)) {
                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i], mascotasEnemigo);
                    }
                }
                break;
            case 4:
                for (int i = 0; i < mascotasJugador.length; i++) {
                    if ("Mosquito".equals(mascotasJugador[i].nombreMascota)) {
                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i], mascotasEnemigo);
                    } else if ("Sapo".equals(mascotasJugador[i].nombreMascota)) {
                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i], mascotasEnemigo);
                    } else if ("Dodo".equals(mascotasJugador[i].nombreMascota)) {
                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i], mascotasEnemigo);
                    }else if ("Camello".equals(mascotasJugador[i].nombreMascota)) {
                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i], mascotasEnemigo);
                    }
                }
                break;
            case 5:
                for (int i = 0; i < mascotasJugador.length; i++) {
                    if ("Pescado".equals(mascotasJugador[i].nombreMascota)) {
                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i], mascotasEnemigo);
                    }
                }
                break;
            case 6:
                for (int i = 0; i < mascotasJugador.length; i++) {
                    if ("Caballo".equals(mascotasJugador[i].nombreMascota)) {
                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i], mascotasEnemigo);
                    }
                }
                break;
            case 7:
                for (int i = 0; i < mascotasJugador.length; i++) {
                    if ("Hormiga".equals(mascotasJugador[i].nombreMascota)) {
                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i], mascotasEnemigo);
                    } else if ("Grillo".equals(mascotasJugador[i].nombreMascota)) {
                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i], mascotasEnemigo);
                    }else if ("Puerco Espin".equals(mascotasJugador[i].nombreMascota)) {
                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i], mascotasEnemigo);
                    }else if ("Rata".equals(mascotasJugador[i].nombreMascota)) {
                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i], mascotasEnemigo);
                    }else if ("Araña".equals(mascotasJugador[i].nombreMascota)) {
                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i], mascotasEnemigo);
                    }else if ("Mapache".equals(mascotasJugador[i].nombreMascota)) {
                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i], mascotasEnemigo);
                    }else if ("Tortuga".equals(mascotasJugador[i].nombreMascota)) {
                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i], mascotasEnemigo);
                    }else if ("Oveja".equals(mascotasJugador[i].nombreMascota)) {
                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i], mascotasEnemigo);
                    }
                }
                break;
            case 8:
                for (int i = 0; i < mascotasJugador.length; i++) {
                    if ("Pavoreal".equals(mascotasJugador[i].nombreMascota)) {
                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i], mascotasEnemigo);
                    }
                }
                break;
            case 9:
                 for (int i = 0; i < mascotasJugador.length; i++) {
                    if ("Jirafa".equals(mascotasJugador[i].nombreMascota)) {
                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i], mascotasEnemigo);
                    }
                }
                break;
            case 10: 
                for (int i = 0; i < mascotasJugador.length; i++) {
                    if ("Lobo".equals(mascotasJugador[i].nombreMascota)) {
                        mascotasJugador[i].aplicarHabilidad(mascotasJugador, mascotasJugador[i], mascotasEnemigo);
                    }
                }
                break;
            default:
                break;
        }
        return mascotasJugador;
    }

    public Mascota[] aplicarHabilidadVendidos(Mascota[] mascotasJugador, Mascota mascotaVendida, Mascota[] mascotasEnemigo) {
        if ("Castor".equals(mascotaVendida.nombreMascota)) {
            ((Castor) mascotaVendida).vendido = true;
            mascotasJugador = mascotaVendida.aplicarHabilidad(mascotasJugador, mascotaVendida, mascotasEnemigo);
        }else if("Buho".equals(mascotaVendida.nombreMascota)){
            mascotasJugador = mascotaVendida.aplicarHabilidad(mascotasJugador, mascotaVendida, mascotasEnemigo);
        }
        return mascotasJugador;
    }
}
