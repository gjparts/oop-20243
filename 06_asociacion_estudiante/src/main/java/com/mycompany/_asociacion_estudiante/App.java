/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._asociacion_estudiante;

/**
 *
 * @author Gerardo
 */
public class App {

    public static void main(String[] args) {
        Barrio ba1 = new Barrio("Medina", "Honduras", "Cortes", "San Pedro Sula");
        Barrio jardines = new Barrio("Jardines del Valle", "Honduras", "Cortes", "San Pedro Sula");
        Barrio ba2 = new Barrio("El Carmen", "Honduras", "Cortes", "San Pedro Sula");
        
        Direccion dir1 = new Direccion(ba1, "14", "1 y 2", "");
        Direccion dir2 = new Direccion(ba2, "1","1","W10");
        
        Empresa extralum = new Empresa("Extralum", "Construccion", dir1, "12341234");
        
        Cargo c1 = new Cargo("Gerente de IT", 'M', extralum, 40000);
        
        Estudiante e1 = new Estudiante("20012002049", "Gerardo", "Sistemas", 
                42, dir2, c1);
        e1.imprimir();
    }
}
