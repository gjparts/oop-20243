package com.mycompany._asociacion_factura_multiplicidad;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;
public class Factura {
    //atributos
    public int numero;
    public Calendar fecha;
    public Cliente cliente;
    private Producto[] productos; //multiplicidad: eliminar los elementos repetitivos
    //constructor
    public Factura(int numero, Calendar fecha, Cliente cliente, Producto[] productos) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.setProductos(productos);
    }
    //metodos
    //productos puede ser cambiado en cualquier momento; pero no puede ser null
    public void setProductos(Producto[] productos) {
        //al menos el primer elemento del arreglo debe de venir lleno, aparte
        //que todo el arreglo no puede ser null
        if( productos == null )
            throw new IllegalArgumentException("Arreglo productos no puede ser null");
        else
            if( productos.length == 0 )
                throw new IllegalArgumentException("Arreglo productos debe tener al menos un producto");
            else
                if( productos[0] == null )
                    throw new IllegalArgumentException("Primer producto en el arreglo no puede ser null");
                else
                    this.productos = productos; //se acepta el arreglo
    }
    public Producto[] getProductos() {
        return this.productos;
    }
    public void imprimir(){
        System.out.println("*** Factura ***");
        System.out.println("Numero: "+this.numero);
        //aunque el diagrama no nos lo muestre; pero fecha potencialmente
        //puede venir null ya que es un tipo de dato Clase y nada nos obliga
        //a llenarla
        if( this.fecha != null ){
            //imprimir la fecha solo si viene llena
            SimpleDateFormat fff = new SimpleDateFormat("YYYY/MM/dd");
            System.out.println("Fecha: "+fff.format( this.fecha.getTime() ));
        }
        //si el cliente es null entonces solo se imprime consumidor final
        if( this.cliente == null )
            System.out.println("Cliente: consumidor final");
        else{
            System.out.println("Cliente: "+this.cliente.nombre);
            System.out.println("RTN: "+this.cliente.rtn);
        }
        float subtotal = 0;
        System.out.println("Producto\tPrecio");
        //recorrer la coleccion de productos, validar cada uno que sea distinto de null antes de imprimir
        for( int i = 0; i < this.productos.length; i++ ){
            if( this.productos[i] != null ){
                System.out.println(this.productos[i].nombre+"\t"+this.productos[i].precioVenta);
                subtotal += this.productos[i].precioVenta;
            }
        }
        //resultados
        DecimalFormat formato = new DecimalFormat();
        formato.setMaximumFractionDigits(2);
        formato.setMinimumFractionDigits(2);
        
        System.out.println("Subtotal: "+formato.format(subtotal));
        System.out.println("ISV 15%: "+formato.format(subtotal*0.15f));
        System.out.println("Total: "+formato.format(subtotal*1.15f));
    }
}
