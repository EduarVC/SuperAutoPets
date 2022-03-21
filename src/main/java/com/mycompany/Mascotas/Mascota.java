package com.mycompany.Mascotas;

public class Mascota {

    //Atributos generales
    protected String nombreMascota;
    protected String habilidad;
    protected String tipoMascota;
    protected int nivel;
    protected int puntosVida;
    protected int puntosAtaque;
    protected int dañoRecivido;
    protected boolean efecto;
    protected int experiencia;

    @Override
    public String toString(){
        return "Nombre: " + nombreMascota +"\nHabilidad: "+ habilidad + "\nNivel: "+ nivel + "\nPuntos de ataque: "+ puntosAtaque + "\nPuntos de vida: " + puntosVida + "\nExperiencia: " + experiencia + "\n";
    }
    
    public void Atacar() {

    }

    public void Fusionarse() {

    }

    public void Alimentarce() {

    }

    public void RecivirDaño() {

    }

    public void CambiarNivel() {

    }

    public void CambiarEfecto() {

    }

}
