package com.mycompany._asociacion_factura;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;
public class Factura {
    //atributos
    public int numero;
    public Calendar fecha;
    public Cliente cliente;
    private Producto producto1;
    public  Producto producto2;
    public  Producto producto3;
    public  Producto producto4;
    //constructor
    public Factura(int numero, Calendar fecha, Cliente cliente, Producto producto1) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.setProducto1(producto1);
    }
    //metodos
    //producto1 puede ser cambiado en cualquier momento; pero no puede ser null
    public void setProducto1(Producto producto1) {
        if( producto1 == null )
            throw new IllegalArgumentException("producto1 no puede ser null");
        else
            this.producto1 = producto1; //se acepta
    }
    public Producto getProducto1() {
        return this.producto1;
    }
    public Producto getProducto2() {
        return this.producto2;
    }
    public Producto getProducto3() {
        return this.producto3;
    }
    public Producto getProducto4() {
        return this.producto4;
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
        //producto1 nunca va a llegar a ser null segun hemos diseñado esta clase
        //por lo tanto no es necesario validarlo
        System.out.println(this.producto1.nombre+"\t"+this.producto1.precioVenta);
        subtotal += this.producto1.precioVenta;
        //producto2 a producto4 pueden llegar a ser null:
        if( this.producto2 != null ){
            System.out.println(this.producto2.nombre+"\t"+this.producto2.precioVenta);
            subtotal += this.producto2.precioVenta;
        }
        if( this.producto3 != null ){
            System.out.println(this.producto3.nombre+"\t"+this.producto3.precioVenta);
            subtotal += this.producto3.precioVenta;
        }
        if( this.producto4 != null ){
            System.out.println(this.producto4.nombre+"\t"+this.producto4.precioVenta);
            subtotal += this.producto4.precioVenta;
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
