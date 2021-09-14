/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import Perfil.Producto;
import Tarjeta.Tarjeta;
import Tarjeta.TarjetaCredito;
import Tarjeta.TarjetaDebito;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Weriko
 */
public class ProductoAbstractFactory {
    
    public IProductoFactory darFactory(String s){
        
        Map<String, IProductoFactory> map = new HashMap<String,IProductoFactory>();
        map.put("CDT",new CDTFactory());
        map.put("Cuenta",new CuentaFactory());
        map.put("Tarjeta",new TarjetaFactory());
        map.put("CreditoRotativo",new CreditoRotativoFactory());
        return map.get(s);
        
        
    }

 
    
    
    
    
}
