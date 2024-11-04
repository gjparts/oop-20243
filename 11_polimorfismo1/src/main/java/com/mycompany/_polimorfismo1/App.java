package com.mycompany._polimorfismo1;
public class App {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Cocodrilo", "Lagarto", 4, true);
        animal1.imprimir();
        animal1.hablar();
        
        Gato gato1 = new Gato("Mandarino", true, 4, true);
        gato1.imprimir();
        gato1.hablar();
        gato1.ronronear();
        
        Perro perro1 = new Perro("Benji","Pequines",4,true);
        perro1.imprimir();
        perro1.hablar();
        perro1.jugar();
        
        /*Tambien es posible hacer polimorfismo al momento
        de inicializar un objeto de la superclase, quedando
        el overrida utilizable unicamente una vez.*/
        Animal elefante1 = new Animal("Elefante","Paquidermo",4,true){
            //aqui estamos dentro de la definicion de la clase Animal
            @Override
            public void hablar(){
                System.out.println("emite sonidos de elefante.");
            }
        };
        elefante1.imprimir();
        elefante1.hablar();
        
        Animal gallina = new Animal("Gallina","Gallina",2,true);
        gallina.imprimir();
        gallina.hablar();
    }
}
