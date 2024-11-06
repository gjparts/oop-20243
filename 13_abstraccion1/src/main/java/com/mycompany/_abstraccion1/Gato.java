package com.mycompany._abstraccion1;
public class Gato extends SerVivo {
    //atributos
    public String apodo;
    //constructor
    public Gato(String apodo){
        //construir la super clase
        super("Felino");
        this.apodo = apodo;
    }
    //implementar los metodos abstractos (obligatorios)
    @Override
    public void desplazarse(){
        System.out.println("Camina de forma sigilosa");
    }
    @Override
    public void dormir(){
        System.out.println("Descansa por ahi");
    }
    @Override
    public void alimentarse(){
        System.out.println("Come alimentos gatunos");
    }
    @Override
    public void hablar(){
        System.out.println("Miau");
    }
}
