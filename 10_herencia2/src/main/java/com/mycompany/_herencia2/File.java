package com.mycompany._herencia2;
import java.util.Calendar;
public class File {
    //atributos
    public String name;
    public long size;
    private String type;
    public String extension;
    public Calendar creationDate;
    //constructor
    public File(String name, long size, String type,
            String extension, Calendar creationDate) {
        //validar que type no venga vacio o en blanco
        if( type == null )
            throw new IllegalArgumentException("type cannot be null.");
        else{
            if( type.trim().length() == 0 )
                throw new IllegalArgumentException("type cannot be empty.");
            else
                this.type = type; //se acepta
        }
        
        this.name = name;
        this.size = size;
        this.extension = extension;
        this.creationDate = creationDate;
    }
}
