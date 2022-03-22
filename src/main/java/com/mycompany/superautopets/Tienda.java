package com.mycompany.superautopets;

import com.mycompany.Alimento.Alimento;
import com.mycompany.Mascotas.Mascota;

public class Tienda {

    private Mascota[] arregloMascotas;
    private Tier mascotasTienda = new Tier();
    private Tier alimetosTienda = new Tier();
    private Alimento[] arregloAlimento;

    public Tienda() {
        arregloAlimento = new Alimento[2];
    }

    //Se desbloquean las mascotas segun la ronda y se obtienen el arreglo de las mascotas de la tienda
    public Mascota[] mascotasTienda(int ronda) {
        int contador = 0;
        if (ronda == 1) {
            arregloMascotas = new Mascota[3];
            System.out.println("\nMascotas del tier 1 desbloqueados...");
            while (contador < 3) {
                arregloMascotas[contador] = mascotasTienda.Tier1();
                contador++;
            }

        } else if (ronda == 2 || ronda == 3) {
            arregloMascotas = new Mascota[3];
            System.out.println("\nMascotas del tier 2 desbloqueados...");
            while (contador < 3) {
                arregloMascotas[contador] = mascotasTienda.Tier2();
                contador++;
            }

        } else if (ronda == 4 || ronda == 5) {
            arregloMascotas = new Mascota[4];
            System.out.println("\nMascotas del tier 3 desbloqueados");
            while (contador < 4) {
                arregloMascotas[contador] = mascotasTienda.Tier3();
                contador++;
            }

        } else if (ronda == 6) {
            arregloMascotas = new Mascota[4];
            System.out.println("\nMascotas del tier 4 dosbloqueados");
            while (contador < 4) {
                arregloMascotas[contador] = mascotasTienda.Tier4();
                contador++;
            }

        } else if (ronda == 7) {
            arregloMascotas = new Mascota[5];
            System.out.println("\nMascota del tier 4 desbloqueados");
            while (contador < 4) {
                arregloMascotas[contador] = mascotasTienda.Tier4();
                contador++;
            }

        } else if (ronda == 8 || ronda == 9) {
            arregloMascotas = new Mascota[5];
            System.out.println("\nMascotas del tier 5 desbloqueados");
            while (contador < 5) {
                arregloMascotas[contador] = mascotasTienda.Tier5();
                contador++;
            }

        } else if (ronda == 10 || ronda == 11) {
            arregloMascotas = new Mascota[5];
            System.out.println("\nMascotas del tier 6 desbloqueados");
            while (contador < 5) {
                arregloMascotas[contador] = mascotasTienda.Tier6();
                contador++;
            }

        } else {
            arregloMascotas = new Mascota[5];
            System.out.println("\nMascotas del tier 7 desbloqueados");
            while (contador < 5) {
                arregloMascotas[contador] = mascotasTienda.Tier7();
                contador++;
            }
        }
        return arregloMascotas;
    }

    //Se desbloquean los alimentos segun la ronda y se obtiene el arreglo de los alimentos de la tienda
    public Alimento[] alimentosTienda(int ronda) {
        int contador = 0;
        if (ronda == 1) {
            System.out.println("\nAlimentos del tier 1 desbloqueados...");
            while (contador < arregloAlimento.length) {
                arregloAlimento[contador] = alimetosTienda.tier1();
                contador++;
            }
        } else if (ronda == 2 || ronda == 3) {
            System.out.println("\nAlimentos del tier 2 desbloqueados...");
            while (contador < arregloAlimento.length) {
                arregloAlimento[contador] = alimetosTienda.tier2();
                contador++;
            }
        } else if (ronda == 4 || ronda == 5) {
            System.out.println("\nAlimentos del tier 3 desbloqueados...");
            while (contador < arregloAlimento.length) {
                arregloAlimento[contador] = alimetosTienda.tier3();
                contador++;
            }
        } else if (ronda == 6 || ronda == 7) {
            System.out.println("\nAlimentos del tier 4 desbloqueados...");
            while (contador < arregloAlimento.length) {
                arregloAlimento[contador] = alimetosTienda.tier4();
                contador++;
            }
        } else if (ronda == 8 || ronda == 9) {
            System.out.println("\nAlimentos del tier 5 desbloqueados...");
            while (contador < arregloAlimento.length) {
                arregloAlimento[contador] = alimetosTienda.tier5();
                contador++;
            }
        } else if (ronda == 10 || ronda == 11) {
            System.out.println("\nAlimentos del tier 6 desbloqueados...");
            while (contador < arregloAlimento.length) {
                arregloAlimento[contador] = alimetosTienda.tier6();
                contador++;
            }
        } else {
            System.out.println("\nAlimentos del tier 7 desbloqueados...");
            while (contador < arregloAlimento.length) {
                arregloAlimento[contador] = alimetosTienda.tier7();
                contador++;
            }
        }
        return arregloAlimento;
    }
}
