package com.mycompany._asociacion;

/**
 * Define a un fabricante de productos de tecnología
 * @author Gerardo Portillo
 * @since 2024-10-07
 */
public class Fabricante {
    //atributos
    public String nombre;
    public String pais;
    public String contacto;
    //constructores
    public Fabricante(String nombre, String pais, String contacto) {
        this.nombre = nombre;
        this.pais = pais;
        this.contacto = contacto;
    }
}
