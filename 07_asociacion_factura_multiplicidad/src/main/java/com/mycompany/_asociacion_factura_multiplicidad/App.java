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
        
        //coleccion de productos para f1
        Producto arr1[] = { cocacola, churrito };
        
        Factura f1 = new Factura(1, fecha1, c1, arr1);
        f1.imprimir();
        
        //coleccion de productos para f2
        Producto arr2[] = { fruta1, fruta2, fruta2, fruta1 };
        
        Factura f2 = new Factura(2, Calendar.getInstance(), null, arr2 );
        f2.imprimir();
        
        Producto arr3[] = {churrito, churrito, churrito, churrito, cocacola, cocacola, fruta1};
        Factura f3 = new Factura(3,Calendar.getInstance(),c1, arr3);
        f3.imprimir();
        
        Factura f4 = new Factura(4, Calendar.getInstance(), c1, new Producto[]{ fruta1, cocacola } );
        f4.imprimir();
    }
}
