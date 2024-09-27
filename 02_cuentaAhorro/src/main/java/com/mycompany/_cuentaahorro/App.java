/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._cuentaahorro;

/**
 *
 * @author Gerardo
 */
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        /*CuentaAhorro c1 = new CuentaAhorro("Gerardo", "11111111");
        System.out.println("saldo de c1: "+c1.getSaldo());
        c1.depositar(5500);
        System.out.println("saldo de c1: "+c1.getSaldo());
        c1.retirar(4000);
        System.out.println("saldo de c1: "+c1.getSaldo());
        c1.retirar(500);
        System.out.println("saldo de c1: "+c1.getSaldo());*/
        Scanner x = new Scanner(System.in);
        int opcion;
        
        //suponemos que este cliente tiene 3 cuentas de ahorro
        CuentaAhorro c1 = new CuentaAhorro("Gerardo Portillo", "10000001");
        CuentaAhorro c2 = new CuentaAhorro("Gerardo Portillo", "10000002");
        CuentaAhorro c3 = new CuentaAhorro("Gerardo Portillo", "10000003");
        
        CuentaAhorro cuentaActual = c1; //variable bandera para controlar cuenta seleccionada actualmente
        
        do{
            System.out.println("-------------- CAJERO --------------");
            System.out.println("Bienivenido: "+cuentaActual.nombreCliente);
            System.out.println("Cuenta Actual: "+cuentaActual.numeroCuenta);
            System.out.println("1) Depositar");
            System.out.println("2) Retirar");
            System.out.println("3) Consultar saldo");
            System.out.println("4) Cambiar de Cuenta de Ahorros");
            System.out.println("5) Salir");
            System.out.print("Digite el numero de opcion: ");
            opcion = x.nextInt();
            if( opcion == 1 ){
                System.out.print("Digite el monto a depositar: ");
                try{
                    cuentaActual.depositar( x.nextFloat() );
                }catch(Exception ex){
                    System.out.println( ex.getMessage() );
                }
            }
            if( opcion == 2 ){
                System.out.print("Digite el monto a retirar: ");
                try{
                    cuentaActual.retirar( x.nextFloat() );
                }catch(Exception ex){
                    System.out.println( ex.getMessage() );
                }
            }
            if( opcion == 3 ) System.out.println("Saldo Actual: "+cuentaActual.getSaldo());
            if( opcion == 4 ){
                //menu selector de cuentas de ahorro del cliente
                System.out.println("******************************");
                System.out.println("\t1) "+c1.numeroCuenta);
                System.out.println("\t2) "+c2.numeroCuenta);
                System.out.println("\t3) "+c3.numeroCuenta);
                System.out.print("Digite el numero del item deseado: ");
                int itemCuenta = x.nextInt();
                if( itemCuenta == 1 ) cuentaActual = c1;
                if( itemCuenta == 2 ) cuentaActual = c2;
                if( itemCuenta == 3 ) cuentaActual = c3;
                if( itemCuenta < 1 || itemCuenta > 3 ) System.out.println("Cuenta no valida.");
            }
            if( opcion == 5 ) System.out.println("Hasta pronto, retire su tarjeta.");
        }while(opcion != 5);
    }
}
