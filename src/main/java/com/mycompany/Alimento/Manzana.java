package com.mycompany.Alimento;

import com.mycompany.Mascotas.Mascota;
import java.util.Scanner;

public class Manzana extends Alimento{
    private Mascota mascotaSeleccionada;
    public Manzana(){
        nombreAlimento = "Manzana";
        descripccion = "Da 1 de vida y 1 de daño a un animal seleccionado.";
        tipoEfecto = false;
        
    }
    public Mascota[] darAlimento(Mascota [] mascotasCompradas){
        
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("A que mascota deseea darle el alimento: ");
        for (int i = 0; i < mascotasCompradas.length; i++) {
            System.out.println(String.format("Mascota %d: \n%d",(i+1), mascotasCompradas[i]));
        }
        System.out.println("Elija el numero de la mascota que desee: ");
        opcion = entrada.nextInt();
        
        mascotasCompradas[opcion -1].puntosVida++;
        mascotasCompradas[opcion -1].puntosAtaque++;
        
        return mascotasCompradas;
    }
}
