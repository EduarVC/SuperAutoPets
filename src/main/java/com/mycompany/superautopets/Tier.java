package com.mycompany.superautopets;

import com.mycompany.Acuatico.Ballena;
import com.mycompany.Acuatico.Castor;
import com.mycompany.Acuatico.Delfin;
import com.mycompany.Acuatico.Foca;
import com.mycompany.Acuatico.Hipopotamo;
import com.mycompany.Acuatico.Pescado;
import com.mycompany.Acuatico.Pulpo;
import com.mycompany.Acuatico.Sapo;
import com.mycompany.Domestico.Ardilla;
import com.mycompany.Insecto.Araña;
import com.mycompany.Insecto.Caracol;
import com.mycompany.Insecto.Escarabajo;
import com.mycompany.Insecto.Grillo;
import com.mycompany.Insecto.Hormiga;
import com.mycompany.Insecto.Mosca;
import com.mycompany.Mamifero.Buey;
import com.mycompany.Mamifero.Caballo;
import com.mycompany.Mamifero.Camello;
import com.mycompany.Mamifero.Conejo;
import com.mycompany.Mamifero.Gato;
import com.mycompany.Mamifero.Mono;
import com.mycompany.Mamifero.Nutria;
import com.mycompany.Mamifero.Panda;
import com.mycompany.Mamifero.Venado;
import com.mycompany.Mascotas.Mascota;
import com.mycompany.Reptil.Camaleon;
import com.mycompany.Reptil.Cocodrilo;
import com.mycompany.Reptil.Tortuga;
import com.mycompany.Solitariio.Escorpion;
import com.mycompany.Solitariio.Mapache;
import com.mycompany.Terrestre.Canguro;
import com.mycompany.Terrestre.Elefante;
import com.mycompany.Terrestre.Gorila;
import com.mycompany.Terrestre.Jaguar;
import com.mycompany.Terrestre.Jirafa;
import com.mycompany.Terrestre.Leopardo;
import com.mycompany.Terrestre.Llama;
import com.mycompany.Terrestre.Lobo;
import com.mycompany.Terrestre.Mamut;
import com.mycompany.Terrestre.Oveja;
import com.mycompany.Terrestre.PuercoEspin;
import com.mycompany.Terrestre.Puma;
import com.mycompany.Terrestre.Rata;
import com.mycompany.Terrestre.Rinoceronte;
import com.mycompany.Terrestre.Serpiente;
import com.mycompany.Terrestre.Tigre;
import com.mycompany.Terrestre.Vaca;
import com.mycompany.Terrestre.Zorro;
import com.mycompany.Volador.Buho;
import com.mycompany.Volador.Chompipe;
import com.mycompany.Volador.Dodo;
import com.mycompany.Volador.Loro;
import com.mycompany.Volador.Mosquito;
import com.mycompany.Volador.Pavoreal;
import com.mycompany.Volador.Quetzal;

public class Tier {

    private Mascota mascota;
    private int contador = 1;
    Mascota[] mascotas = new Mascota[5];

    public Mascota[] Tier1() {
        while (contador < 4) {
            int numero = (int) (Math.random() * 8 + 1);
            mascotas[contador - 1] = mascotaSeleccionaada(numero);
            contador++;
        }
        return mascotas;
    }

    public Mascota[] Tier2() {
        while (contador < 4) {
            int numero = (int) (Math.random() * 16 + 1);
            mascotas[contador - 1] = mascotaSeleccionaada(numero);
            contador++;
        }
        return mascotas;
    }

    public Mascota[] Tier3() {
        while (contador < 5) {
            int numero = (int) (Math.random() * 27 + 1);
            mascotas[contador - 1] = mascotaSeleccionaada(numero);
            contador++;
        }
        return mascotas;
    }

    public Mascota[] Tier4() {
        while (contador < 5) {
            int numero = (int) (Math.random() * 35 + 1);
            mascotas[contador - 1] = mascotaSeleccionaada(numero);
            contador++;
        }
        return mascotas;
    }

