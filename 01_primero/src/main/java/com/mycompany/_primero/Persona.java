/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._primero;

/**
 *
 * @author Gerardo
 */
public class Persona {
    //atributos
    public String nombre;
    public int edad;
    public char genero;
    //constructores
    /*los constructores son metodos que permiten
    la creacion de objetos de la clase. Sus caracteristicas
    son:
    1) siempre deben de ser publicos
    2) siempre deben de llamarse igual que la clase (JAVA, C++)
    3) no tienen tipo de dato de retorno puesto que retornan
       una direccion de memoria
    4) regularmente se usan para inicializar los atributos
       de la clase*/
    //constructor sin parametros
    public Persona(){
        //inicializar los atributos con valores predeterminados (default)
        this.nombre = "no tiene";
        this.edad = 0;
        this.genero = 'X';
    }
    //constructor con tres parametros
    public Persona(String nombre, int edad, char genero){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    //constructor con dos parametros
    public Persona(String nombre, char genero){
        this.nombre = nombre;
        this.edad = 0;
        this.genero = genero;
    }
    //constructor con un parametro
    public Persona(String nombre){
        //opcional: si quiere evitar repetir codigo puede mandar
        //a llamar otros constructor para llenar los atributos y luego
        //solo reemplaza el que Usted recibe por este constructor
        //ejemplo: mandare a llamar lo que hace el constructor sin parametros:
        this();
        this.nombre = nombre;
    }
    //metodos
    public void imprimir(){
        System.out.println("********* PERFIL *********");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+this.edad);
        System.out.println("Genero: "+this.getGeneroDescripcion());
        if( this.esMayorDeEdad() == true ) System.out.println("La persona es mayor de edad");
    }
    //metodo que devuelve el genero de la persona; pero como una descripcion larga
    public String getGeneroDescripcion(){
        if( this.genero == 'M' ) return "Masculino";
        if( this.genero == 'F' ) return "Femenino";
        if( this.genero == 'X' ) return "Otros";
        return "No configurado";
    }
    //metodo que devuelve si la persona es mayor de edad
    public boolean esMayorDeEdad(){
        /*if( this.edad >= 18 )
            return true;
        else
            return false;*/
        //retornamos el resultado de comparar la edad con 18
        //si se cumple retorna true, sino retorna false
        return ( this.edad >= 18 );
    }
}
