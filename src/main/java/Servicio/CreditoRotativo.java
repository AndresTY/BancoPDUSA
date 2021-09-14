/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Cuenta.Cuenta;
import Perfil.Producto;

/**
 *
 * @author Weriko
 */
public class CreditoRotativo extends Producto  {
    private float cupoMax;
    private float cupoActual;
    
    
    private float credito=0; //Total debido en positivo
    private float cupo=1000000;
    
    public void pagar(float a, Cuenta c){
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
