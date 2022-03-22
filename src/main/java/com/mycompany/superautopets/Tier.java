package com.mycompany.superautopets;

import com.mycompany.Acuatico.*;
import com.mycompany.Alimento.*;
import com.mycompany.Domestico.*;
import com.mycompany.Insecto.*;
import com.mycompany.Mamifero.*;
import com.mycompany.Mascotas.*;
import com.mycompany.Reptil.*;
import com.mycompany.Solitariio.*;
import com.mycompany.Terrestre.*;
import com.mycompany.Volador.*;

public class Tier {

    private Mascota mascota;
    private Alimento alimento;

    public Tier() {
        this.mascota = new Mascota();
    }

    //metodo para obtener las mascotas de la tienda solo del tier 1
    public Mascota Tier1() {
        int numero = (int) (Math.random() * 8 + 1);
        return mascota = mascotaSeleccionada(numero);
    }

    //metodo para obtener las mascotas de la tienda incluyendo tier 2
    public Mascota Tier2() {
        int numero = (int) (Math.random() * 16 + 1);
        return mascota = mascotaSeleccionada(numero);
    }

    //metodo para obtener las mascotas de la tienda incluyendo tier 3
    public Mascota Tier3() {
        int numero = (int) (Math.random() * 27 + 1);
        return mascota = mascotaSeleccionada(numero);
    }

    //metodo para obtener las mascotas de la tienda incluyendo tier 4
    public Mascota Tier4() {
        int numero = (int) (Math.random() * 35 + 1);
        return mascota = mascotaSeleccionada(numero);
    }

    //metodo para obtener las mascotas de la tienda incluyendo tier 5
    public Mascota Tier5() {
        int numero = (int) (Math.random() * 43 + 1);
        return mascota = mascotaSeleccionada(numero);
    }

    //metodo para obtener las mascotas de la tienda incluyendo tier 6
    public Mascota Tier6() {
        int numero = (int) (Math.random() * 52 + 1);
        return mascota = mascotaSeleccionada(numero);
    }

    //metodo para obtener las mascotas de la tienda incluyendo tier 7
    public Mascota Tier7() {
        int numero = (int) (Math.random() * 54 + 1);
        return mascota = mascotaSeleccionada(numero);
    }

    //metodo para obtener los alimentos de la tienda solo del tier 1
    public Alimento tier1() {
        int numero = (int) (Math.random() * 3 + 1);
        return alimento = alimentoSeleccionado(numero);
    }

    //metodo para obtener los alimentos de la tienda incluyendo tier 2
    public Alimento tier2() {
        int numero = (int) (Math.random() * 6 + 1);
        return alimento = alimentoSeleccionado(numero);
    }
    //metodo para obtener los alimentos de la tienda incluyendo tier 3

    public Alimento tier3() {
        int numero = (int) (Math.random() * 10 + 1);
        return alimento = alimentoSeleccionado(numero);
    }
    //metodo para obtener los alimentos de la tienda incluyendo tier 4

    public Alimento tier4() {
        int numero = (int) (Math.random() * 13 + 1);
        return alimento = alimentoSeleccionado(numero);
    }
    //metodo para obtener los alimentos de la tienda incluyendo tier 5

    public Alimento tier5() {
        int numero = (int) (Math.random() * 15 + 1);
        return alimento = alimentoSeleccionado(numero);
    }
    //metodo para obtener los alimentos de la tienda incluyendo tier 6

    public Alimento tier6() {
        int numero = (int) (Math.random() * 17 + 1);
        return alimento = alimentoSeleccionado(numero);
    }
    //metodo para obtener los alimentos de la tienda incluyendo tier 7

    public Alimento tier7() {
        int numero = (int) (Math.random() * 18 + 1);
        return alimento = alimentoSeleccionado(numero);
    }

    //metodo para retornar la mascota seleccionada de cada random
    public Mascota mascotaSeleccionada(int numeroSeleccionado) {

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
    //metodo para obtener el alimento seleccionado aleatoriamente 
    public Alimento alimentoSeleccionado(int numeroSeleccionado) {

        switch (numeroSeleccionado) {
            case 1:
                alimento = new Manzana();
            case 2:
                alimento = new Naranja();
            case 3:
                alimento = new Miel();
            case 4:
                alimento = new Pastelillo();
            case 5:
                alimento = new HuesoDeCarne();
            case 6:
                alimento = new PastillaParaDormir();
            case 7:
                alimento = new Ajo();
            case 8:
                alimento = new Ensalada();
            case 9:
                alimento = new ComidaEnlatada();
            case 10:
                alimento = new Pera();
            case 11:
                alimento = new Chile();
            case 12:
                alimento = new Chocolate();
            case 13:
                alimento = new Sushi();
            case 14:
                alimento = new Melon();
            case 15:
                alimento = new Hongo();
            case 16:
                alimento = new Pizza();
            case 17:
                alimento = new Carne();
            case 18:
                alimento = new Gelatina();
        }
        return alimento;
    }
}
