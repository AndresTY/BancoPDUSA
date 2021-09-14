/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarjeta;

import Perfil.Producto;
import launcher.Validador;

/**
 *
 * @author Weriko
 */
public abstract class Tarjeta extends Producto  {
    private String numero = "";
    
    
  

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

    @Override
    public String toString() {
        return "Tarjeta{" + "numero=" + numero + '}';
    }
    
}
