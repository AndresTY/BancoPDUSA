/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos.Cuenta;


import Productos.Producto;
import java.util.function.Function;
/**
 *
 * @author Weriko
 */
public abstract class Cuenta extends Producto {
    
    private float saldo;

    public float getSaldo() {
        this.checkActivo();
        return saldo;
    }
    
    
    public Cuenta(){}
    protected Cuenta(Cuenta c){
        super(c);
        this.saldo = c.saldo;
         
    }


    public void setSaldo(float saldo) {
        this.checkActivo();
        this.saldo = saldo;
    }

    public abstract void retirarDinero(float a);
    
    

 
    
    
    public void meterDinero(float a) {
        this.checkActivo();
        
        if (a < 0) {
            System.out.println("ERROR: la cantidad a retirar no puede ser negativa");
        } else {
            this.setSaldo(this.getSaldo() + a);
        }

    }

}
