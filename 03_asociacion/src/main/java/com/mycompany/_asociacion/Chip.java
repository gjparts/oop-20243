package com.mycompany._asociacion;

/**
 * Define a una tarjeta SIM para un smartphone
 * @author Gerardo Portillo
 * @since 2024-10-08
 */
public class Chip {
    //atributos
    private Operador proveedor;
    public int numeroTelefonico;
    //constructor
    public Chip(Operador proveedor, int numeroTelefonico) {
        this.setProveedor(proveedor);
        this.numeroTelefonico = numeroTelefonico;
    }
    //metodos: si Usted decide colocar el metodo set es porque quiere que se
    //pueda modificar el atributo privado en cualquier momento.
    //si no coloca el metodo set entonces el atributo solo deberia poder escribirse
    //en el constructor como paso en la clase Bateria.
    public void setProveedor(Operador proveedor){
        if( proveedor == null )
            throw new IllegalArgumentException("El proveedor no debe de ser null");
        else
            this.proveedor = proveedor; //se acepta
    }
    public Operador getProveedor() {
        return this.proveedor;
    }
    
}
