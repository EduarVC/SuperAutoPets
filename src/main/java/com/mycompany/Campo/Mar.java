package com.mycompany.Campo;

import static com.mycompany.Campo.Campo.entrada;
import com.mycompany.Mascotas.Mascota;

public class Mar extends Campo{
    public Mar(){
        nombreCampo = "Mar";
        tiposAfecta = new String[1];
        tiposAfecta[0] = "Acuatico";
    }
    @Override
     public Mascota[] AplicarEfectosCampo(Mascota[] mascotasEquipo, Campo campoElejido) {
         
         for (int i = 0; i < mascotasEquipo.length; i++) {
          if(mascotasEquipo[i] != espacioLibre){
              for (int j = 0; j < mascotasEquipo[i].tipoMascota.length; j++) {
                  for (int k = 0; k < campoElejido.tiposAfecta.length; k++) {
                      if(mascotasEquipo[i].tipoMascota[j].equals(campoElejido.tiposAfecta[k])){
                        mascotasEquipo[i].puntosAtaque += 1;
                        mascotasEquipo[i].puntosVida += 1;
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
