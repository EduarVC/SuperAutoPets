package com.mycompany.superautopets;

import com.mycompany.Alimento.Alimento;
import com.mycompany.Alimento.NoHayAlimento;
import com.mycompany.Mascotas.Mascota;
import com.mycompany.Mascotas.espacioVacio;
import java.util.Scanner;

public class Jugador extends Personaje {

    static Scanner entrada = new Scanner(System.in);
    Verificar verificarMascota= new Verificar();
    private Tienda datosTienda;
    protected int vidaJugador;
    public int monedasOro;
    private Alimento noHayAlimento;
    private boolean estaVivo;

    public Jugador() {

        vidaJugador = 10;
        monedasOro = 10;
        cantidadDerrotas = 0;
        cantidadVictorias = 0;
        espacioLibre = new espacioVacio();
        datosTienda = new Tienda();
        noHayAlimento = new NoHayAlimento();
        espacioDisponible = true;
        mascotasObtenidas[0] = espacioLibre;
        mascotasObtenidas[1] = espacioLibre;
        mascotasObtenidas[2] = espacioLibre;
        mascotasObtenidas[3] = espacioLibre;
        mascotasObtenidas[4] = espacioLibre;
        estaVivo = true;

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
        Mascota tipo = new Mascota();
        System.out.println("\nMascotas de tu Equipo:");
        for (int i = 0; i < mascotasJugador.length; i++) {
            System.out.println(String.format("\nMascota %d", (i + 1)));
            System.out.println(mascotasJugador[i]);
            tipo.imprimirTipos(mascotasJugador[i].tipoMascota);
        }
    }

