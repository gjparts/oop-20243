/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._asociacion;

/**
 *
 * @author Gerardo
 */
public class App {

    public static void main(String[] args) {
        Fabricante sony = new Fabricante("Sony", "Japon", "No se");
        Bateria bat1 = new Bateria(sony, 3500);
        System.out.println("Adios");
    }
}
