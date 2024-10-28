package com.mycompany._herencia1;
public class Empleado extends Persona {
    //atributos
    public float salario;
    public String cargo;
    //constructores
    //en este caso a la clase quiero hacerle un constructor
    //sin parametros
    public Empleado(){
        //construir la super clase
        super("no tiene",0,'X'); //como no recibimos nada para construir entonces
                                 //ponemos datos predeterminados (default)
        this.cargo = "no determinado";
        this.salario = 0.00f;
    }
    //constructor con todos los parametros (tanto los heredados como los de la clase hija)
    public Empleado(String nombre, int edad, char genero, String cargo, float salario){
        super(nombre, edad, genero); //construir la super clase
        //inicializar los atributos de esta clase
        this.cargo = cargo;
        this.salario = salario;
    }
    //metodos
    public void trabajar(){
        System.out.println("Trabajo como "+this.cargo);
    }
}
