package com.mycompany.superautopets;

import com.mycompany.Alimento.*;
import com.mycompany.Mascotas.Mascota;

public class AlimentarMascota {

    Alimento alimentar = new Manzana();

    public AlimentarMascota() {

    }

    public Mascota darAlimento(Mascota mascotaSeleccionda, Alimento alimento) {

        if (alimento.tipoEfecto == true) {
            mascotaSeleccionda.nombreAlimento = alimento.nombreAlimento;
            mascotaSeleccionda.nombreEfecto = alimento.nombreEfecto;
        } else {
            if ("Manzana".equals(alimento.nombreAlimento)) {
                mascotaSeleccionda.nombreAlimento = alimento.nombreAlimento;
                mascotaSeleccionda = ((Manzana) alimentar).darAlimento(mascotaSeleccionda);
            }
        }
        mascotaSeleccionda.alimento = true;
        return mascotaSeleccionda;
    }
    //se aplican los efectos de los alimentos durante la pelea 
    public Mascota efectosAlimento(Mascota mascotaJugador, Mascota mascotaEnemigo) {
        if ("Naranja".equals(mascotaJugador.nombreAlimento)) {
            mascotaJugador.puntosAtaque += ((Naranja) alimentar).darAlimento(mascotaEnemigo.puntosAtaque);
        } else if ("Abjea".equals(mascotaJugador.nombreAlimento)) {
            if (mascotaJugador.puntosVida < 1) {
                mascotaJugador = ((Miel) alimentar).devolverMascota();
            }
        }
        mascotaJugador.alimento = true;
        return mascotaJugador;
    }

    public Mascota[] darAlimentoAleatorio(Mascota[] mascotasJugador, Alimento alimento) {
        // if(alimento.nombreAlimento == "")
        return mascotasJugador;
    }

    public boolean mascotaEspecifica(Alimento alimento) {
        boolean mascotaEspecifica = false;
        if (null != alimento.nombreAlimento) {
            switch (alimento.nombreAlimento) {
                case "Manzana":
                    mascotaEspecifica = true;
                    break;
                case "Naranja":
                    mascotaEspecifica = true;
                    break;
                case "Miel":
                    mascotaEspecifica = true;
                    break;
                case "Pastelillo":
                    mascotaEspecifica = true;
                    break;
                case "Hueso de carne":
                    mascotaEspecifica = true;
                    break;
                case "Pastilla para dormir":
                    mascotaEspecifica = true;
                    break;
                case "Ajo":
                    mascotaEspecifica = true;
                    break;
                case "Ensalada":
                    mascotaEspecifica = false;
                    break;
                case "Comida enlatada":
                    mascotaEspecifica = false;
                    break;
                case "Pera":
                    mascotaEspecifica = true;
                    break;
                case "Chile":
                    mascotaEspecifica = true;
                    break;
                case "Chocolate":
                    mascotaEspecifica = false;
                    break;
                case "Sushi":
                    mascotaEspecifica = false;
                    break;
                case "Melon":
                    mascotaEspecifica = true;
                    break;
                case "Hongo":
                    mascotaEspecifica = true;
                    break;
                case "Pizza":
                    mascotaEspecifica = false;
                    break;
                case "Carne":
                    mascotaEspecifica = true;
                    break;
                case "Gelatina":
                    mascotaEspecifica = true;
                    break;
                default:
                    break;
            }
        }
        return mascotaEspecifica;
    }
}
