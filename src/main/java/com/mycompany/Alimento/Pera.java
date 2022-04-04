package com.mycompany.Alimento;

import com.mycompany.Mascotas.Mascota;

public class Pera extends Alimento {

    public Pera() {
        nombreAlimento = "Pera";
        descripccion = "Aumenta 2 puntos de vida y de daño a la mascota seleccionada.";
        tipoEfecto = false;
    }

    public Mascota alimentarMascota(Mascota mascotasJugador) {
        mascotasJugador.puntosAtaque += 2;
        mascotasJugador.puntosVida += 2;
        return mascotasJugador;
    }
}
