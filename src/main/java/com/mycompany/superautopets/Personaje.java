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

    //Se obtienen las mascotas de la tienda 
    public Mascota[] obtenerMascota(int ronda) {
        int contador = 0;
        //Se desbloquean las mascotas del Tier 1
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
         //Se desbloquean las mascotas del Tier 2
        } else if (ronda == 2 && ronda == 3) {
            arregloMascotas = new Mascota[3];
            System.out.println("Mascotas del tier 2 desbloqueados...");
            while (contador < 3) {
                arregloMascotas[contador] = mascotasTienda.Tier2();
                contador++;
            } 
            for (Mascota arregloMascota : arregloMascotas) {
                System.out.println(arregloMascota);
            }
         //Se desbloquean las mascotas del Tier 3 y se aumenta la cantidad de mascotas de la tienda
        } else if (ronda == 4 && ronda == 5) {
            arregloMascotas = new Mascota[4];
            System.out.println("Mascotas del tier 3 desbloqueados");
            while (contador < 4) {
                arregloMascotas[contador] = mascotasTienda.Tier3();
                contador++;
            } 
            for (Mascota arregloMascota : arregloMascotas) {
                System.out.println(arregloMascota);
            }
        //Se desbloquean las mascotas del Tier 4
        } else if (ronda == 6) {
            arregloMascotas = new Mascota[4];
            System.out.println("Mascotas del tier 4 dosbloqueados");
            while (contador < 4) {
                arregloMascotas[contador] = mascotasTienda.Tier4();
                contador++;
            } 
            for (Mascota arregloMascota : arregloMascotas) {
                System.out.println(arregloMascota);
            }
         //Se desbloquean las mascotas del Tier 4 y se aumenta la cantidad de mascotas de la tienda
        } else if(ronda == 7){
            arregloMascotas = new Mascota[5];
            System.out.println("Mascota del tier 4 desbloqueados");
            while (contador < 4) {
                arregloMascotas[contador] = mascotasTienda.Tier4();
                contador++;
            } 
            for (Mascota arregloMascota : arregloMascotas) {
                System.out.println(arregloMascota);
            }
        //Se desbloquean las mascotas del Tier 5
        }else if (ronda == 8 && ronda == 9) {
            arregloMascotas = new Mascota[5];
            System.out.println("Mascotas del tier 5 desbloqueados");
            while (contador < 5) {
                arregloMascotas[contador] = mascotasTienda.Tier5();
                contador++;
            } 
            for (Mascota arregloMascota : arregloMascotas) {
                System.out.println(arregloMascota);
            }
        //Se desbloquean las mascotas del Tier 6
        } else if (ronda == 10 && ronda == 11) {
            arregloMascotas = new Mascota[5];
            System.out.println("Mascotas del tier 6 desbloqueados");
            while (contador < 5) {
                arregloMascotas[contador] = mascotasTienda.Tier6();
                contador++;
            } 
            for (Mascota arregloMascota : arregloMascotas) {
                System.out.println(arregloMascota);
            }
        //Se desbloquean las mascotas del Tier 7
        } else {
            arregloMascotas = new Mascota[5];
            System.out.println("MAscotas del tier 7 desbloqueados");
            while (contador < 5) {
                arregloMascotas[contador] = mascotasTienda.Tier7();
                contador++;
            } 
            for (Mascota arregloMascota : arregloMascotas) {
                System.out.println(arregloMascota);
            }
        }
        return arregloMascotas;
    }
}
