/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos.Tarjeta;

import Productos.Cuenta.Cuenta;
import Productos.Producto;
import launcher.Validador;

/**
 *
 * @author Weriko
 */
public class TarjetaCredito  extends Tarjeta{
    
    
    private float credito=0; //Total debido en positivo
    private float cupo=1000000;
    
    
    public TarjetaCredito(){}
    public void retirar(float a) {
        this.isActivo();
        this.checkNumero();
        if((this.credito+a)<=this.cupo){
            this.credito+=a;   
        } 
    }
    
    public void pagar(float a, Cuenta c){
        this.isActivo();
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
    
    private TarjetaCredito(TarjetaCredito t){
        super(t);
        this.credito = t.credito;
        this.cupo = t.cupo;
    }

    @Override
    public Producto Clone() {
        return new TarjetaCredito(this);
    }
    
    
}
