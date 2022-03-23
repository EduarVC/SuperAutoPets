package com.mycompany.superautopets;

import com.mycompany.Alimento.Alimento;
import com.mycompany.Mascotas.Mascota;
import com.mycompany.Mascotas.espacioVacio;
import java.util.Scanner;

public class Jugador extends Personaje {

    static Scanner entrada = new Scanner(System.in);

    protected int vidaJugador;
    private int monedasOro;

    public Jugador() {

        vidaJugador = 10;
        monedasOro = 10;
        cantidadDerrotas = 0;
        cantidadVictorias = 0;
        espacioLibre = new espacioVacio();
        espacioDisponible = true;
        mascotasObtenidas[0] = espacioLibre;
        mascotasObtenidas[1] = espacioLibre;
        mascotasObtenidas[2] = espacioLibre;
        mascotasObtenidas[3] = espacioLibre;
        mascotasObtenidas[4] = espacioLibre;

    }

    public void ImprimirDatosJugador() {
        System.out.println("");
    }

    //metodo para obtener a las macotas que el jugador desee en su equipo 
    public Mascota[] ComprarMascotas(Mascota[] mascotasTienda) {
        Modos mascotasTiendaDisponibles = new Modos();
        int opcion;

        while (monedasOro > 2 && espacioDisponible == true) {
            espacioDisponible = false;
            System.out.println("Tienes: " + monedasOro + " monedas de oro");
            System.out.println("Elija la Mascota que desee comprar:");
            opcion = entrada.nextInt();
            if (opcion < 1 || opcion > mascotasTienda.length) {
                System.out.println("\nOpcion invalida.\n");
                espacioDisponible = true;
            } else {
                if (mascotasTienda[opcion - 1] == espacioLibre) {
                    System.out.println("\nLa mascota seleccionada ya fue comprada, Intente de nuevo.\n");
                } else {

                    for (int i = 0; i < mascotasObtenidas.length; i++) {
                        if (mascotasObtenidas[i] == espacioLibre) {
                            espacioDisponible = true;
                        }
                    }
                    if (espacioDisponible == true) {
                        //se agragan las mascotas compradas 
                        for (int i = 0; i < mascotasObtenidas.length; i++) {
                            if (mascotasObtenidas[i] == espacioLibre) {
                                mascotasObtenidas[i] = mascotasTienda[opcion - 1];
                                mascotasTienda[opcion - 1] = espacioLibre;

                                System.out.println("Mascota Obtenida\n");
                                monedasOro -= 3;
                                mascotasTiendaDisponibles.mascotasTienda = mascotasTienda;
                                break;
                            }
                        }
                    } else {
                        System.out.println("\nNo tienes cupo en tu equipo");
                        System.out.println("Preciona cualquier tecla para continuar...");
                        entrada.nextLine();
                        mascotasTiendaDisponibles.mascotasTienda = mascotasTienda;
                        espacioDisponible = false;
                    }
                }

                System.out.println("Precione Enter para seguir comprando.");
                System.out.println("precione 1 para regresar al menu anterior.");
                entrada.nextLine();
                if ("1".equals(entrada.nextLine())) {
                    espacioDisponible = false;
                }
            }
        }
        if (monedasOro < 3) {
            //se le indica al jugador que ya no cuenta con las monedas necesarias para seguir comprando
            System.out.println("\nTienes: " + monedasOro + " monedas de oro, no cuentas con lo suficiente para seguir comprando.");
        } else {
            System.out.println("\nTienes: " + monedasOro + " monedas de oro");
        }
        //Se muestran las mascotas compradas
        System.out.println("_____________________________");
        System.out.println("Mascotas de tu equipo: ");
        for (int i = 0; i < mascotasObtenidas.length; i++) {
            System.out.println("Mascota " + (i + 1) + "\n" + mascotasObtenidas[i]);
        }
        System.out.println("Preciona Enter para continuar...");
        entrada.nextLine();

        return mascotasObtenidas;
    }

    //Metodo para comprar Alimento
    public Alimento[] ComprarAlimentos(Alimento[] alimentosTienda, Mascota[] mascotasEquipo) {
        int opcion;
        System.out.println("\nAlimentos");

        return alimentosTienda;
    }

    public String[] VenderMascotas() {
        String[] ventaMacotas = new String[cantidadMascotas];

        return ventaMacotas;
    }
    //metodo para ordenar las mascotas del jugador
    public Mascota[] OrdenarMascotas(Mascota[] mascotasOrdenadas) {
        int posicionMascotaMover;
        int posicionMascotaMovida;
        Mascota mascotaMovida;
        
        System.out.println("Orden actual de sus mascotas\n");
        for (int i = 0; i < mascotasOrdenadas.length; i++) {
            System.out.println("Mascota " + (i + 1));
            System.out.println(mascotasOrdenadas[i]);
        }

        do {
            System.out.println("\nIngrese el numero de la mascota que desee mover: ");
            posicionMascotaMover = entrada.nextInt();
            System.out.println("Ingrese el numero de la posicion al que lo quiere mover  (Recuerde que las posiciones son de 1 a 5): ");
            posicionMascotaMovida = entrada.nextInt();
            if(posicionMascotaMover > 0 && posicionMascotaMover < 6 && posicionMascotaMovida >0 && posicionMascotaMovida <6){
            mascotaMovida = mascotasOrdenadas[posicionMascotaMovida-1];
            mascotasOrdenadas[posicionMascotaMovida-1] = mascotasOrdenadas[posicionMascotaMover-1];
            mascotasOrdenadas[posicionMascotaMover-1] = mascotaMovida;
            System.out.println("\nMascota movida exitosamente");
            System.out.println("_____________________________");
            System.out.println("Orden actual de tus mascotas");
            for (int i = 0; i < mascotasOrdenadas.length; i++) {
                System.out.println("Mascota " + (i + 1));
                System.out.println(mascotasOrdenadas[i]);
            }
            System.out.println("Preciona Enter para segir ordenando las macotas.");
            System.out.println("1. Regresar al menú anterior.");
            entrada.nextLine();
            }else {
                System.out.println("\nPosición no encotrada.");
            }

        } while (!"1".equals(entrada.nextLine()));

        return mascotasOrdenadas;
    }

    public String[] FucionarMascotas() {
        String[] fucionMascotas = new String[cantidadMascotas];

        return fucionMascotas;
    }

    public int RestarMonedas(int monedasGastadas) {
        return monedasOro -= monedasGastadas;
    }

}
