package com.mycompany.superautopets;

import com.mycompany.Mascotas.Mascota;
import com.mycompany.Mascotas.espacioVacio;

public class Personaje {

    protected Mascota[] arregloMascotas;
    protected Mascota[] mascotasObtenidas = new Mascota[5];
    protected Mascota espacioLibre;
    protected boolean espacioDisponible;
    protected int cantidadVictorias;
    protected int cantidadDerrotas;
    private Tier mascotasTienda = new Tier();

    //se incrementa la cantidad de victorias del jugador y del enemigo
    public int contadorVictorias(int victorias) {
        return cantidadVictorias += victorias;
    }

    //se incrementa la cantidad de derrotas del jugador y del enemigo
    public int contadorDerrotas(int derrotas) {
        return cantidadDerrotas += derrotas;
    }
}
