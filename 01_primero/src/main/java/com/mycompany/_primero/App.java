/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._primero;

/**
 *
 * @author Gerardo
 */
public class App {

    public static void main(String[] args) {
        //crear un objeto de clase Persona
        Persona pe1 = new Persona();
        System.out.println("Direccion de memoria de pe1: "+pe1);
        //valores de los atributos de pe1
        System.out.println("********* pe1 **********");
        System.out.println("nombre: "+pe1.nombre);
        System.out.println("edad: "+pe1.edad);
        System.out.println("genero: "+pe1.genero);
        //cambiar los valores de los atributos
        //de pe1 desde aqui
        pe1.nombre = "Gerardo";
        pe1.edad = 42;
        pe1.genero = 'M';
        //valores de los atributos de pe1
        System.out.println("********* pe1 **********");
        System.out.println("nombre: "+pe1.nombre);
        System.out.println("edad: "+pe1.edad);
        System.out.println("genero: "+pe1.genero);
        
        Persona pe2 = new Persona("Irene",40,'F');
        //valores de los atributos de pe2
        System.out.println("********* pe2 **********");
        System.out.println("nombre: "+pe2.nombre);
        System.out.println("edad: "+pe2.edad);
        System.out.println("genero: "+pe2.genero);
        
        Persona pe3 = new Persona("Josue");
        //valores de los atributos de pe3
        System.out.println("********* pe3 **********");
        System.out.println("nombre: "+pe3.nombre);
        System.out.println("edad: "+pe3.edad);
        System.out.println("genero: "+pe3.genero);
        
        Carro c1 = new Carro("Honda", "civic", 2004, "negro");
        //valores de los atributos de c1
        System.out.println("********* c1 **********");
        System.out.println("marca: "+c1.marca);
        System.out.println("modelo: "+c1.modelo);
        System.out.println("anio: "+c1.anio);
        System.out.println("color: "+c1.color);
        
        Carro c2 = new Carro("Pontiac", "Vibe");
        //valores de los atributos de c2
        System.out.println("********* c2 **********");
        System.out.println("marca: "+c2.marca);
        System.out.println("modelo: "+c2.modelo);
        System.out.println("anio: "+c2.anio);
        System.out.println("color: "+c2.color);
    }
}
