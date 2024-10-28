package com.mycompany._herencia1;
public class Estudiante extends Persona {
    /*es importantr que sepan que cuando la clase
    Padre o Super Clase tiene solo constructores con
    parametros es necesario construir la super clase
    desde el constructor de la clase hija.
    Si la clase Padre llega a tener un constructor
    sin parametros entonces no es obligatorio
    construirla desde la clase hija.*/
    //atributos
    public String cuenta;
    public String carrera;
    //constructor
    public Estudiante(String nombre, int edad, char genero, String cuenta, String carrera) {
        //construir la super clase:
        super(nombre, edad, genero);
        //inicializar los atributos de la clase hija (esta clase)
        this.cuenta = cuenta;
        this.carrera = carrera;
    }
    //metodos
    public void estudiar(){
        System.out.println("Soy estudiante de la carrera: "+this.carrera+", mi edad es "+this.edad);
    }
}
