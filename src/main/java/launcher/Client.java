/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launcher;

import Perfil.IPortafolioFactory;
import Productos.Cuenta.CuentaCorriente;
import Perfil.Portafolio;
import Perfil.Portafolio18Factory;
import Perfil.PortafolioFactory;
import launcher.Tests.Test;

/**
 *
 * @author Weriko
 */
public class Client {
    public static void main(String args[]){
        PortafolioFactory pf = new PortafolioFactory();
        IPortafolioFactory pf18 = pf.darFactory("18"); 
        Portafolio p18 = pf18.darPortafolio();
        Test test = new Test();
        test.runAll();
        
        
        
       
        
    }
    
}
