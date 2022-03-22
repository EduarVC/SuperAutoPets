package com.mycompany.superautopets;

import com.mycompany.Mascotas.Mascota;
import com.mycompany.Mascotas.espacioVacio;
import java.util.Scanner;

public class Jugador extends Personaje {

    static Scanner entrada = new Scanner(System.in);

    private int vidaJugador;
    private int monedasOro;
//    private String nombreJugador;
//    private String nombreEquipo;
    private Mascota espacioLibre;
    private boolean espacioDisponible;

    public Jugador() {
//        System.out.println("Ingrese su Nombre: ");
//        nombreJugador = entrada.next();
//        System.out.println("Ingrese el nombre de su Equipo: ");
//        nombreEquipo = entrada.next();
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
        mascotasTiendaDisponibles.mascotasTienda = mascotasTienda;
        int opcion;

        while (monedasOro > 2 && espacioDisponible == true) {
            espacioDisponible = false;
            System.out.println("Tienes: " + monedasOro + " monedas de oro");
            System.out.println("Elija la Mascota que desee comprar:");
            opcion = entrada.nextInt();
            if(opcion < 1 || opcion > mascotasTienda.length){
                System.out.println("\nOpcion invalida.\n");
                espacioDisponible = true;
            }else{
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
        if(monedasOro < 3){
        //se le indica al jugador que ya no cuenta con las monedas necesarias para seguir comprando
        System.out.println("\nTienes: " + monedasOro + " monedas de oro, no cuentas con lo suficiente para seguir comprando.");
        }else{
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

    public String[] ComprarAlimentos() {
        String[] alimentos = new String[2];

        return alimentos;
    }

    public String[] VenderMascotas() {
        String[] ventaMacotas = new String[cantidadMascotas];

        return ventaMacotas;
    }

    public String[] OrdenarMascotas() {
        String[] ordenMascotas = new String[cantidadMascotas];

        return ordenMascotas;
    }

    public String[] FucionarMascotas() {
        String[] fucionMascotas = new String[cantidadMascotas];

        return fucionMascotas;
    }

    public int RestarMonedas(int monedasGastadas) {
        return monedasOro -= monedasGastadas;
    }

}
