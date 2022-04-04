package com.mycompany.superautopets;

import com.mycompany.Alimento.Alimento;
import com.mycompany.Campo.Bosque;
import com.mycompany.Campo.Campo;
import com.mycompany.Campo.Granja;
import com.mycompany.Campo.Mar;
import com.mycompany.Campo.Nube;
import com.mycompany.Campo.Pantano;
import com.mycompany.Campo.Sabana;
import com.mycompany.Campo.SinCampo;
import com.mycompany.Insecto.Escarabajo;
import com.mycompany.Mascotas.Mascota;
import com.mycompany.Mascotas.espacioVacio;
import java.util.Scanner;

public class Modos {

    static Scanner entrada = new Scanner(System.in);
    private Jugador jugador;
    private IA enemigo;
    public Mascota[] mascotasIA;
    private Campo campo;
    private int ronda;
    private Tienda nuevaTienda;
    public Mascota[] mascotasTienda;
    public Mascota[] mascotasJugador;
    private Alimento[] nuevoAlimento;
    private Mascota mandarTienda;
    Verificar verificarMascota;
    public Mascota espacioLibre;
    private int accion;
    private AlimentarMascota efectosMascota;
    private Mascota[] guardarMascotasJugador;

    //constructor de la clase
    public Modos() {
        espacioLibre = new espacioVacio();
        jugador = new Jugador();
        enemigo = new IA();
        campo = new Campo();
        ronda = 1;
        nuevaTienda = new Tienda();
        verificarMascota = new Verificar();
    }

    //se inicia el modo arrena
    public void ModoArena() {

        System.out.println("\nModo Arena\n");
        campo = obtenerCampo();
        while (jugador.estaVivo()) {
            mascotasTienda = nuevaTienda.mascotasTienda(ronda);
            nuevoAlimento = nuevaTienda.alimentosTienda(ronda);
            do {
                System.out.println("_________________________");
                System.out.println(String.format("\nTienes %d Monedas de Oro", jugador.monedasOro));
                System.out.println(String.format("Vida: %d", jugador.vidaJugador));
                accion = new MenuEntreClases().MenuEntreClases(ronda);
                switch (accion) {
                    case 1:
                        if (ronda == 1) {
                            System.out.println("\nBienvenido a la tienda de mascotas");
                            System.out.println("_____Crea tu propio equipo_____");
                        } else {
                            System.out.println("\nTienda de Mascotas");
                        }
                        nuevaTienda.ImprimirMascotasTienda(mascotasTienda);
                        mascotasJugador = jugador.ComprarMascotas(mascotasTienda);
                        break;
                    case 2:
                        System.out.println("_________________________");
                        System.out.println("\nAlimentos disponibles: ");
                        mascotasJugador = jugador.ComprarAlimentos(nuevoAlimento, mascotasJugador, mascotasTienda);
                        break;
                    case 3:
                        System.out.println("_________________________________");
                        System.out.println("\nOrdene sus mascotas como desee.");
                        mascotasJugador = jugador.OrdenarMascotas(mascotasJugador);
                        break;
                    case 4:
                        mascotasJugador = jugador.FucionarMascotas(mascotasTienda, mascotasJugador, mascotasIA);
                        break;
                    case 5:
                        System.out.println("_________________________________");
                        System.out.println("\nVenda la mascota que desees y obtenga monedas de oro segun el nivel de su mascota");
                        mascotasJugador = jugador.VenderMascotas(mascotasJugador, mascotasIA);
                        break;
                    default:
                        break;
                }
            } while (accion != 6);
            mascotasJugador = verificarMascota.verificarHabilidad(mascotasJugador, 9, mascotasIA);
            mascotasIA = enemigo.obtenreMascotasIA(ronda);
            enemigo.ImprimirMascotasIA(mascotasIA);
            System.out.println("\nPrecione enter para continuar...");
            entrada.nextLine();
            campo.AplicarEfectosCampo(mascotasJugador, campo);
            jugador.ImprimirDatosJugador(mascotasJugador);
            campo.AplicarEfectosCampo(mascotasIA, campo);
            enemigo.ImprimirMascotasIA(mascotasIA);
            guardarMascotasJugador = mascotasJugador;
            inicioCombate();
            ronda++;
            jugador.monedasOro = 10;
            mascotasJugador = guardarMascotasJugador;
        }
    }

