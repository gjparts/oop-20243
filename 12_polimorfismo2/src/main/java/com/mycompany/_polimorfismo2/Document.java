package com.mycompany._polimorfismo2;
import java.util.Calendar;
import java.text.SimpleDateFormat;
public class Document extends File {
    //atributos
    public Author author;
    public Calendar modificationDate;
    public int words;
    //constructor
    public Document(Author author, Calendar modificationDate,
            int words, String name, long size,
            String extension, Calendar creationDate) {
        //construir la super clase (el type va fijo)
        super(name, size, "Document File", extension, creationDate);
        this.author = author;
        this.modificationDate = modificationDate;
        this.words = words;
    } 
    //metodos
    @Override
    public void print() {
        super.print(); //override parcial
        //nuevas instrucciones:
        if( this.author != null )
            System.out.println("Author: "+this.author.name);
        if( this.modificationDate != null ){
            SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
            System.out.println("Modification date: "+formato.format(this.modificationDate.getTime()));
        }
        System.out.println("Words: "+this.words);
    }
    
}
