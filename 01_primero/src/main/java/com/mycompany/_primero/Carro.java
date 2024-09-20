/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._primero;

/**
 *
 * @author Gerardo
 */
public class Carro {
    //atributos
    public String marca;
    public String modelo;
    public int anio;
    public String color;
    //constructores
    //constr. con 4 param.
    public Carro(String marca, String modelo, int anio, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
    }
    //constr. con 2 param.
    public Carro(String marca, String modelo){
        this(marca,modelo,0,"no tiene");
        /*this.marca = marca;
        this.modelo = modelo;
        this.anio = 0;
        this.color = "no tiene";*/
    }
    /*Si JAVA encuentra que en una clase ya hay constructores entonces
    ya no les va a crear el contructor sin parametros en caso de que no esté.*/
}
