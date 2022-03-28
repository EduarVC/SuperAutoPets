package com.mycompany.Campo;

import static com.mycompany.Campo.Campo.entrada;
import com.mycompany.Mascotas.Mascota;

public class SinCampo extends Campo {

    public SinCampo() {
        nombreCampo = "Sin Campo";
        tiposAfecta = new String[1];
        tiposAfecta[0] = "Solitario";
    }

    @Override
    public Mascota[] AplicarEfectosCampo(Mascota[] mascotasEquipo, Campo campoElejido) {
        int contador = 1;
        int posicionMascota = 0;
        Mascota mascotaCambiada = espacioLibre;
        for (int i = 0; i < mascotasEquipo.length; i++) {
            if (mascotasEquipo[i] != espacioLibre) {
                for (int j = 0; j < mascotasEquipo[i].tipoMascota.length; j++) {
                    for (int k = 0; k < campoElejido.tiposAfecta.length; k++) {
                        if (mascotasEquipo[i].tipoMascota[j].equals(campoElejido.tiposAfecta[k])) {
                            if (contador == 1) {
                                mascotaCambiada = mascotasEquipo[i];
                                mascotasEquipo[i].puntosAtaque += 3;
                                mascotasEquipo[i].puntosVida += 3;
                                posicionMascota = i;
                                contador++;
                            } else if (contador > 1) {
                                mascotasEquipo[posicionMascota] = mascotaCambiada;
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
