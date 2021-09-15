/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perfil;

import Productos.Tarjeta.TarjetaCredito;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Weriko
 */
public class PortafolioFactory {
     public IPortafolioFactory darFactory(String c){
        Map<String, IPortafolioFactory> map = new HashMap<String,  IPortafolioFactory>();
        map.put("18",new Portafolio18Factory());
        map.put("laboral",new PortafolioLaboralFactory());
        map.put("menor",new PortafolioMenorFactory());
        map.put("megaMillonario",new PortafolioMegaMillonarioFactory()); 
        return map.get(c);
        
        
    }
   
        
    
    
}
