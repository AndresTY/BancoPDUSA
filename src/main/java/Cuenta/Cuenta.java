/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuenta;


import Perfil.Producto;
import java.util.function.Function;
/**
 *
 * @author Weriko
 */
public abstract class Cuenta extends Producto {
    private boolean activo ;
    private float saldo;

    public float getSaldo() {
        this.checkActivo();
        return saldo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setSaldo(float saldo) {
        this.checkActivo();
        this.saldo = saldo;
    }

    public abstract void retirarDinero(float a);
    
    public void checkActivo(){
        if(!this.isActivo()){
            throw new ArithmeticException("La cuenta no esta activa!");  
            
        }
        
        
    }

    @Override
    public String toString() {
        return "Cuenta{" + "activo=" + activo + ", saldo=" + saldo + '}';
    }
    
    
    public void meterDinero(float a) {
        this.checkActivo();
        
        if (a < 0) {
            System.out.println("ERROR: la cantidad a retirar no puede ser negativa");
        } else {
            this.setSaldo(this.getSaldo() + a);
        }

    }

}
