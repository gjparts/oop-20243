package com.mycompany._herencia1;

public class App {

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Gerardo", 42, 'M', "20012002049", "Ing. Industrial");
        e1.saludar();
        e1.estudiar();
        
        Persona per1 = new Persona("Kurko Bain", 28, 'M');
        per1.saludar();
        
        Empleado em1 = new Empleado();
        em1.nombre = "Pablo Marmol";
        em1.edad = 45;
        em1.saludar();
        em1.trabajar();
        
        Empleado em2 = new Empleado("Federico Mercurio", 40, 'M', "Cantante", 1000000);
        em2.saludar();
        em2.trabajar();
        
        Practicante prac1 = new Practicante("Estebancito Maravilla", 80, 6);
        prac1.saludar();
        prac1.trabajar();
        System.out.println(prac1.salario);
        System.out.println(prac1.meses);
        
        Catedratico cat1 = new Catedratico("Albert Einstein", 
                150, 'M', "Fisico", 100000);
        cat1.saludar();
        cat1.trabajar();
        cat1.educar();
        System.out.println(cat1.genero);
        System.out.println(cat1.salario);
        System.out.println(cat1.profesion);
    }
}
