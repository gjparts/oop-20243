package com.mycompany._asociacion_factura_multiplicidad;
import java.util.Calendar;
public class App {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Gerardo", 14011982010554L, 99152959,"");
        Cliente c2 = new Cliente("Estevancito Maravilla",1234123412345L,12341234,"");
        
        CategoriaProducto cat1 = new CategoriaProducto("Frutas","28");
        CategoriaProducto cat2 = new CategoriaProducto("Bebidas","21");
        
        Producto cocacola = new Producto("Coca Cola 3L", cat2, 65);
        Producto fruta1 = new Producto("Manzana", cat1, 8);
        Producto fruta2 = new Producto("Pera", cat1, 12);
        Producto churrito = new Producto("Taqueritos",
                new CategoriaProducto("Botanas", "14"), 12);
        
        Calendar fecha1 = Calendar.getInstance();
        fecha1.set(2024,9,15);
        Factura f1 = new Factura(1, fecha1, c1, cocacola);
        f1.producto3 = churrito;
        f1.imprimir();
        
        Factura f2 = new Factura(2, Calendar.getInstance(), null, fruta1 );
        f2.producto2 = fruta2;
        f2.producto3 = fruta2;
        f2.producto4 = fruta1;
        f2.imprimir();
    }
}