    public void ModoVersus() {
        LecturaEscrituraArchivo escritura = new LecturaEscrituraArchivo();
        System.out.println("______________________");
        System.out.println("------Modo Versus-----");
        campo = obtenerCampo();
        while (jugador.estaVivo()) {
            mascotasTienda = nuevaTienda.mascotasTienda(ronda);
            nuevoAlimento = nuevaTienda.alimentosTienda(ronda);
            do {
                System.out.println("_________________________");
                System.out.println(String.format("\nTienes %d Monedas de Oro", jugador.monedasOro));
                System.out.println(String.format("Vida: %d", jugador.vidaJugador));
                accion = new MenuEntreClases().MenuEntreClases(ronda);
                switch (accion) {
                    case 1:
                        if (ronda == 1) {
                            System.out.println("\nBienvenido a la tienda de mascotas");
                            System.out.println("_____Crea tu propio equipo_____");
                        } else {
                            System.out.println("\nTienda de Mascotas");
                        }
                        nuevaTienda.ImprimirMascotasTienda(mascotasTienda);
                        mascotasJugador = jugador.ComprarMascotas(mascotasTienda);
                        break;
                    case 2:
                        System.out.println("_________________________");
                        System.out.println("\nAlimentos disponibles: ");
                        mascotasJugador = jugador.ComprarAlimentos(nuevoAlimento, mascotasJugador, mascotasTienda);
                        break;
                    case 3:
                        System.out.println("_________________________________");
                        System.out.println("\nOrdene sus mascotas como desee.");
                        mascotasJugador = jugador.OrdenarMascotas(mascotasJugador);
                        break;
                    case 4:
                        mascotasJugador = jugador.FucionarMascotas(mascotasTienda, mascotasJugador, mascotasIA);
                        break;
                    case 5:
                        System.out.println("_________________________________");
                        System.out.println("\nVenda la mascota que desees y obtenga monedas de oro segun el nivel de su mascota");
                        mascotasJugador = jugador.VenderMascotas(mascotasJugador, mascotasIA);
                        break;
                    default:
                        break;
                }
            } while (accion != 6);
            escritura.EscrituraArchivo(mascotasJugador, campo);

        }
    }

    public static void ModoCreativo() {

    }

    //Metodo para obtener el campo
    public Campo obtenerCampo() {

        int opcion;

        System.out.println("1. Pantano");
        System.out.println("2. Nubes");
        System.out.println("3. Mar");
        System.out.println("4. Bosque");
        System.out.println("5. Granja");
        System.out.println("6. Sin campo");
        System.out.println("7. Sabana");
        System.out.println("Elija el campo en el que desee jugar:");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1 ->
                campo = new Pantano();
            case 2 ->
                campo = new Nube();
            case 3 ->
                campo = new Mar();
            case 4 ->
                campo = new Bosque();
            case 5 ->
                campo = new Granja();
            case 6 ->
                campo = new SinCampo();
            case 7 ->
                campo = new Sabana();
            default -> {
                System.out.println("Opcion invalida");
                obtenerCampo();
            }
        }

