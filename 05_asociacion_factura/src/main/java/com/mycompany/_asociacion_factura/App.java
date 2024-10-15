package com.mycompany._asociacion_factura;
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
        
    }
}
