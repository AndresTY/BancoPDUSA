/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos.Cuenta;

/**
 *
 * @author Weriko
 */
public class CuentaAhorros extends Cuenta {

    private float tasaInteres;

    public void generarInteres() {
        this.checkActivo();
        this.setSaldo(this.getSaldo() * (1 + this.tasaInteres));
    }


   
    public CuentaAhorros(){}
    
    private CuentaAhorros(CuentaAhorros c){
        super(c);
        this.tasaInteres = c.tasaInteres;
        
    }
    
    public CuentaAhorros Clone(){
        return new CuentaAhorros(this);
    }

    public void retirarDinero(float a) {
        this.checkActivo();

        if ((this.getSaldo() - a) < 0) {
            throw new ArithmeticException("Saldo insuficiente!"); 
        } else if (a < 0) {
            throw new ArithmeticException("La cantidad no puede ser negativa!"); 
        } else {
            this.setSaldo(this.getSaldo() - a);

        }
    }

}
