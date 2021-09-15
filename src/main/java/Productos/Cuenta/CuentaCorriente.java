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
public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(){}
    public CuentaCorriente(CuentaCorriente c){
        super(c);
        
    }
    public CuentaCorriente Clone(){
        return new CuentaCorriente(this);
    }

    public void retirarDinero(float a) { //El saldo puede ser negativo en una cuenta corriente
            this.checkActivo();
            if (a < 0) {
                throw new ArithmeticException("El numero a retirar no puede ser negativo!"); 
            } else {
                this.setSaldo(this.getSaldo() - a);

            }
    
        }

    }


