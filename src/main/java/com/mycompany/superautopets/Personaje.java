package com.mycompany.superautopets;

import com.mycompany.Insecto.Hormiga;
import com.mycompany.Mascotas.Mascota;
import com.mycompany.Mascotas.espacioVacio;

public class Personaje {

    protected Mascota[] arregloMascotas = new Mascota[5];
    protected int cantidadVictorias;
    protected int cantidadDerrotas;
    private Tier mascotasTienda = new Tier();

    public int contadorVictorias(int victorias) {
        return cantidadVictorias += victorias;
    }

    public int contadorDerrotas(int derrotas) {
        return cantidadDerrotas += derrotas;
    }

    public Mascota[] obtenerMascota(int ronda) {
        int contador = 0;
        if (ronda == 1) {
            System.out.println("Mascotas del tier 1 desbloqueados...");
            while (contador < 3) {
                arregloMascotas[contador] = mascotasTienda.Tier1();
                contador++;
            }
            arregloMascotas[3] = new espacioVacio();
            arregloMascotas[4] = new espacioVacio(); 
            for (int i = 0; i < arregloMascotas.length ; i++) {
                System.out.println(arregloMascotas[i]);
            }
        } else if (ronda == 2 && ronda == 3) {
            System.out.println("Mascotas del tier 2 desbloqueados...");
        } else if (ronda == 4 && ronda == 5) {
            System.out.println("Mascotas del tier 3 desbloqueados");
        } else if (ronda == 6 && ronda == 7) {
            System.out.println("Mascotas del tier 4 dosbloqueado");
        } else if (ronda == 8 && ronda == 9) {
            System.out.println("Mascotas del tier 5 desbloqueados");
        } else if (ronda == 10 && ronda == 11) {
            System.out.println("Mascotas del tier 6 desbloqueados");
        } else {
            System.out.println("MAscotas del tier 7 desbloqueados");
        }
        return arregloMascotas;
    }
}
