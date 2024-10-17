package com.mycompany._asociacion_estudiante;
public class Cargo {
    //atributos
    public String descripcion;
    private char jornada;
    private Empresa empresa;
    private float salario;
    //constructor
    public Cargo(String descripcion, char jornada, Empresa empresa, float salario) {
        if( empresa != null )
            this.empresa = empresa; //se acepta
        else
            throw new IllegalArgumentException("Empresa no puede ser null.");
        
        this.descripcion = descripcion;
        this.setJornada(jornada);
        this.setSalario(salario);
    }
    //metodos
    public char getJornada() {
        return this.jornada;
    }
    public Empresa getEmpresa() {
        return this.empresa;
    }
    public float getSalario() {
        return this.salario;
    }
    public void setSalario(float salario) {
        if( salario >= 0 )
            this.salario = salario; //se acepta
        else
            throw new IllegalArgumentException("Salario debe de ser >= 0");
    }
    public void setJornada(char jornada) {
        if( jornada == 'M' || jornada == 'T' || jornada == 'N' )
            this.jornada = jornada; //se acepta
        else
            throw new IllegalArgumentException("Jornada debe de ser: M, T, N");
    }
    public String getJornadaDescripcion() {
        if( this.jornada == 'M' ) return "Mañana";
        if( this.jornada == 'T' ) return "Tarde";
        if( this.jornada == 'N' ) return "Noche";
        return "Desconocida";
    }
}
