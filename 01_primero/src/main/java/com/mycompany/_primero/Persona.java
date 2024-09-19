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
}
