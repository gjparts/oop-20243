package com.mycompany._abstraccion2;
public class TrianguloEquilatero extends Figura {
    //atributos
    private double altura;
    private double base;
    //constructor
    public TrianguloEquilatero(double altura, double base) {
        super("Triangulo Equilatero");
        this.altura = altura;
        this.base = base;
    }
    //implementacion de los metodos abstractos
    @Override
    public double calcularArea() {
        return this.base*this.altura/2;
    }
    @Override
    public double calcularPerimetro() {
        return 3*this.base;
    }
    //metodos
    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
}