    //metodo para obtener a las macotas que el jugador desee en su equipo 
    public Mascota[] ComprarMascotas(Mascota[] mascotasTienda) {
        Modos mascotasTiendaDisponibles = new Modos();
        int numOpcion;
        int opcion;

        //Ciclo para la compra de las mascotas, solo si el jugador quiere seguir comprando y tenga las monedas Suficientes
        while (monedasOro > 2 && espacioDisponible == true) {
            espacioDisponible = false;
            System.out.println("Tienes: " + monedasOro + " monedas de oro");
            System.out.println("\nElija la Mascota que desee comprar:");
            opcion = entrada.nextInt();
            if (opcion < 1 || opcion > mascotasTienda.length) {
                System.out.println("\nOpcion invalida.\n");
                espacioDisponible = true;
            } else {
                if (mascotasTienda[opcion - 1] == espacioLibre) {
                    System.out.println("\nLa mascota seleccionada ya fue comprada, Intente de nuevo.\n");
                    espacioDisponible = true;
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
                                for (int j = 0; j < mascotasObtenidas.length; j++) {
                                    if("Nutria".equals(mascotasObtenidas[i].nombreMascota)){
                                        mascotasObtenidas = verificarMascota.verificarHabilidad(mascotasObtenidas, 1,mascotasTienda);
                                    }
                                }  
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

                System.out.println("1. Seguir comprando.");
                System.out.println("2. Regresar al menu anterior.");
                numOpcion = entrada.nextInt();
                if (numOpcion == 2) {
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
    public Mascota[] ComprarAlimentos(Alimento[] alimentosTienda, Mascota[] mascotasEquipo, Mascota [] mascotasTienda) {
        AlimentarMascota alimentarMascota = new AlimentarMascota();
        Tienda alimentos = new Tienda();
        int opcion;
        int mascotaAlimentada;
        boolean existenAlimentos = true;
        boolean alimentoMascotaEspecifica;

        do {
            if (monedasOro > 2) {
                alimentos.ImprimirAlimentosTienda(alimentosTienda);
                System.out.println(String.format("\nTienes %d monedas de Oro", monedasOro));
                System.out.println("Que alimentos desea comprar: ");
                opcion = entrada.nextInt();
                alimentoMascotaEspecifica = alimentarMascota.mascotaEspecifica(alimentosTienda[opcion - 1]);
                if (alimentoMascotaEspecifica == true) {
                    ImprimirDatosJugador(mascotasEquipo);
                    System.out.println("Elija la mascota que quiere alimentar: ");
                    mascotaAlimentada = entrada.nextInt();

                    if (opcion - 1 >= 0 && opcion - 1 < alimentosTienda.length) {
                        if (mascotaAlimentada - 1 >= 0 && mascotaAlimentada - 1 < mascotasEquipo.length) {
                            if (mascotasEquipo[mascotaAlimentada - 1] != espacioLibre) {
                                mascotasEquipo[mascotaAlimentada - 1] = alimentarMascota.darAlimento(mascotasEquipo[mascotaAlimentada - 1], alimentosTienda[opcion - 1]);
                                alimentosTienda[opcion - 1] = noHayAlimento;
                                System.out.println("\nMascota Alimentada Exitosamente.");
                                monedasOro = RestarMonedas(3);
                                mascotasEquipo = verificarMascota.verificarHabilidad(mascotasEquipo, 3, mascotasTienda);
                                System.out.println("Precione Enter para seguir comprando alimentos.");
                                System.out.println("Ingrese 1 para regresar al menú anterior.");
                                entrada.nextLine();
                            } else {
                                System.out.println("\nNo existe mascota en esta posicion.");
                                System.out.println("Precione Enter para seguir comprando alimentos.");
                                System.out.println("Ingrese 1 para regresar al menú anterior.");
                                entrada.nextLine();
                            }
                        } else {
                            System.out.println("\nOpcion Invalisa.");
                            System.out.println("Precione Enter para seguir comprando alimentos.");
                            System.out.println("Ingrese 1 para regresar al menú anterior.");
                            entrada.nextLine();
                        }
                    } else {
                        System.out.println("\nOpcion invalida.");
                        System.out.println("Precione Enter para seguir comprando alimentos.");
                        System.out.println("Ingrese 1 para regresar al menú anterior.");
                        entrada.nextLine();
                    }
                } else {
                    if (opcion - 1 >= 0 && opcion - 1 < alimentosTienda.length) {
                        mascotasEquipo = alimentarMascota.darAlimentoAleatorio(mascotasEquipo, alimentosTienda[opcion - 1]);
                        alimentosTienda[opcion - 1] = noHayAlimento;
                        System.out.println("\nProceso Exitoso.");
                        monedasOro = RestarMonedas(3);
                    } else {
                        System.out.println("\nOpcion invalida.");
                        System.out.println("Precione Enter para seguir comprando alimentos.");
                        System.out.println("Ingrese 1 para regresar al menú anterior.");
                        entrada.nextLine();
                    }
                }
                for (int i = 0; i < alimentosTienda.length; i++) {
                    if (alimentosTienda[i] != noHayAlimento) {
                        existenAlimentos = true;
                        break;
                    } else {
                        existenAlimentos = false;
                    }
                }
            } else {
                System.out.println("No tienes suficientes monedas de oro para comprar alimentos.");
            }
        } while (!"1".equals(entrada.nextLine()) && existenAlimentos == true);

        if ("1".equals(entrada.nextLine())) {
            ImprimirDatosJugador(mascotasEquipo);
            System.out.println("Precione Enter para continuar...");
            entrada.nextLine();
        } else if (existenAlimentos == false) {
            System.out.println("\nNo hay mas alimentos disponibles en la tienda.");
            System.out.println("Precione Enter para continuar...");
            entrada.nextLine();
            ImprimirDatosJugador(mascotasEquipo);
        } else if (monedasOro < 3) {
            System.out.println(String.format("Tienes %d monedas de oro, no cuentas con lo suficiente para seguir comprando alimentos.", monedasOro));
            System.out.println("Precione Enter para continuar...");
            entrada.nextLine();
            ImprimirDatosJugador(mascotasEquipo);
        }

        return mascotasEquipo;
    }

    //Metodo para vender las mascotas del Jugador
    public Mascota[] VenderMascotas(Mascota[] mascotasJugador, Mascota [] mascotaEnemigo) {
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
                            mascotasJugador = verificarMascota.aplicarHabilidadVendidos(mascotasJugador, mascotasJugador[mascotaVenta-1], mascotaEnemigo);
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
                             mascotasJugador = verificarMascota.aplicarHabilidadVendidos(mascotasJugador, mascotasJugador[mascotaVenta-1], mascotaEnemigo);
                            break;
                        case 5:
                            monedasOro = SumarMonedas(3);
                            mascotasJugador[mascotaVenta - 1] = espacioLibre;
                            System.out.println("\nMascota vendida exitosamente...");
                            System.out.println("Has recivido 3 moneda de oro.");
                            mascotasJugador = verificarMascota.aplicarHabilidadVendidos(mascotasJugador, mascotasJugador[mascotaVenta-1], mascotaEnemigo);
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

    public Mascota[] FucionarMascotas(Mascota[] mascotasTienda, Mascota[] mascotasJugador, Mascota [] mascotasEnemigo) {
        Mascota fucion = new Mascota();
        Modos mascotaTienda = new Modos();
        int posicionMascotaTienda;
        int posicionMascotaJugador;
        int posicionMascotaJugador2;
        int opcion;

        System.out.println("________________________________________________");
        System.out.println("\nFucione sus mascotas para subirlos de nivel.");

        System.out.println("1. Fucionar mascotas del equipo");
        System.out.println("2. Comprar mascota para fucionarla con una mascota del equipo.");
        System.out.println("Elija una opcion: ");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            ImprimirDatosJugador(mascotasJugador);
            do {
                System.out.println("\nIngrese la posicion de la mascotas que desea fucionar: ");
                posicionMascotaJugador = entrada.nextInt();
                System.out.println("Ingrese la posicion de la mascota con la que la desea fucionar: ");
                posicionMascotaJugador2 = entrada.nextInt();
                if (posicionMascotaJugador == posicionMascotaJugador2) {
                    System.out.println("\nNo se pude fuciona la mascota debido a que seleccino la misma.");
                    System.out.println("Presione Enter para contuciar fucionando.");
                    System.out.println("Ingrese 1 para regresar al menú anterior.");
                    entrada.nextLine();
                } else {
                    if (posicionMascotaJugador - 1 >= 0 && posicionMascotaJugador - 1 < mascotasJugador.length && posicionMascotaJugador2 - 1 >= 0 && posicionMascotaJugador2 - 1 < mascotasJugador.length) {
                        if (mascotasJugador[posicionMascotaJugador - 1].nombreMascota.equals(mascotasJugador[posicionMascotaJugador2 - 1].nombreMascota)) {
                            if (mascotasJugador[posicionMascotaJugador - 1].nivel < 3 && mascotasJugador[posicionMascotaJugador2 - 1].nivel < 3) {
                                System.out.println("\nMascota Fucionada Exitosamente.");
                                mascotasJugador[posicionMascotaJugador2 - 1].establecerNivelMascota(fucion.Fusionarse(1));
                                mascotasJugador[posicionMascotaJugador2 - 1].cantidadFusionados += 1;
                                mascotasJugador[posicionMascotaJugador2 - 1].aumentarVida(1);
                                mascotasJugador[posicionMascotaJugador2 - 1].aumentarAtaque(1);
                                mascotasJugador[posicionMascotaJugador - 1] = espacioLibre;
                                mascotasJugador = verificarMascota.verificarHabilidad(mascotasJugador, 5, mascotasEnemigo);
                                ImprimirDatosJugador(mascotasJugador);
                                System.out.println("\nPrecione Enter para continuar fucionando.");
                                System.out.println("Ingrese 1 para regresra al menú anterior.");
                            } else {
                                System.out.println("Una de las mascotas ya esta a nivel maximo.");
                                System.out.println("Precione Enter para continuar fucionando.");
                                System.out.println("Ingrese 1 para regresar al menú anterior.");
                                entrada.nextLine();
                            }
                        } else {
                            System.out.println("\nLas mascotas seleccionadas no son iguales, por lo tanto no se pueden fucionar.");
                            System.out.println("Precione Enter para continuar fucionando.");
                            System.out.println("Ingrese 1 para regresar al menú anterior.");
                            entrada.nextLine();
                        }
                    } else {
                        System.out.println("\nPosicion incorrecta.");
                        System.out.println("Precione Enter para continuar fucionando.");
                        System.out.println("Ingrese 1 para regresar al menú anterior.");
                        entrada.nextLine();
                    }
                }
            } while (!"1".equals(entrada.nextLine()));

        } else if (opcion == 2 && monedasOro > 2) {
            ImprimirDatosJugador(mascotasJugador);
            datosTienda.ImprimirMascotasTienda(mascotasTienda);
            do {
                System.out.println(String.format("\nTiene %d monedas de Oro", monedasOro));
                System.out.println("Ingrese la posicion de la mascota de la tienda que desee Fucionar: ");
                posicionMascotaTienda = entrada.nextInt();
                System.out.println("Ingrese la posicion de la mascota de su equipo que desee Fucionar: ");
                posicionMascotaJugador = entrada.nextInt();

                if (posicionMascotaJugador - 1 >= 0 && posicionMascotaJugador - 1 < mascotasJugador.length && posicionMascotaTienda - 1 >= 0 && posicionMascotaTienda - 1 < mascotasTienda.length) {

                    if (mascotasJugador[posicionMascotaJugador - 1].nombreMascota.equals(mascotasTienda[posicionMascotaTienda - 1].nombreMascota)) {
                        if (mascotasJugador[posicionMascotaJugador - 1].nivel < 3) {
                            System.out.println("\nMascota Fucionada Exitosamente.");
                            RestarMonedas(3);
                            mascotasJugador[posicionMascotaJugador - 1].establecerNivelMascota(fucion.Fusionarse(1));
                            mascotasJugador[posicionMascotaJugador - 1].aumentarVida(1);
                            mascotasJugador[posicionMascotaJugador - 1].aumentarAtaque(1);
                            mascotasTienda[posicionMascotaTienda - 1] = espacioLibre;
                            mascotaTienda.mascotasTienda = mascotasTienda;
                            mascotasJugador = verificarMascota.verificarHabilidad(mascotasJugador, 5, mascotasEnemigo); 
                            System.out.println("Precione Enter para continuar fucionando.");
                            System.out.println("Ingrese 1 para regresar al menú anterior.");
                            entrada.nextLine();
                        } else {
                            System.out.println("\nLa mascota seleccionada esta a nivel Maximo.");
                            System.out.println("Precione Enter para continuar fucionando.");
                            System.out.println("Ingrese 1 para regresar al menú anterior.");
                            entrada.nextLine();
                        }
                    } else {
                        System.out.println("\nLas mascotas seleccionadas no son iguales, por lo tanto no se pueden fucionar.");
                        System.out.println("Precione Enter para Continuar.");
                        System.out.println("Ingrese 1 para regresar al menú anterior.");
                        entrada.nextLine();
                    }
                } else {
                    System.out.println("\nPosicion incorrecta.");
                    System.out.println("Precione Enter para continuar fucionando.");
                    System.out.println("Ingrese 1 para regresar al menú anterior.");
                    entrada.nextLine();
                }
            } while (monedasOro > 2 && !"1".equals(entrada.nextLine()));
            if (monedasOro < 3) {
                System.out.println(String.format("Tienes %d monedas de oro, no tienes suficientes monedas para seguir comprando mascotas.", monedasOro));
                System.out.println("Precione Enter para continuar fucionando.");
                entrada.nextLine();
                ImprimirDatosJugador(mascotasJugador);
            } else {
                ImprimirDatosJugador(mascotasJugador);
            }
        }
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
    public int restarVida(int ronda){
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
        if (vidaJugador < 1){
            estaVivo = false;
        }
        return vidaJugador;
    }
    public boolean estaVivo(){
        return estaVivo;
    }

}
