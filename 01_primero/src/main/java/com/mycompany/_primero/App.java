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
        pe1.imprimir();
        
        //cambiar los valores de los atributos
        //de pe1 desde aqui
        pe1.nombre = "Gerardo";
        pe1.edad = 42;
        pe1.genero = 'M';
        //valores de los atributos de pe1
        pe1.imprimir();
        
        Persona pe2 = new Persona("Irene",40,'F');
        //valores de los atributos de pe2
        pe2.imprimir();
        
        Persona pe3 = new Persona("Josue");
        //valores de los atributos de pe3
        pe3.imprimir();
        
        Carro c1 = new Carro("Honda", "civic", 2004, "negro");
        //valores de los atributos de c1
        /*System.out.println("********* c1 **********");
        System.out.println("marca: "+c1.marca);
        System.out.println("modelo: "+c1.modelo);
        System.out.println("anio: "+c1.anio);
        System.out.println("color: "+c1.color);*/
        c1.imprimir();
        
        Carro c2 = new Carro("Pontiac", "Vibe");
        //valores de los atributos de c2
        /*System.out.println("********* c2 **********");
        System.out.println("marca: "+c2.marca);
        System.out.println("modelo: "+c2.modelo);
        System.out.println("anio: "+c2.anio);
        System.out.println("color: "+c2.color);*/
        c2.imprimir();
        
        //repaso: si imprime una comparacion, lo que se retorna es
        //un booleano: true si se cumple o false si no se cumple
        int laEdad = 19;
        System.out.println( laEdad >= 18 );
        laEdad = 11;
        System.out.println( laEdad >= 18 );
        
        Empleado em1 = new Empleado("Gerardo",42,'M',10000,'T');
        em1.imprimir();
    }
}
