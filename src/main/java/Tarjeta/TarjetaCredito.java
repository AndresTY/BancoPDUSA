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
public class TarjetaCredito  extends Tarjeta{
    
    
    private float credito=0; //Total debido en positivo
    private float cupo=1000000;
  
    public void retirar(float a) {
        this.checkNumero();
        if((this.credito+a)<=this.cupo){
            this.credito+=a;   
        } 
    }
    
    public void pagar(float a, Cuenta c){
        this.checkNumero();
        c.retirarDinero(a);
           this.credito-=a;   
        
        
    }


    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }

    public float getCupo() {
        return cupo;
    }

    public void setCupo(float cupo) {
        this.cupo = cupo;
    }
    
    
}
