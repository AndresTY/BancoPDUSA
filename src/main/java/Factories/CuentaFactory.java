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
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Weriko
 */
public class CuentaFactory implements IProductoFactory{
    
    
    
    public Producto darProducto(String c){
        Map<String, Cuenta> map = new HashMap<String, Cuenta>();
        map.put("corriente",new CuentaCorriente());
        map.put("ahorros",new CuentaAhorros());
        return map.get(c);
    }
    
    public Producto darProducto(){
        String c = "ahorros";
        Map<String, Cuenta> map = new HashMap<String, Cuenta>();
        map.put("corriente",new CuentaCorriente());
        map.put("ahorros",new CuentaAhorros());
        return map.get(c);
    }
    
    
    
       
    
    
}
