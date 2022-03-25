package com.mycompany.Mascotas;

public class Mascota {

    //Atributos generales
    public String nombreMascota;
    protected String habilidad;
    protected String tipoMascota;
    public int cantidadFusionados;
    public int nivel;
    public int puntosVida;
    public int puntosAtaque;
    protected int dañoRecivido;
    public boolean efecto;
    protected int experiencia;

    @Override
    public String toString(){
        return "Nombre: " + nombreMascota +"\nHabilidad: "+ habilidad + "\nNivel: "+ nivel + "\nPuntos de ataque: "+ puntosAtaque + "\nPuntos de vida: " + puntosVida + "\nExperiencia: " + experiencia + "\n";
    }
    
    public void Atacar() {

    }

    public int Fusionarse(int cantidadMascotasFucionadas) {
        
        return cantidadFusionados += cantidadMascotasFucionadas;
    }

    public int establecerNivelMascota(int cantidadFunciones){
        switch(cantidadFunciones){
            case 0:
            case 1:
                nivel =1;
                break;
            case 2:
            case 3:
            case 4:
                nivel = 2;
                break;
            case 5:
                nivel = 3;
                break;
        }
        
        return nivel;
    }
    public int aumentarVida(int vida){
       return puntosVida += vida;
    }
    public int aumentarAtaque(int ataque){
        return puntosAtaque += ataque;
    }
    public void Alimentarce() {

    }

    public void RecivirDaño() {

    }

    public void CambiarEfecto() {

    }

}
