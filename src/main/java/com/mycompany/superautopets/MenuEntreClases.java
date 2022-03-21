package com.mycompany.superautopets;

import java.util.Scanner;

public class MenuEntreClases {
    private int opcion;
    
    public int MenuEntreClases( int ronda){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\nMenu");
        System.out.println("1. Comprar Mascotas");
        System.out.println("2. Comprar Comida");
        System.out.println("3. Ordenar Mascotas");
        System.out.println("4. Fusionar Mascotas");
        System.out.println("5. Vender Mascotas");
        System.out.println("6. Terminar Turno");
        System.out.println("Elije una de las siguientes acciones: ");
        opcion = entrada.nextInt();
        
        return opcion;
        
    }
}
