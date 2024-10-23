package com.mycompany._multiplicidad;
public class Empresa {
    //atributos
    public String nombre;
    private Direccion direccion;
    public int telefono;
    //constructor
    public Empresa(String nombre, Direccion direccion, int telefono) {
        this.nombre = nombre;
        this.setDireccion(direccion);
        this.telefono = telefono;
    }
    //metodos
    public Direccion getDireccion() {
        return this.direccion;
    }
    public void setDireccion(Direccion direccion) {
        if( direccion != null )
            this.direccion = direccion; //se acepta
        else
            throw new IllegalArgumentException("Direccion no puede ser null");
    }
    
}
