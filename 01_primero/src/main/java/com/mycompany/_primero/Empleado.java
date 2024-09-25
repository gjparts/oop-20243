/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._primero;

/**
 * Esta clase describe a un empleado
 * @author Gerardo Portillo
 * @since 2024-09-26
 */
public class Empleado {
    //atributos
    public String nombre;
    private int edad;
    private char genero;
    private float salario;
    private char contrato;
    //constructor
    /**
     * Construye un objeto de clase Empleado
     * @param nombre el nombre del empleado
     * @param edad la edad, debe de ser un numero entero mayor o igual a 18.
     * @param genero es un char y puede ser M = masculino, F = femenino, X = otros
     * @param salario debe de ser un numero positivo
     * @param contrato es un char puede ser T = temporal, P = permanente
     */
    public Empleado(String nombre, int edad, char genero,
            float salario, char contrato) {
        this.nombre = nombre;
        //para los atributos privados hay que usar los set
        this.setEdad(edad);
        this.setGenero(genero);
        this.setSalario(salario);
        this.setContrato(contrato);
    }
    //metodos
    /**
     * Imprime el perfil del empleado
     */
    public void imprimir(){
        System.out.println("****** PERFIL ******");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+this.edad);
        System.out.println("Genero: "+this.genero);
        System.out.println("Salario: "+this.salario);
        System.out.println("Contrato: "+this.contrato);
    }
    //metodo get: permite consultar el valor de un atributo
    //            estos tienen tipo de dato de retorno
    //metodo set: permite escribir un atributo, normalmente son void
    /**
     * Obtiene la edad del empleado
     * @return un numero entero
     */
    public int getEdad(){
        return this.edad;
    }
    /**
     * Establece la edad del empleado
     * @param edad un numero entero que sea mayor o igual a 18
     */
    public void setEdad(int edad){
        if( edad >= 18 )
            this.edad = edad; //se acepta
        else
            throw new IllegalArgumentException("Edad debe de ser >= 18");
    }
    /**
     * Retorna el genero de el empleado
     * @return un valor de tipo char
     */
    public char getGenero(){
        return this.genero;
    }
    /**
     * Establece el genero del empleado
     * @param genero un valor <font color='red'>char</font> que puede ser:
     * <ul>
     *  <li>F para femenino</li>
     *  <li>M para masculino</li>
     *  <li>X para otros</li>
     * </ul>*/
    public void setGenero(char genero){
        if( genero == 'F' || genero == 'M' || genero == 'X' )
            this.genero = genero; //se acepta.
        else
            throw new IllegalArgumentException("Genero debe ser: F, M, X");
    }
    /**
     * Devuelve el salario del empleado
     * @return un valor de tipo float
     */
    public float getSalario(){
        return this.salario;
    }
    /**
     * Establece el salario del empleado
     * @param salario un valor float >= 0
     */
    public void setSalario(float salario){
        if( salario >= 0 )
            this.salario = salario; //se acepta
        else
            throw new IllegalArgumentException("Salario debe de ser >= 0");
    }
    /**
     * Devuelve el tipo de contrato del empleado
     * @return un valor char
     */
    public char getContrato(){
        return this.contrato;
    }
    /**
     * Establece el tipo de contrato del empleado
     * @param contrato un valor char que puede ser:
     * <ul>
     *  <li>T para temporal</li>
     *  <li>P para permanente</li>
     * </ul>
     */
    public void setContrato(char contrato){
        if( contrato == 'T' || contrato == 'P' )
            this.contrato = contrato; //se acepta
        else
            throw new IllegalArgumentException("Contrato debe de ser T, P");
    }
}



