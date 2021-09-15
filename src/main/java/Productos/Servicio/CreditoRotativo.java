/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos.Servicio;

import Productos.Cuenta.Cuenta;
import Productos.Producto;

/**
 *
 * @author Weriko
 */
public class CreditoRotativo extends Producto  {
    private float cupoMax;
    private float cupoActual;
    
    
    private float credito=0; //Total debido en positivo
    private float cupo=1000000;
    public CreditoRotativo(){}
    public void pagar(float a, Cuenta c){
        this.isActivo();
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
    private CreditoRotativo(CreditoRotativo c){
        super(c);
        this.cupoMax = c.cupoMax;
        this.cupoActual = c.cupoActual;
    }
    @Override
    public Producto Clone() {
        return new CreditoRotativo(this);
    }
    
}
