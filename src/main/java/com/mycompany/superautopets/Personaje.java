package com.mycompany.superautopets;

import com.mycompany.Mascotas.Mascota;

public class Personaje {
    protected Mascota [] arregloMascotas = new Mascota[5];
    protected int cantidadVictorias;
    protected int cantidadDerrotas;
    private Tier mascotasTienda;
    
    public int contadorVictorias(int victorias){
        return cantidadVictorias += victorias;
    }
    public int contadorDerrotas(int derrotas){
        return cantidadDerrotas += derrotas;
    }
    public Mascota obtenerMascota(int ronda){
        
     if(ronda == 1){
         System.out.println("Mascotas del tier 1 desbloqueados...");
         mascotasTienda.Tier1();
         
         
     }else 
         if(ronda == 2 && ronda ==3){
             System.out.println("Mascotas del tier 2 desbloqueados...");
         }else 
             if(ronda == 4 && ronda == 5){
                 System.out.println("Mascotas del tier 3 desbloqueados");
             }else
                 if(ronda == 6 && ronda == 7){
                     System.out.println("Mascotas del tier 4 dosbloqueado");
                 }else 
                     if(ronda == 8 && ronda == 9){
                         System.out.println("Mascotas del tier 5 desbloqueados");
                     }else
                         if(ronda == 10 && ronda == 11){
                             System.out.println("Mascotas del tier 6 desbloqueados");
                         }else{
                             System.out.println("MAscotas del tier 7 desbloqueados");
                         }
     
    }
}
