package com.mycompany._asociacion_estudiante;
public class Direccion {
    //atributos
    private Barrio barrio;
    public String calle;
    public String ave;
    public String casa;
    //constructor
    public Direccion(Barrio barrio, String calle, String ave, String casa) {
        if( barrio != null )
            this.barrio = barrio;  //se acepta
        else
            throw new IllegalArgumentException("Barrio no puede ser null");
        
        this.calle = calle;
        this.ave = ave;
        this.casa = casa;
    }
    //metodos
    public Barrio getBarrio() {
        return this.barrio;
    }
}
