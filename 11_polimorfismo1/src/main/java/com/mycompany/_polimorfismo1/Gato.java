package com.mycompany._polimorfismo1;
public class Gato extends Animal {
    //atributos
    public String apodo;
    private boolean tienePelaje;
    //constructor
    public Gato(String apodo, boolean tienePelaje,
                int patas, boolean tieneCola) {
        //construir la super clase
        super("Gato", "Felino", patas, tieneCola);
        //inicializar atributos de esta clase:
        this.apodo = apodo;
        this.tienePelaje = tienePelaje;
    }
    //metodos
    public void ronronear(){
        System.out.println("prrrrrrrrrrrr");
    }
    //metodos por polimorfismo (Polimorfismo, reemplazar o cambiar la respuesta
    //de un metodo heredado)
    @Override
    public void hablar(){
        //override completo: no reutilizamos nada del metodo heredado
        //lo que quiere decir que vamos a cambiar por completo su comportamiento.
        System.out.println("Miau");
    }
    @Override
    public void imprimir(){
        //override parcial: vamos a reutilizar el metodo heredado; pero
        //le vamos a agregar mas funcionalidades
        super.imprimir(); //mandar a llamar a imprimir() de la super clase
        //ejecutar las nuevas funcionalidades:
        System.out.println("Apodo: "+this.apodo);
        System.out.println("Tiene pelaje: "+( this.tienePelaje ? "Si" : "No" ));
    }
}
