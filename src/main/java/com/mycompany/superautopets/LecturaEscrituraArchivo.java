package com.mycompany.superautopets;

import com.mycompany.Campo.Campo;
import com.mycompany.Mascotas.Mascota;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LecturaEscrituraArchivo {

    static Scanner entrada;
    Mascota [] mascotasObtenidas;
    public LecturaEscrituraArchivo() {
        entrada = new Scanner(System.in);
    }

    public void EscrituraArchivo(Mascota[] mascotasJugador, Campo campoSeleccionado) {
        String path;
        System.out.println("\nIngrese un path donde desee gaurdar el archivo: ");
        path = entrada.nextLine();
        File fileDestino = new File(path);

        try {
            PrintWriter printer = new PrintWriter(fileDestino);
            printer.println(String.format("Campo: %s", campoSeleccionado.nombreCampo));
            for (int i = 0; i < mascotasJugador.length; i++) {
                printer.println("Mascota: " + i);
                if (mascotasJugador[i].alimento == true) {
                    printer.println(String.format("Nombre de la mascota: %s, Alimento: %s", mascotasJugador[i].nombreMascota, mascotasJugador[i].nombreAlimento));
                } else {
                    printer.println(String.format("Nombre de la mascota: %s", mascotasJugador[i].nombreMascota));
                }
            }
            printer.close();
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo que ingreseo no existe.");
        }
    }
    public Mascota [] LecturaArchivos(){
        
        return mascotasObtenidas;
    }
}
