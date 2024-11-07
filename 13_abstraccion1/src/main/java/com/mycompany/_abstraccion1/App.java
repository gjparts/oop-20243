package com.mycompany._abstraccion1;
public class App {
    public static void main(String[] args) {
        //no se puede instanciar una clase abstracta por
        //metodos convencionales:
        //SerVivo ser1 = new SerVivo();
        
        Gato gato1 = new Gato("Misifus");
        gato1.vivir();
        //tambien puede ejecutar un solo metodo:
        gato1.desplazarse();
        System.out.println("****************");
        
        Humano h1 = new Humano("Gerardo");
        h1.vivir();
        
        //una clase abstracta se puede instanciar de la siguiente manera:
        SerVivo perro = new SerVivo("Canino"){
            //implementar los metodos abstractos
            @Override
            public void hablar() {
                System.out.println("Wof Guau Bark");
            }
            @Override
            public void alimentarse() {
                System.out.println("Come carne y lo que le tiren.");
            }
            @Override
            public void dormir() {
                System.out.println("Da dos vueltas y se duerme.");
            }
            @Override
            public void desplazarse() {
                System.out.println("Camina moviendo la cola.");
            }
        };
        System.out.println("***************");
        perro.vivir();
    }
}
