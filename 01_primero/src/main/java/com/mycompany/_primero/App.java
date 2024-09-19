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
    }
}
