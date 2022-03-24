package com.mycompany.superautopets;

import com.mycompany.Alimento.Alimento;
import com.mycompany.Mascotas.Mascota;
import com.mycompany.Mascotas.espacioVacio;
import java.util.Scanner;

public class Jugador extends Personaje {

    static Scanner entrada = new Scanner(System.in);

    private Tienda datosTienda;
    protected int vidaJugador;
    public int monedasOro;

    public Jugador() {

        vidaJugador = 10;
        monedasOro = 10;
        cantidadDerrotas = 0;
        cantidadVictorias = 0;
        espacioLibre = new espacioVacio();
        datosTienda = new Tienda();
        espacioDisponible = true;
        mascotasObtenidas[0] = espacioLibre;
        mascotasObtenidas[1] = espacioLibre;
        mascotasObtenidas[2] = espacioLibre;
        mascotasObtenidas[3] = espacioLibre;
        mascotasObtenidas[4] = espacioLibre;

    }

    public int restarVidaJugador(int ronda) {
        switch (ronda) {
            case 1:
            case 2:
            case 3:
                vidaJugador -= 1;
                break;
            case 4:
            case 5:
            case 6:
                vidaJugador -= 2;
                break;
            default:
                vidaJugador -= 3;
                break;
        }
        return vidaJugador;
    }

    public void ImprimirDatosJugador(Mascota[] mascotasJugador) {
        System.out.println("\nMascotas de tu Equipo:");
        for (int i = 0; i < mascotasJugador.length; i++) {
            System.out.println(String.format("Mascota %d", (i + 1)));
            System.out.println(mascotasJugador[i]);
        }
    }

