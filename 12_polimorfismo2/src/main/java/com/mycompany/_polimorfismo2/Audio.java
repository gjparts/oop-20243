package com.mycompany._polimorfismo2;
import java.util.Calendar;
public class Audio extends Media {
    //atributos
    public String artist;
    public String album;
    public int year;
    public int track;
    //constructores
    public Audio(String artist, String album, int year, int track,
            Author author, int duration, String name, long size,
            String extension, Calendar creationDate) {
        //construir la super clase
        super(author, duration, name, size, extension, creationDate);
        this.artist = artist;
        this.album = album;
        this.year = year;
        this.track = track;
    }
}
