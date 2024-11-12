package com.mycompany._abstraccion2;
public class App {
    public static void main(String[] args) {
        //Figura f1 = new Figura("Paralelogramo");
        Rectangulo re1 = new Rectangulo(6, 5);
        System.out.println("Area de re1: "+re1.calcularArea());
        System.out.println("Perimetro de re1: "+re1.calcularPerimetro());
        
        Circulo c1 = new Circulo(80);
        System.out.println("Area de c1: "+c1.calcularArea());
        System.out.println("Perimetro de c1: "+c1.calcularPerimetro());
        
        TrianguloEquilatero t1 = new TrianguloEquilatero(15,10);
        System.out.println("Area de t1: "+t1.calcularArea());
        System.out.println("Perimetro de t1: "+t1.calcularPerimetro());
        
        
        Figura f1 = new Figura("Cuadrado"){
            //si se crean nuevos atributos/metodos de esta forma
            //estos no estaran disponibles fuera de este ambito. (A)
            public double lado = 4; //debera asignarles un valor aqui
            //solo se puede implementar lo existente:
            @Override
            public double calcularArea() {
                return Math.pow(lado, 2);
            }
            @Override
            public double calcularPerimetro() {
                return 4*lado;
            }
        };
        //f1.lado = 5; //lo mencionado en (A)
        System.out.println("Area de f1: "+f1.calcularArea());
        System.out.println("Perimetro de f1: "+f1.calcularPerimetro());
 
    }
}
