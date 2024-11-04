package com.mycompany._polimorfismo1;
public class Perro extends Animal {
    //atributos
    public String apodo;
    private String raza;
    //constructor
    public Perro(String apodo, String raza,
                int patas, boolean tieneCola) {
        //construir la super clase
        super("Perro", "Canino", patas, tieneCola);
        //atributos de esta clase
        this.apodo = apodo;
        this.raza = raza;
    }
    //metodos
    public void jugar(){
        System.out.println("Sale corriendo, saca la lengua y mueve la cola");
    }
    @Override
    public void hablar(){
        //override completo
        System.out.println("Guau Wof Bark");
    }
    @Override
    public void imprimir(){
        //override parcial
        super.imprimir(); //conservar el metodo de la super clase
        System.out.println("Apodo: "+this.apodo);
        System.out.println("Raza: "+this.raza);
    }
}
