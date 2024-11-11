package com.mycompany._abstraccion2;
public class Rectangulo extends Figura {
    //atributos
    private double largo;
    private double ancho;
    //constructor
    public Rectangulo(double largo, double ancho) {
        super("Rectangulo");
        this.largo = largo;
        this.ancho = ancho;
    }
    //implementacion de los metodos abstractos
    @Override
    public double calcularArea() {
        return this.ancho*this.largo;
    }
    @Override
    public double calcularPerimetro() {
        return 2*this.largo+2*this.ancho;
    }
    //metodos
    public double getLargo() {
        return this.largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return this.ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
}
