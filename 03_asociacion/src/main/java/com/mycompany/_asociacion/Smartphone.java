package com.mycompany._asociacion;

/**
 * Describe a un telefono inteligente
 * @author Gerardo Portillo
 * @since 2024-10-08
 */
public class Smartphone {
    //atributos
    private Fabricante marca;
    private String modelo;
    private int almacenamiento;
    private int ram;
    private Bateria bateria;
    public Chip chip1;
    public Chip chip2;
    //constructores
    /*la marca solo se puede definir a la hora de construir, al igual
    que el modelo, almacenamiento y ram puesto que en un smartphone
    estos no pueden cambiarse en cualquier momento.
    en cambio la bateria si se puede cambiar en cualquier momento
    por ello le puse un metodo set*/
    public Smartphone(Fabricante marca, String modelo, int almacenamiento,
                        int ram, Bateria bateria, Chip chip1, Chip chip2) {
        if( marca == null )
            throw new IllegalArgumentException("La marca no debe ser null");
        else
            this.marca = marca; //se acepta
        
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
        this.ram = ram;
        
        this.setBateria(bateria);
        this.chip1 = chip1;
        this.chip2 = chip2;
    }
    //metodos
    public void setBateria(Bateria bateria) {
        if( bateria == null )
            throw new IllegalArgumentException("bateria no puede ser null");
        else
            this.bateria = bateria; //se acepta
    }
    public Fabricante getMarca() {
        return this.marca;
    }
    public String getModelo() {
        return this.modelo;
    }
    public int getAlmacenamiento() {
        return this.almacenamiento;
    }
    public int getRam() {
        return this.ram;
    }
    public Bateria getBateria() {
        return this.bateria;
    }
    public void imprimir(){
        System.out.println("*********  Smartphone *********");
        System.out.println("Fabricante: "+this.marca.nombre);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Almacenamiento interno: "+this.almacenamiento+"GB");
        System.out.println("Memoria RAM: "+this.ram+"GB");
        //la bateria no puede ser null por lo tanto siempre va a tener
        //un objeto por lo tanto no es necesario validar cuando se va a leer
        System.out.println("Bateria: ");
        System.out.println("\tMarca: "+this.bateria.getMarca().nombre);
        System.out.println("\tMiliamperios: "+this.bateria.miliamperios);
        //imprimir los chip (simcard)
        //en el diagrama vemos que chip1 y chip2 tienen una relacion por
        //agregacion por lo tanto pueden ir o no lleno o sea pueden tener
        //valor null, cuando tenemos objetos que permitan tener valores
        //null entonces validamos que solo si son diferentes de null vamos
        //a leerlos
        //chip1 solo lo vamos a leer si NO es null
        if( this.chip1 != null ){
            System.out.println("Chip 1:");
            System.out.println("\tNumero: "+this.chip1.numeroTelefonico);
            System.out.println("\tOperador: "+this.chip1.getProveedor().nombre);
        }
        //chip2 solo lo vamos a leer si NO es null
        if( this.chip2 != null ){
            System.out.println("Chip 2:");
            System.out.println("\tNumero: "+this.chip2.numeroTelefonico);
            System.out.println("\tOperador: "+this.chip2.getProveedor().nombre);
        }
    }
}
