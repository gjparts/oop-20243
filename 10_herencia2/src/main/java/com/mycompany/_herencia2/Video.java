package com.mycompany._herencia2;
import java.util.Calendar;
import java.util.LinkedList;
public class Video extends Media {
    //atributos
    public String codec;
    public int chapters;
    public String[] audio;
    public LinkedList<Subtitle> subtitles;
    //constructor
    public Video(String codec, int chapters, String[] audio,
            LinkedList<Subtitle> subtitles, Author author,
            int duration, String name, long size,
            String extension, Calendar creationDate) {
        //construir la super clase
        super(author, duration, name, size, extension, creationDate);
        this.codec = codec;
        this.chapters = chapters;
        this.audio = audio;
        this.subtitles = subtitles;
    }
}