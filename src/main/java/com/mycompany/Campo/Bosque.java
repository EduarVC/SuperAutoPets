package com.mycompany.Campo;

import static com.mycompany.Campo.Campo.entrada;
import com.mycompany.Mascotas.Mascota;

public class Bosque extends Campo{
    public Bosque(){
        nombreCampo = "Bosque";
        tiposAfecta = new String[3];
        tiposAfecta[0] = "Terrestre";
        tiposAfecta[1] = "Mamifero";
        tiposAfecta[2] = "Solitario";
    }
    @Override
     public Mascota[] AplicarEfectosCampo(Mascota[] mascotasEquipo, Campo campoElejido) {
         double daño;
         for (int i = 0; i < mascotasEquipo.length; i++) {
          if(mascotasEquipo[i] != espacioLibre){
              for (int j = 0; j < mascotasEquipo[i].tipoMascota.length; j++) {
                  for (int k = 0; k < campoElejido.tiposAfecta.length; k++) {
                      if(mascotasEquipo[i].tipoMascota[j].equals(campoElejido.tiposAfecta[k])){
                       if(null != mascotasEquipo[i].tipoMascota[j])switch (mascotasEquipo[i].tipoMascota[j]) {
                              case "Terrestre":
                                  mascotasEquipo[i].puntosAtaque += 2;
                                  break;
                              case "Mamifero":
                                  mascotasEquipo[i].puntosVida += 2;
                                  break;
                              case "Solitario":
                                  daño = mascotasEquipo[i].puntosAtaque * 0.2;
                                  int dañoTotal = (int) daño;
                                  mascotasEquipo[i].puntosAtaque -= dañoTotal;
                                  break;
                              default:
                                  break;
                          }
                      }
                  }
              }
             
          }
       }
          System.out.println("\nEfectos del campo aplicados exitosamente...");
          System.out.println("Presione Enter para continuar...");
          entrada.nextLine();
        return mascotasEquipo;
    }
}
