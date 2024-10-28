package com.mycompany._herencia1;
public class Persona {
    //atributos
    public String nombre;
    public int edad;
    public char genero;
    //constructor
    public Persona(String nombre, int edad, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    //metodo
    public void saludar(){
        System.out.println("Hola me llamo "+nombre);
    }
}
