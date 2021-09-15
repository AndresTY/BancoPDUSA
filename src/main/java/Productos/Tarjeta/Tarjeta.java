/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos.Tarjeta;

import Productos.Producto;
import launcher.Validador;

/**
 *
 * @author Weriko
 */
public abstract class Tarjeta extends Producto  {
    private String numero = "";
    
    
    public Tarjeta(){}

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public void checkNumero(){
        Validador validador = Validador.getValidador();
        if(!validador.validar(this.numero)){
            throw new ArithmeticException("El numero de la tarjeta no es valido!");  
            
        }
        
        
    }
    protected Tarjeta(Tarjeta t){
        super(t);
        this.numero = t.numero;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "numero=" + numero + '}';
    }
    
}
