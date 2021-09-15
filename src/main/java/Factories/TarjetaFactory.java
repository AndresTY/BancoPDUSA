/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import Productos.Cuenta.Cuenta;
import Productos.Cuenta.CuentaAhorros;
import Productos.Cuenta.CuentaCorriente;
import Productos.Producto;
import Productos.Tarjeta.Tarjeta;
import Productos.Tarjeta.TarjetaCredito;
import Productos.Tarjeta.TarjetaDebito;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Weriko
 */
public class TarjetaFactory implements IProductoFactory{
    
    
    public Producto darProducto(String c){
        Map<String, Tarjeta> map = new HashMap<String, Tarjeta>();
        map.put("credito",new TarjetaCredito());
        map.put("debito",new TarjetaDebito());
        return map.get(c);
        
        
    }
    public Producto darProducto(){
        
        String c = "debito";
        Map<String, Tarjeta> map = new HashMap<String, Tarjeta>();
        map.put("credito",new TarjetaCredito());
        map.put("debito",new TarjetaDebito());
        return map.get(c);
        
        
    }
    
}
