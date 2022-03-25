package com.mycompany.Alimento;

import com.mycompany.Mascotas.Mascota;

public class Pastelillo extends Alimento {

    public Pastelillo() {
        nombreAlimento = "Pastelillo";
        descripccion = "Aumenta 3 puntos de vida y de daño por la siguiente ronda.";
        tipoEfecto = false;
    }

    public Mascota alimentarMascota(Mascota mascotaAlimentada) {
        mascotaAlimentada.puntosAtaque = +3;
        mascotaAlimentada.puntosVida = +3;
        return mascotaAlimentada;
    }
}