    public Mascota[] Tier5() {
        while (contador < 6) {
            int numero = (int) (Math.random() * 43 + 1);
            mascotas[contador - 1] = mascotaSeleccionaada(numero);
            contador++;
        }
        return mascotas;
    }

    public Mascota[] Tier6() {
        while (contador < 6) {
            int numero = (int) (Math.random() * 52 + 1);
            mascotas[contador - 1] = mascotaSeleccionaada(numero);
            contador++;
        }
        return mascotas;
    }

    public Mascota[] Tier7() {
        while (contador < 6) {
            int numero = (int) (Math.random() * 54 + 1);
            mascotas[contador - 1] = mascotaSeleccionaada(numero);
            contador++;
        }
        return mascotas;
    }

    public Mascota mascotaSeleccionaada(int numeroSeleccionado) {

        switch (numeroSeleccionado) {
            case 1 -> {
                mascota = new Hormiga();
            }
            case 2 -> {
                mascota = new Pescado();
            }
            case 3 -> {
                mascota = new Mosquito();
            }
            case 4 -> {
                mascota = new Grillo();
            }
            case 5 -> {
                mascota = new Castor();
            }
            case 6 -> {
                mascota = new Caballo();
            }
            case 7 -> {
                mascota = new Nutria();
            }
            case 8 -> {
                mascota = new Escarabajo();
            }
            case 9 -> {
                mascota = new Sapo();
            }
            case 10 -> {
                mascota = new Dodo();
            }
            case 11 -> {
                mascota = new Elefante();
            }
            case 12 -> {
                mascota = new PuercoEspin();
            }
            case 13 -> {
                mascota = new Pavoreal();
            }
            case 14 -> {
                mascota = new Rata();
            }
            case 15 -> {
                mascota = new Zorro();
            }
            case 16 -> {
                mascota = new Araña();
            }
            case 17 -> {
                mascota = new Camello();
            }
            case 18 -> {
                mascota = new Mapache();
            }
            case 19 -> {
                mascota = new Jirafa();
            }
            case 20 -> {
                mascota = new Tortuga();
            }
            case 21 -> {
                mascota = new Caracol();
            }
            case 22 -> {
                mascota = new Oveja();
            }
            case 23 -> {
                mascota = new Conejo();
            }
            case 24 -> {
                mascota = new Lobo();
            }
            case 25 -> {
                mascota = new Buey();
            }
            case 26 -> {
                mascota = new Canguro();
            }
            case 27 -> {
                mascota = new Buho();
            }
            case 28 -> {
                mascota = new Venado();
            }
            case 29 -> {
                mascota = new Loro();
            }
            case 30 -> {
                mascota = new Hipopotamo();
            }
            case 31 -> {
                mascota = new Delfin();
            }
            case 32 -> {
                mascota = new Puma();
            }
            case 33 -> {
                mascota = new Ballena();
            }
            case 34 -> {
                mascota = new Ardilla();
            }
            case 35 -> {
                mascota = new Llama();
            }
            case 36 -> {
                mascota = new Foca();
            }
            case 37 -> {
                mascota = new Jaguar();
            }
            case 38 -> {
                mascota = new Escorpion();
            }
            case 39 -> {
                mascota = new Rinoceronte();
            }
            case 40 -> {
                mascota = new Mono();
            }
            case 41 -> {
                mascota = new Cocodrilo();
            }
            case 42 -> {
                mascota = new Vaca();
            }
            case 43 -> {
                mascota = new Chompipe();
            }
            case 44 -> {
                mascota = new Panda();
            }
            case 45 -> {
                mascota = new Gato();
            }
            case 46 -> {
                mascota = new Tigre();
            }
            case 47 -> {
                mascota = new Serpiente();
            }
            case 48 -> {
                mascota = new Mamut();
            }
            case 49 -> {
                mascota = new Leopardo();
            }
            case 50 -> {
                mascota = new Gorila();
            }
            case 51 -> {
                mascota = new Pulpo();
            }
            case 52 -> {
                mascota = new Mosca();
            }
            case 53 -> {
                mascota = new Quetzal();
            }
            case 54 -> {
                mascota = new Camaleon();
            }
        }
        return mascota;
    }
}
