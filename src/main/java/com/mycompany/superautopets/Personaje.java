package com.mycompany.superautopets;

import com.mycompany.Insecto.Hormiga;
import com.mycompany.Mascotas.Mascota;
import com.mycompany.Mascotas.espacioVacio;

public class Personaje {

    protected Mascota[] arregloMascotas;
    protected Mascota[] mascotasObtenidas = new Mascota[5];
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
            arregloMascotas = new Mascota[3];
            System.out.println("Mascotas del tier 1 desbloqueados...");
            while (contador < 3) {
                arregloMascotas[contador] = mascotasTienda.Tier1();
                contador++;
            } 
            for (Mascota arregloMascota : arregloMascotas) {
                System.out.println(arregloMascota);
            }
        } else if (ronda == 2 && ronda == 3) {
            arregloMascotas = new Mascota[3];
            System.out.println("Mascotas del tier 2 desbloqueados...");
            while (contador < 3) {
                arregloMascotas[contador] = mascotasTienda.Tier1();
                contador++;
            } 
            for (Mascota arregloMascota : arregloMascotas) {
                System.out.println(arregloMascota);
            }
            
        } else if (ronda == 4 && ronda == 5) {
            arregloMascotas = new Mascota[4];
            System.out.println("Mascotas del tier 3 desbloqueados");
            while (contador < 4) {
                arregloMascotas[contador] = mascotasTienda.Tier1();
                contador++;
            } 
            for (Mascota arregloMascota : arregloMascotas) {
                System.out.println(arregloMascota);
            }
        } else if (ronda == 6 && ronda == 7) {
            arregloMascotas = new Mascota[4];
            System.out.println("Mascotas del tier 4 dosbloqueado");
            while (contador < 4) {
                arregloMascotas[contador] = mascotasTienda.Tier1();
                contador++;
            } 
            for (Mascota arregloMascota : arregloMascotas) {
                System.out.println(arregloMascota);
            }
        } else if (ronda == 8 && ronda == 9) {
            arregloMascotas = new Mascota[5];
            System.out.println("Mascotas del tier 5 desbloqueados");
            while (contador < 5) {
                arregloMascotas[contador] = mascotasTienda.Tier1();
                contador++;
            } 
            for (Mascota arregloMascota : arregloMascotas) {
                System.out.println(arregloMascota);
            }
        } else if (ronda == 10 && ronda == 11) {
            arregloMascotas = new Mascota[5];
            System.out.println("Mascotas del tier 6 desbloqueados");
            while (contador < 5) {
                arregloMascotas[contador] = mascotasTienda.Tier1();
                contador++;
            } 
            for (Mascota arregloMascota : arregloMascotas) {
                System.out.println(arregloMascota);
            }
        } else {
            arregloMascotas = new Mascota[5];
            System.out.println("MAscotas del tier 7 desbloqueados");
            while (contador < 5) {
                arregloMascotas[contador] = mascotasTienda.Tier1();
                contador++;
            } 
            for (Mascota arregloMascota : arregloMascotas) {
                System.out.println(arregloMascota);
            }
        }
        return arregloMascotas;
    }
}
