/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarjeta;

import Cuenta.Cuenta;
import launcher.Validador;

/**
 *
 * @author Weriko
 */
public class TarjetaDebito extends Tarjeta {

    private float max;

    Cuenta cuenta = null;

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public void retirar(float a) {
        if (a > max) {
            throw new ArithmeticException("Limite por transaccion excedido!");
        } 
        else {
            this.checkNumero();
            this.cuenta.retirarDinero(a);
        }
    }

    public void configurar(Cuenta c) {
        this.cuenta = c;
    }

    public float getMax() {
        return max;
    }

    public void setMax(float max) {
        this.max = max;
    }

  

}
