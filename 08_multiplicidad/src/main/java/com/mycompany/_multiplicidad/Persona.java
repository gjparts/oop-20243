package com.mycompany._multiplicidad;
import java.util.LinkedList; //importacion de lista vinculada
public class Persona {
    //atributos
    public String identidad;
    public String nombre;
    public int telefono;
    public Direccion direccion;
    public Empresa empresaLabora;
    public Mascota[] mascotas;
    public Persona conyuge; //referencia circular
    public LinkedList<Diploma> diplomas; //lista vinc. restringida solo a objetos Diploma
    public LinkedList<Persona> hijos;//lista vinc. restringida solo a objetos Persona
    //constructor
    public Persona(String identidad, String nombre, int telefono) {
        this.identidad = identidad;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    //metodos
    public void imprimir(){
        System.out.println("********** Perfil **********");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Identidad: "+this.identidad);
        System.out.println("Telefono: "+this.telefono);
        //direccion (quiza no venga llena)
        if( this.direccion != null ){
            System.out.println("Direccion donde reside:");
            System.out.println("\tBarrio: "+this.direccion.getColonia().nombre);
            System.out.println("\tCalle: "+this.direccion.calle);
            System.out.println("\tAvenida: "+this.direccion.avenida);
            System.out.println("\tBloque: "+this.direccion.bloque);
            System.out.println("\tCasa: "+this.direccion.casa);
            System.out.println("\tCodigo Postal: "+this.direccion.getColonia().codigoPostal);
        }
        //conyuge puede venir null
        if( this.conyuge != null ){
            System.out.println("Conyuge: "+this.conyuge.nombre);
            System.out.println("\tTelefono del conyuge: "+this.conyuge.telefono);
        }
        //empresa donde labora
        if( this.empresaLabora != null ){
            System.out.println("Empresa donde trabaja: ");
            System.out.println("\tNombre: "+this.empresaLabora.nombre);
            System.out.println("\tTelefono: "+this.empresaLabora.telefono);
            System.out.println("\tDireccion de la empresa:");
            System.out.println("\t\tBarrio: "+this.empresaLabora.getDireccion().getColonia().nombre);
            System.out.println("\t\tCalle: "+this.empresaLabora.getDireccion().calle);
            System.out.println("\t\tAvenida: "+this.empresaLabora.getDireccion().avenida);
            System.out.println("\t\tBloque: "+this.empresaLabora.getDireccion().bloque);
            System.out.println("\t\tCasa: "+this.empresaLabora.getDireccion().casa);
            System.out.println("\t\tCodigo Postal: "+this.empresaLabora.getDireccion().getColonia().codigoPostal);
        }
        //imprimir el Array de mascotas
        if( this.mascotas != null ){
            System.out.println("Mascotas:");
            for( int i = 0; i < this.mascotas.length; i++ ){
                //imprimir cada mascota siempre y cuando no sea null
                if( this.mascotas[i] != null ){
                    System.out.println("\t* Nombre: "+this.mascotas[i].nombre);
                    System.out.println("\t  Especie: "+this.mascotas[i].especie);
                }
            }
        }
        //imprimir la coleccion de diplomas que viene en una lista vinculada
        if( this.diplomas != null ){
            System.out.println("Diplomas:");
            //recorrer cada item de la lista
            for( int i = 0; i < this.diplomas.size(); i++ ){
                //imprimir cada diploma mientras no sea null
                if( this.diplomas.get(i) != null ){
                    System.out.println("\t* Institucion: "+this.diplomas.get(i).institucion);
                    System.out.println("\t  Nombre: "+this.diplomas.get(i).nombre);
                }
            }
        }
    }
}
