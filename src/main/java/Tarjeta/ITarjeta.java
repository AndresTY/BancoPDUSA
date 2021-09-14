/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarjeta;

import Cuenta.Cuenta;

/**
 *
 * @author Weriko
 */
public interface ITarjeta {
    public void retirar(float a);
    public void configurar(Cuenta c);
    public String getNumero();
        
    
    
}
