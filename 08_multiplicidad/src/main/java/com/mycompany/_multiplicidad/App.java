/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._multiplicidad;

/**
 *
 * @author Gerardo
 */
import java.util.LinkedList;
public class App {

    public static void main(String[] args) {
        Barrio b1 = new Barrio("Jardines del Valle", "Oeste", "21101");
        
        Direccion dir1 = new Direccion(b1);
        dir1.calle = "Bulevar principal";
        Direccion dir2 = new Direccion( new Barrio("Cabañas", "Este", "21101") );
        dir2.avenida = "15";
        dir2.calle = "15";
        dir2.casa = "123";
        dir2.bloque = "";
        
        Persona per1 = new Persona("1234123412345","Filomeno Colinas",99999999);
        per1.direccion = dir1;
        
        Empresa em1 = new Empresa("Agua Arcoiris",  dir2, 33331234);
        per1.empresaLabora = em1;
        
        Persona per2 = new Persona("4321432143210","Alicia Roca Plateada",88888989);
        per1.conyuge = per2;
        
        Mascota m1 = new Mascota("Oreo", "Gato");
        Mascota m2 = new Mascota("Filuais", "Perro");
        Mascota arr1[] = {m1, null, m2, new Mascota("Mandarino", "Gato")};
        per1.mascotas = arr1;
        
        Persona per3 = new Persona("", "Pericles", 0);
        Persona per4 = new Persona("", "Agamenon", 0);
        LinkedList hijos1 = new LinkedList();
        hijos1.push(per3);
        hijos1.push(per4);
        per1.hijos = hijos1;
        
        Diploma di1 = new Diploma("INFOP", "Torno y fresa");
        Diploma di2 = new Diploma("INFOP", "Electronica basica");
        Diploma di3 = new Diploma("INFOP", "Reparacion de motores hidraulicos");
        LinkedList diplomas1 = new LinkedList();
        diplomas1.push(di1);
        diplomas1.push(di2);
        diplomas1.push(di3);
        per1.diplomas = diplomas1;
        
        per1.imprimir();
        
        //puedo tambien colocar datos al conyuge
        per2.conyuge = per1;
        per2.hijos = per1.hijos; //tienen los hijos en comun
        per2.direccion = per1.direccion;
        per2.imprimir();
    }
}
