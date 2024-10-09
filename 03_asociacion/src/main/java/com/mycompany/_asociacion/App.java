/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._asociacion;

/**
 *
 * @author Gerardo
 */
public class App {

    public static void main(String[] args) {
        Operador tigo = new Operador("TIGO", "Centroamerica");
        System.out.println(tigo.nombre);
        System.out.println("Direccion de memoria de tigo: "+tigo);
        Operador claro = new Operador("Claro","Honduras");
        
        Fabricante sony = new Fabricante("SONY", "Japon", "Alguien");
        Fabricante catl = new Fabricante("CATL", "China", "No se");
        Fabricante apple = new Fabricante("Apple Inc.", "USA", "Tim Cook");
        Fabricante samsung = new Fabricante("SAmsung", "Korea", "Alguien");
        
        Bateria b1 = new Bateria(catl, 3500);
        Bateria b2 = new Bateria(samsung, 6000);
        Bateria b3 = new Bateria(catl, 4500);
        Bateria b4 = new Bateria(catl, 6500);
        
        Chip sim1 = new Chip(tigo,99991111);
        Chip sim2 = new Chip(tigo,99994567);
        Chip sim3 = new Chip(claro,33334444);
        Chip sim4 = new Chip(claro,33334321);
        
        Smartphone cel1 = new Smartphone(apple, "iPhone 50", 512, 16,
                                           b4, sim1, null);
        cel1.imprimir();
        
        Smartphone cel2 = new Smartphone(sony, "Xpedia 40", 256, 6,
                                           b3, null, null);
        cel2.imprimir();
        
        Smartphone cel3 = new Smartphone(samsung, "Galaxy S90", 256, 8,
                                            b4, null, sim3);
        cel3.imprimir();
        
        //tambien puede crear objetos sin necesidad de depositarlos en variables
        //por ejemplo el operador de una sim creado en el momento que se hace el chip
        Chip sim5 = new Chip( new Operador("China Mobile","China") , 123457863);
        //bateria cuyo fabricante lo creamos solo en el momento que lo ocupamos
        Bateria b5 = new Bateria(new Fabricante("Toshiba","Japon",""), 8000);
        
        Smartphone cel4 = new Smartphone( samsung, "A123", 128, 4, b5, sim5, sim1);
        cel4.imprimir();
        //cuando Usted crea un objeto sin ponerlo en una variable es porque
        //no lo va a reutilizar
        //el objeto existe dentro de un atributo de otro objeto:
        System.out.println("Fabricante de la bateria del cel4: "+cel4.getBateria().getMarca().nombre);
        System.out.println("Operador de servicios del chip1 del cel4: "+cel4.chip1.getProveedor().nombre);
        
        //puede crear un objeto sin variable para simplemente ejecutar uno de sus metodos
        //al no tener variable no se puede reutilizar:
        new Smartphone(sony, "w810", 4, 1, b1, sim1, null).imprimir();
        //el objeto anterior nace y muere luego de ejecutar su metodo imprimir()
        
    }
}
