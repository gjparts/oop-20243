package com.mycompany._herencia1;
public class Catedratico extends Empleado {
    //atributos
    public String profesion;
    //constructores
    public Catedratico(String nombre, int edad, char genero,
            String profesion, float salario){
        //construir la super clase
        super(nombre, edad, genero, "Docente", salario);
        this.profesion = profesion;
    }
    //metodos
    public void educar(){
        System.out.println("Imparto asignaturas de mi profesion: "+this.profesion);
    }
}
