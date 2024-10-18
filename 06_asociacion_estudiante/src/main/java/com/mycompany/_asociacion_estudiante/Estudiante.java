package com.mycompany._asociacion_estudiante;
public class Estudiante {
    //atributos
    public String cuenta;
    public String nombre;
    public String carrera;
    private int edad;
    private Direccion direccion;
    public Cargo trabajo;
    //constructor
    public Estudiante(String cuenta, String nombre, String carrera, int edad, Direccion direccion, Cargo trabajo) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.carrera = carrera;
        this.setEdad(edad);
        this.setDireccion(direccion);
        this.trabajo = trabajo;
    }
    //metodos
    public int getEdad() {
        return this.edad;
    }
    public Direccion getDireccion() {
        return this.direccion;
    }
    public void setEdad(int edad) {
        if( edad >= 0 )
            this.edad = edad; //se acepta
        else
            throw new IllegalArgumentException("Edad debe de ser >= 0");
    }
    public void setDireccion(Direccion direccion) {
        if( direccion != null )
            this.direccion = direccion; //se acepta
        else
            throw new IllegalArgumentException("Direccion no puede ser null.");
    }
    public void imprimir(){
        System.out.println("********* Estudiante *********");
        System.out.println("Cuenta: "+this.cuenta);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Carrera: "+this.carrera);
        System.out.println("Edad: "+this.edad+" años.");
        //la direccion ya es validada por el constructor y por su respectivo set
        //por lo tanto no puede ser null asi que no es necesario validarla
        System.out.println("Direccion: ");
        System.out.println("\tCalle: "+this.direccion.calle);
        System.out.println("\tAvenida: "+this.direccion.ave);
        System.out.println("\tCasa: "+this.direccion.casa);
        //el barrio dentro de direccion tampoco puede ser null
        System.out.println("\tBarrio: "+this.direccion.getBarrio().nombre);
        System.out.println("\tCiudad: "+this.direccion.getBarrio().ciudad);
        System.out.println("\tMunicipio: "+this.direccion.getBarrio().municipio);
        System.out.println("\tPais: "+this.direccion.getBarrio().pais);
        //trabajo puede venir null, lo ignoramos si asi fuere
        if( this.trabajo != null ){
            System.out.println("Informacion laboral:");
            System.out.println("\tEmpresa/Negocio: "+this.trabajo.getEmpresa().nombre);
            System.out.println("\tCargo: "+this.trabajo.descripcion);
            System.out.println("\tJornada: "+this.trabajo.getJornadaDescripcion());
            System.out.println("\tSalario:"+this.trabajo.getSalario());
            System.out.println("\tCiudad: "+this.trabajo.getEmpresa().getDireccion().getBarrio().ciudad);
            System.out.println("\tRubro: "+this.trabajo.getEmpresa().rubro);
        }
    }
}
