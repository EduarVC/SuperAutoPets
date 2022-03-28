package com.mycompany.Campo;

import static com.mycompany.Campo.Campo.entrada;
import com.mycompany.Mascotas.Mascota;

public class Granja extends Campo {

    public Granja() {
        nombreCampo = "Granja";
        tiposAfecta = new String[3];
        tiposAfecta[0] = "Domestico";
        tiposAfecta[1] = "Mamifero";
        tiposAfecta[2] = "Solitario";
    }

    @Override
    public Mascota[] AplicarEfectosCampo(Mascota[] mascotasEquipo, Campo campoElejido) {
        for (int i = 0; i < mascotasEquipo.length; i++) {
            if (mascotasEquipo[i] != espacioLibre) {
                for (int j = 0; j < mascotasEquipo[i].tipoMascota.length; j++) {
                    for (int k = 0; k < campoElejido.tiposAfecta.length; k++) {
                        if (mascotasEquipo[i].tipoMascota[j].equals(campoElejido.tiposAfecta[k])) {
                            if (null != mascotasEquipo[i].tipoMascota[j]) {
                                switch (mascotasEquipo[i].tipoMascota[j]) {
                                    case "Domestico":
                                        mascotasEquipo[i].puntosAtaque += 1;
                                        break;
                                    case "Mamifero":
                                        mascotasEquipo[i].puntosVida += 1;
                                        break;
                                    case "Solitario":
                                        mascotasEquipo[i].puntosAtaque -= 1;
                                        break;
                                    default:
                                        break;
                                }
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
