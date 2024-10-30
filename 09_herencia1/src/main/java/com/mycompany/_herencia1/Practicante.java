package com.mycompany._herencia1;
public class Practicante extends Empleado {
    public int meses;
    //constructor
    public Practicante(String nombre, int edad, int meses){
        //como empleado tiene un constructor
        //sin parametros; entonces no es obligatorio
        //construir la super clase aqui.
        //Aunque por buena practica yo lo voy a poner
        super();
        //llenar algunos atributos sin necesidad
        //del constructor de la super clase:
        this.nombre = nombre;
        this.edad = edad;
        this.cargo = "Practicante o Pasante";
        this.meses = meses;
        this.salario = 0;
    }
}
