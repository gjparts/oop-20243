package com.mycompany._polimorfismo2;

import java.util.Calendar;

public class Media extends File {
    //atributos
    public Author author;
    public int duration;
    //constructor
    public Media(Author author, int duration, String name, long size,
            String extension, Calendar creationDate) {
        //construir la super clase (el type va fijo)
        super(name, size, "Media File", extension, creationDate);
        this.author = author;
        this.duration = duration;
    }
    //metodos
    @Override
    public void print(){
        super.print(); //override parcial
        //nuevas instrucciones:
        if( this.author != null )
            System.out.println("Author: "+this.author.name);
        System.out.println("Duration: "+this.duration+" seconds.");
    }
}
