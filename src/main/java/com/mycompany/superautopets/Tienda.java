package com.mycompany.superautopets;

import com.mycompany.Mascotas.Mascota;

public class Tienda {
    private int opcion;
    private Mascota[] mascotasCompradas;
    private Mascota[] arregloMascotas;
    private Tier mascotasTienda = new Tier();

    public Tienda(){
        
    }
    //se obtienen las mascotas de la tienda
    public Mascota [] mascotasTienda(int ronda){
         int contador = 0;
        if (ronda == 1) {
            arregloMascotas = new Mascota[3];
            System.out.println("\nMascotas del tier 1 desbloqueados...");
            while (contador < 3) {
                arregloMascotas[contador] = mascotasTienda.Tier1();
                contador++;
            } 
            for (int i = 0; i < arregloMascotas.length; i++) {
                System.out.println("Mascota " + (i+1));
                 System.out.println(arregloMascotas[i]);
            }
            
        } else if (ronda == 2 || ronda == 3) {
            arregloMascotas = new Mascota[3];
            System.out.println("\nMascotas del tier 2 desbloqueados...");
            while (contador < 3) {
                arregloMascotas[contador] = mascotasTienda.Tier2();
                contador++;
            } 
            for (int i = 0; i < arregloMascotas.length; i++) {
                System.out.println("Mascota " + (i+1));
                 System.out.println(arregloMascotas[i]);
            }
            
        } else if (ronda == 4 || ronda == 5) {
            arregloMascotas = new Mascota[4];
            System.out.println("\nMascotas del tier 3 desbloqueados");
            while (contador < 4) {
                arregloMascotas[contador] = mascotasTienda.Tier3();
                contador++;
            } 
            for (int i = 0; i < arregloMascotas.length; i++) {
                System.out.println("Mascota " + (i+1));
                 System.out.println(arregloMascotas[i]);
            }
        } else if (ronda == 6) {
            arregloMascotas = new Mascota[4];
            System.out.println("\nMascotas del tier 4 dosbloqueados");
            while (contador < 4) {
                arregloMascotas[contador] = mascotasTienda.Tier4();
                contador++;
            } 
            for (int i = 0; i < arregloMascotas.length; i++) {
                System.out.println("Mascota " + (i+1));
                 System.out.println(arregloMascotas[i]);
            }
        } else if(ronda == 7){
            arregloMascotas = new Mascota[5];
            System.out.println("\nMascota del tier 4 desbloqueados");
            while (contador < 4) {
                arregloMascotas[contador] = mascotasTienda.Tier4();
                contador++;
            } 
            for (int i = 0; i < arregloMascotas.length; i++) {
                System.out.println("Mascota " + (i+1));
                 System.out.println(arregloMascotas[i]);
            }
        }else if (ronda == 8 || ronda == 9) {
            arregloMascotas = new Mascota[5];
            System.out.println("\nMascotas del tier 5 desbloqueados");
            while (contador < 5) {
                arregloMascotas[contador] = mascotasTienda.Tier5();
                contador++;
            } 
            for (int i = 0; i < arregloMascotas.length; i++) {
                System.out.println("Mascota " + (i+1));
                 System.out.println(arregloMascotas[i]);
            }
        } else if (ronda == 10 || ronda == 11) {
            arregloMascotas = new Mascota[5];
            System.out.println("\nMascotas del tier 6 desbloqueados");
            while (contador < 5) {
                arregloMascotas[contador] = mascotasTienda.Tier6();
                contador++;
            } 
            for (int i = 0; i < arregloMascotas.length; i++) {
                System.out.println("Mascota " + (i+1));
                 System.out.println(arregloMascotas[i]);
            }
        } else {
            arregloMascotas = new Mascota[5];
            System.out.println("\nMascotas del tier 7 desbloqueados");
            while (contador < 5) {
                arregloMascotas[contador] = mascotasTienda.Tier7();
                contador++;
            } 
            for (int i = 0; i < arregloMascotas.length; i++) {
                System.out.println("Mascota " + (i+1));
                 System.out.println(arregloMascotas[i]);
            }
        }
        return arregloMascotas;
    }
}
