package com.mycompany._asociacion;

/**
 * Describe a una bateria para equipo electronico
 * @author Gerardo Portillo
 * @since 2024-10-07
 */
public class Bateria {
    //atributos
    private Fabricante marca;
    public float miliamperios;
    //constructor
    public Bateria(Fabricante marca, float miliamperios) {
        /*en el diagrama puede notar que la marca en Bateria
        es private y su relacion con Fabricante es por composicion
        por lo tanto es obligatorio que marca tenga algun objeto
        no puede ir nula (null); entonces protegemos a marca
        evitando que puedan enviarle un valor null:*/
        if( marca == null )
            throw new IllegalArgumentException("la marca no debe ser null");
        else
            this.marca = marca; //se acepta
        
        this.miliamperios = miliamperios;
    }
}
