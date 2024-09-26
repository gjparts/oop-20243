/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._cuentaahorro;

/**
 * Describe una cuenta de ahorro de esta institucion
 * @author Gerardo Portillo
 */
public class CuentaAhorro {
    //atributos
    public String nombreCliente;
    public String numeroCuenta;
    private float saldo;
    //constructor
    public CuentaAhorro(String nombreCliente, String numeroCuenta){
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.00f;
    }
    //metodos
    /**
     * Devuelve el saldo actual de la cuenta de ahorro
     * @return un valor float
     */
    public float getSaldo(){
        return this.saldo;
    }
    /**
     * Aumenta el saldo de la cuenta de ahorro
     * @param monto valor float del monto a sumar al saldo.
     */
    public void depositar(float monto){
        if( monto < 0 )
            throw new IllegalArgumentException("No se permite depositar montos negativos.");
        else
            this.saldo += monto; //se acepta
    }
    /**
     * Reduce el saldo de la cuenta de ahorro
     * @param monto valor float del monto a restar del saldo
     */
    public void retirar(float monto){
        if( monto < 0 )
            throw new IllegalArgumentException("No se permite retirar montos negativos.");
        else
            if( monto > this.saldo )
                throw new IllegalArgumentException("No puede retirar mas del saldo disponibe.");
            else
                this.saldo -= monto; //se acepta
    }
}
