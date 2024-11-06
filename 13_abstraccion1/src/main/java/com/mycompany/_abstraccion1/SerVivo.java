package com.mycompany._abstraccion1;
public abstract class SerVivo {
    //atributos
    public String especie;
    //constructor
    public SerVivo(String especie){
        this.especie = especie;
    }
    //metodos abstractos (prototipos de funcion)
    public abstract void hablar();
    public abstract void alimentarse();
    public abstract void dormir();
    public abstract void desplazarse();
    //metodos concretos (no abstractos)
    public void vivir(){
        //para este ejemplo, el metodo vivir necesita
        //de la existencuas de los metodos abstractos
        this.desplazarse();
        this.alimentarse();
        this.hablar();
        this.dormir();
    }
}
