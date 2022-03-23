package com.mycompany.superautopets;

import com.mycompany.Mascotas.Mascota;
import com.mycompany.Mascotas.espacioVacio;

public class IA extends Personaje {

    private Tier mascotas;
    public IA() {
        cantidadDerrotas = 0;
        cantidadVictorias = 0;
        espacioLibre = new espacioVacio();
        espacioDisponible = true;
        mascotasObtenidas[0] = espacioLibre;
        mascotasObtenidas[1] = espacioLibre;
        mascotasObtenidas[2] = espacioLibre;
        mascotasObtenidas[3] = espacioLibre;
        mascotasObtenidas[4] = espacioLibre;
        mascotas = new Tier();
    }
    public Mascota[] obtenreMascotasIA(int ronda){
        
        int contador = 0;
         if (ronda == 1) {
            arregloMascotas = new Mascota[3];
            while (contador < 3) {
                arregloMascotas[contador] = mascotas.Tier1();
                contador++;
            }

        } else if (ronda == 2 || ronda == 3) {
            arregloMascotas = new Mascota[5];
            while (contador < 5) {
                arregloMascotas[contador] = mascotas.Tier2();
                contador++;
            }}else if (ronda == 4 || ronda == 5) {
            arregloMascotas = new Mascota[5];
            while (contador < 5) {
                arregloMascotas[contador] = mascotas.Tier3();
                contador++;
            }

        } else if (ronda == 6) {
            arregloMascotas = new Mascota[5];
            while (contador < 5) {
                arregloMascotas[contador] = mascotas.Tier4();
                contador++;
            }

        } else if (ronda == 7) {
            arregloMascotas = new Mascota[5];
            while (contador < 5) {
                arregloMascotas[contador] = mascotas.Tier4();
                contador++;
            }

        } else if (ronda == 8 || ronda == 9) {
            arregloMascotas = new Mascota[5];
            while (contador < 5) {
                arregloMascotas[contador] = mascotas.Tier5();
                contador++;
            }

        } else if (ronda == 10 || ronda == 11) {
            arregloMascotas = new Mascota[5];
            while (contador < 5) {
                arregloMascotas[contador] = mascotas.Tier6();
                contador++;
            }

        } else {
            arregloMascotas = new Mascota[5];
            while (contador < 5) {
                arregloMascotas[contador] = mascotas.Tier7();
                contador++;
            }
        }

         return arregloMascotas;
    }
    public void ImprimirMascotasIA(Mascota [] mascotasOb){
        for (int i = 0; i < mascotasOb.length; i++) {
                   
        for (int j = 0; j < mascotasObtenidas.length ; j++) {
            if(mascotasObtenidas[i] == espacioLibre){
                mascotasObtenidas[i] = mascotasOb[i];
                break;
            }
        }
    }
        System.out.println("______________________");
        System.out.println("\nMascotas Del Enemigo\n");
        for (int i = 0; i < mascotasObtenidas.length; i++) {
            System.out.println(String.format("Mascota %d", (i+1)));
            System.out.println(mascotasObtenidas[i]);
        }
        
    }
}
