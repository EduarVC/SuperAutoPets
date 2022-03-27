package com.mycompany.superautopets;

import com.mycompany.Alimento.Alimento;
import com.mycompany.Mascotas.Mascota;

public class AlimentarMascota {

    private Alimento alimentoSeleccionado;
    private Mascota mascotaAlimentada;

    public AlimentarMascota() {

    }
    public Mascota darAlimento(Mascota mascotaSeleccionda, Alimento alimento ){
        if(alimento.tipoEfecto == true){
            mascotaSeleccionda.alimento = true;
            mascotaSeleccionda.nombreAlimento = alimento.nombreAlimento;
        }else{
            mascotaSeleccionda.nombreAlimento = alimento.nombreAlimento;
        }
        return mascotaAlimentada;
    }
    public boolean mascotaEspecifica(Alimento alimento){
        boolean mascotaEspecifica = false;
        if(null != alimento.nombreAlimento)switch (alimento.nombreAlimento) {
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
        return mascotaEspecifica;
    }
}