        return campo;
    }

    public void inicioCombate() {
        Mascota [] mascotasJugadorP;
        mascotasJugadorP = mascotasJugador;
        int contador = 0;
        int posicionMascotaJugador = 0;
        int posicionMascotaEnemigo = 0;
        Mascota guardaMascotaJugador;
        Mascota guardaMascotaIA;
        Alimento tipoAlimento = new Alimento();

        mascotasJugadorP = verificarMascota.verificarHabilidad(mascotasJugadorP, 4, mascotasIA);//Ejecuta las habilidades de las macotas Correspondientes
        System.out.println("______________________");
        System.out.println("\nInicio del combate.");
        
        do {
            guardaMascotaJugador = espacioLibre;
            guardaMascotaIA = espacioLibre;
            //Buscamos a la mascota para pelear entre las mascotas del Jugador
            for (int i = 0; i < mascotasJugadorP.length; i++) {
                if (mascotasJugadorP[i] != espacioLibre && mascotasJugadorP[i].puntosVida > 0) {
                    guardaMascotaJugador = mascotasJugadorP[i];//Guardamos a la mascota seleccionada
                    mascotasJugadorP = verificarMascota.verificarHabilidad(mascotasJugadorP, 2, mascotasIA);//Ejecutamos las habilidades de las mascotas Correspondientes 
                    posicionMascotaJugador = i;//Guardamos la posicion de la mascota
                    break;
                }
            }
            //Buscamos a la mascota para pelear entre las mascotas del enemigo
            for (int i = 0; i < mascotasIA.length; i++) {
                if (mascotasIA[i] != espacioLibre && mascotasIA[i].puntosVida > 0) {
                    guardaMascotaIA = mascotasIA[i]; // Guardamos a la mascota seleccionda
                    posicionMascotaEnemigo = i;// Guardamos la posicion de la mascota seleccionada
                    break;
                }
            }
            
            if (guardaMascotaJugador != espacioLibre && guardaMascotaIA != espacioLibre) {
                guardaMascotaIA.RecivirDaño(guardaMascotaIA, guardaMascotaJugador.puntosAtaque);// Ejecutamos el metodo del enemigo para recivir el daño 
                guardaMascotaJugador.RecivirDaño(guardaMascotaJugador, guardaMascotaIA.puntosAtaque);//Ejecutamos el metodo del jugador pata recivir el daño
                if (guardaMascotaJugador.efecto == true && guardaMascotaJugador.alimento == true) {
                    guardaMascotaJugador = efectosMascota.efectosAlimento(guardaMascotaJugador, guardaMascotaIA);//Ejecutamos el metodo para aplicar los efectos de los alimentos
                }
                mascotasJugadorP[posicionMascotaJugador] = guardaMascotaJugador;
                mascotasIA[posicionMascotaEnemigo] = guardaMascotaIA;
                mascotasJugadorP = verificarMascota.verificarHabilidad(mascotasJugadorP, 7, mascotasIA);//Ejecutamos las habilidades de las mascotas Correspondientes 
                mascotasJugadorP = verificarMascota.verificarHabilidad(mascotasJugadorP, 6, mascotasIA);//Ejecutamos las habilidades de las mascotas Correspondientes 
                mascotasJugadorP = verificarMascota.verificarHabilidad(mascotasJugadorP, 8, mascotasIA);//Ejecutamos las habilidades de las mascotas Correspondientes 
                //Mostramos datos correspondientes
                System.out.println("________________________________________");
                System.out.println(String.format("\nLa mascota %s de tu equipo recivio %d de daño", mascotasJugadorP[posicionMascotaJugador].nombreMascota, mascotasIA[posicionMascotaEnemigo].puntosAtaque));
                System.out.println(String.format("La mascota %s del enemigo recivio %d de daño", mascotasIA[posicionMascotaEnemigo].nombreMascota, mascotasJugadorP[posicionMascotaJugador].puntosAtaque));
                if (guardaMascotaJugador.puntosVida < 1) {
                    mascotasJugadorP[posicionMascotaJugador] = espacioLibre;
                    System.out.println(String.format("\nMascota %s del jugador a muerto", guardaMascotaJugador.nombreMascota));
                } else {
                    System.out.println(String.format("\nMascota %s del jugador sobrevivio \n%s", guardaMascotaJugador.nombreMascota, guardaMascotaJugador));
                }
                if (guardaMascotaIA.puntosVida < 1) {
                    mascotasIA[posicionMascotaEnemigo] = espacioLibre;
                    System.out.println(String.format("\nMascota %s del enemigo a muerto", guardaMascotaIA.nombreMascota));
                } else {
                    System.out.println(String.format("\nMascota %s del enemigo sobrevivio \n%s", guardaMascotaIA.nombreMascota, guardaMascotaIA));
                }
                System.out.println("\nPreciones Enter para continuar...");
                entrada.nextLine();
                
            }

        } while (guardaMascotaJugador != espacioLibre && guardaMascotaIA != espacioLibre);
        
        mascotasJugadorP = verificarMascota.verificarHabilidad(mascotasJugadorP, 10, mascotasIA);
        //Se verifica quien gano la batalla
        if (guardaMascotaIA == espacioLibre && guardaMascotaJugador == espacioLibre) {
            System.out.println("\nEn esta batalla quedaron Empates");
        } else if (guardaMascotaIA == espacioLibre) {
            System.out.println("\nHas gando esta batalla");
            jugador.cantidadVictorias++;
            enemigo.cantidadDerrotas++;
        } else if (guardaMascotaJugador == espacioLibre) {
            System.out.println("\nHas perdido esta batalla");
            enemigo.cantidadVictorias++;
            jugador.cantidadDerrotas++;
            jugador.restarVida(ronda);
        }
    }
}