    //metodo para obtener a las macotas que el jugador desee en su equipo 
    public Mascota[] ComprarMascotas(Mascota[] mascotasTienda) {
        Modos mascotasTiendaDisponibles = new Modos();
        Modos mandarDatos = new Modos();
        int opcion;

        //Ciclo para la compra de las mascotas, solo si el jugador quiere seguir comprando y tenga las monedas Suficientes
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

                    //Se verifica que el jugador tenga un espacio libre en su equipo para poder comprar la mascota
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
                                monedasOro = RestarMonedas(3);
                                mascotasTiendaDisponibles.mascotasTienda = mascotasTienda;
                                break;
                            }
                        }
                    } else {
                        //Se le indica al jugador si no tinene espacio en su equipo.
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
            System.out.println("Preciona Enter para continuar...");
            entrada.nextLine();
        } else {
            System.out.println("\nTienes: " + monedasOro + " monedas de oro");
        }
        //Se muestran las mascotas compradas
        System.out.println("_____________________________");
        System.out.println("Mascotas de tu equipo: ");
        ImprimirDatosJugador(mascotasObtenidas);

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

    //Metodo para vender las mascotas del Jugador
    public Mascota[] VenderMascotas(Mascota[] mascotasJugador) {
        int mascotaVenta;
        Modos mandarDatos = new Modos();

        System.out.println("\nMascotas Actuales: ");
        ImprimirDatosJugador(mascotasJugador);

        do {
            System.out.println("\nIngerse la posicion de la mascota que desee vender (Recuerde que las posiciones son de 1 a 5): ");
            mascotaVenta = entrada.nextInt();

            //Se verifica que la posicion ingresada sea correcta 
            if (mascotaVenta > 0 && mascotaVenta < 6) {
                if (mascotasJugador[mascotaVenta - 1] == espacioLibre) {
                    System.out.println("\nEn esta posicion no existe una mascota.");
                    System.out.println("Precione Enter para seguir vendiendo sus mascotas.");
                    System.out.println("Ingrese 1 para regresar al menú anterior.");
                    entrada.nextLine();
                } else {
                    switch (mascotasJugador[mascotaVenta - 1].cantidadFusionados) {
                        case 0:
                        case 1:
                            monedasOro = SumarMonedas(1);
                            mascotasJugador[mascotaVenta - 1] = espacioLibre;
                            System.out.println("\nMascota vendida exitosamente...");
                            System.out.println("Has recivido 1 moneda de oro.");
                            break;
                        case 2:
                        case 3:
                        case 4:
                            monedasOro = SumarMonedas(2);
                            mascotasJugador[mascotaVenta - 1] = espacioLibre;
                            System.out.println("\nMascota vendida exitosamente...");
                            System.out.println("Has recivido 2 moneda de oro.");
                            break;
                        case 5:
                            monedasOro = SumarMonedas(3);
                            mascotasJugador[mascotaVenta - 1] = espacioLibre;
                            System.out.println("\nMascota vendida exitosamente...");
                            System.out.println("Has recivido 3 moneda de oro.");
                            break;
                    }
                    System.out.println(String.format("Tienes %d monedas de Oro", monedasOro));
                    System.out.println("\nPrecione Enter para seguir vendiendo sus mascotas.");
                    System.out.println("Ingrese 1 para regresar al menú anterior.");
                    entrada.nextLine();
                }

            } else {
                System.out.println("\nPosicion Invalida...");
                System.out.println("Precione Enter para continuar.");
                System.out.println("Ingrese 1 para regesar al menú anterior.");
            }
        } while (!"1".equals(entrada.nextLine()));

        return mascotasJugador;
    }

    //metodo para ordenar las mascotas del jugador
    public Mascota[] OrdenarMascotas(Mascota[] mascotasOrdenadas) {
        int posicionMascotaMover;
        int posicionMascotaMovida;
        Mascota mascotaMovida;

        System.out.println("Orden actual de sus mascotas\n");
        ImprimirDatosJugador(mascotasOrdenadas);

        do {
            System.out.println("\nIngrese el numero de la mascota que desee mover: ");
            posicionMascotaMover = entrada.nextInt();
            System.out.println("Ingrese el numero de la posicion al que lo quiere mover  (Recuerde que las posiciones son de 1 a 5): ");
            posicionMascotaMovida = entrada.nextInt();
            if (posicionMascotaMover > 0 && posicionMascotaMover < 6 && posicionMascotaMovida > 0 && posicionMascotaMovida < 6) {
                mascotaMovida = mascotasOrdenadas[posicionMascotaMovida - 1];
                mascotasOrdenadas[posicionMascotaMovida - 1] = mascotasOrdenadas[posicionMascotaMover - 1];
                mascotasOrdenadas[posicionMascotaMover - 1] = mascotaMovida;
                System.out.println("\nMascota movida exitosamente");
                System.out.println("_____________________________");
                System.out.println("Orden actual de tus mascotas");
                ImprimirDatosJugador(mascotasOrdenadas);
                System.out.println("Preciona Enter para segir ordenando las macotas.");
                System.out.println("1. Regresar al menú anterior.");
                entrada.nextLine();
            } else {
                System.out.println("\nPosición no encotrada.");
            }
        } while (!"1".equals(entrada.nextLine()));

        return mascotasOrdenadas;
    }

    public Mascota[] FucionarMascotas(Mascota[] mascotasTienda, Mascota[] mascotasJugador) {
        Mascota fucion = new Mascota();
        int posicionMascotaTienda;
        int posicionMascotaJugador;

        System.out.println("________________________________________________");
        System.out.println("\nFucione sus mascotas para subirlos de nivel.");

        ImprimirDatosJugador(mascotasJugador);
        datosTienda.ImprimirMascotasTienda(mascotasTienda);
        do {
            System.out.println(String.format("\nTiene %d monedas de Oro", monedasOro));
            System.out.println("Ingrese la posicion de la mascota de la tienda que desee Fucionar: ");
            posicionMascotaTienda = entrada.nextInt();
            System.out.println("Ingrese la posicion de la mascota de su equipo que desee Fucionar: ");
            posicionMascotaJugador = entrada.nextInt();

            if (posicionMascotaJugador - 1 >= 0 && posicionMascotaJugador - 1 < mascotasJugador.length && posicionMascotaTienda - 1 >= 0 && posicionMascotaTienda - 1 < mascotasTienda.length) {

                if (mascotasJugador[posicionMascotaJugador - 1] == mascotasTienda[posicionMascotaTienda - 1]) {
                    if (mascotasJugador[posicionMascotaJugador - 1].nivel <= 3) {
                        System.out.println("\nMascota Fucionada Exitosamente.");
                        fucion.Fusionarse(1);
                        //falta aca
                    }else{
                        
                    }
                }
            }
        } while (monedasOro > 2);
        return mascotasJugador;
    }

    //Se restan las monedas de oro gastadas
    public int RestarMonedas(int monedasGastadas) {
        return monedasOro -= monedasGastadas;
    }

    //se suman las monedas de oro obtenidas 
    public int SumarMonedas(int monedasObtenidas) {
        return monedasOro += monedasObtenidas;
    }

}
