package com.mycompany._multiplicidad;
public class Direccion {
    //atributos
    private Barrio colonia;
    public String calle;
    public String avenida;
    public String bloque;
    public String casa;
    //constructor
    public Direccion(Barrio colonia) {
        if( colonia != null )
            this.colonia = colonia; //se acepta
        else
            throw new IllegalArgumentException("Colonia no puede ser null");
    }
    //metodo
    public Barrio getColonia() {
        return this.colonia;
    }
}
