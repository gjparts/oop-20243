package com.mycompany._polimorfismo2;
import java.util.Calendar;
import java.util.LinkedList;
public class App {

    public static void main(String[] args) {
        Author yo = new Author("Gerardo", "califik.com", "");
        Calendar f1 = Calendar.getInstance();
        f1.set(2024, 7,27);
        
        Document tesis = new Document(yo, Calendar.getInstance(),
                3000, "Tesis", 1890567, "docx", f1);
        tesis.print();
        
        Audio cancion1 = new Audio("Nirvana", "MTV Unplugged", 1994,
                1, new Author("Nirvana","",""), 210,
                "About a girl", 5432789, "mp3", f1);
        cancion1.print();
        
        String[] pistasAudio = {"Español","Ingles"};
        LinkedList subt1 = new LinkedList();
        subt1.push( new Subtitle("Español", yo) );
        subt1.push( new Subtitle("Ingles", yo) );
        subt1.push( new Subtitle("Chino", yo) );
        subt1.push( new Subtitle("Catalan", yo) );
        
        Video movie = new Video("h264", 8, pistasAudio,
                subt1, yo, 10800, "Lord of the Rings: The Two Towers",
                41943040, "mkv", f1);
        movie.print();
    }
}
