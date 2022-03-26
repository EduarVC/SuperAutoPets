package com.mycompany.Volador;

import com.mycompany.Mascotas.Mascota;
import com.mycompany.Mascotas.espacioVacio;
import com.mycompany.superautopets.Modos;

public class Mosquito extends Mascota {

    public Mosquito() {
        nombreMascota = "Mosquito";
        habilidad = "Piquete inicial";
        puntosAtaque = 2;
        puntosVida = 2;
        experiencia = 1;
        nivel = 1;
        cantidadFusionados = 0;
        tipoMascota = new String[1];
        tipoMascota[0] = "Volador";
        efecto = false;
        alimento = false;
        nombreAlimento = "Sin Alimentar";
        nombreEfecto = "Sin Efecto";
        dañoRecivido = 0;
    }

    @Override
    public Mascota[] aplicarHabilidad(Mascota[] mascotasJugador, Mascota mascotaHabilidad) {
        Modos mascotasEnemigo = new Modos();
        Mascota espacioLibre = new espacioVacio();
        int contador = 0;
        int numeroAnterior1 = 0;
        int numeroAnterior2 = 0;
        boolean habilidadAplicada = false;
        do {
            int numero = (int) (Math.random() * mascotasEnemigo.mascotasIA.length + 1);
            if (mascotasEnemigo.mascotasIA[numero - 1] != espacioLibre) {
                switch (mascotaHabilidad.nivel) {
                    case 1:
                        mascotasEnemigo.mascotasIA[numero - 1].puntosVida += 1;
                        habilidadAplicada = true;
                        break;
                    case 2:
                        switch (contador) {
                            case 0:
                                mascotasEnemigo.mascotasIA[numero - 1].puntosVida += 1;
                                numeroAnterior1 = numero;
                                contador++;
                                break;
                            case 1:
                                if(numeroAnterior1 != numero){
                                    mascotasEnemigo.mascotasIA[numero - 1].puntosVida += 1;
                                    contador++;
                                }
                                break;
                            default:
                                habilidadAplicada = true;
                                break;
                        }   break;
                    case 3:
                        switch (contador) {
                            case 0:
                                mascotasEnemigo.mascotasIA[numero - 1].puntosVida += 1;
                                contador++;
                                numeroAnterior1 = numero;
                                break;
                            case 1:
                                if(numeroAnterior1 != numero){
                                    mascotasEnemigo.mascotasIA[numero - 1].puntosVida += 1;
                                    contador++;
                                    numeroAnterior2 = numeroAnterior1;
                                    numeroAnterior1 = numero;
                                }
                                break;
                            case 2:
                                if(numeroAnterior2 != numero && numeroAnterior1 != numero){
                                    mascotasEnemigo.mascotasIA[numero - 1].puntosVida += 1;
                                    contador++;
                                }
                                break;
                            default:
                                habilidadAplicada = true;
                                break;
                        }   break;
                    default:
                        break;
                }
            }
        } while (habilidadAplicada != true);

        return mascotasJugador;
    }

}
