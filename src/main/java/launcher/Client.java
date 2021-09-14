/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launcher;

import Cuenta.CuentaCorriente;
import Perfil.Perfil;
import Perfil.Portafolio18Factory;

/**
 *
 * @author Weriko
 */
public class Client {
    public static void main(String args[]){
        Portafolio18Factory pf = new Portafolio18Factory(); 
        Perfil p = pf.darPortafolio();
        System.out.println(p);
        
        
        
        
        
        
    }
    
}
