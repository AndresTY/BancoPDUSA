/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import Productos.Producto;
import Productos.Servicio.CDT;

/**
 *
 * @author Weriko
 */
public class CDTFactory implements IProductoFactory{
    
    
    public Producto darProducto(){
        return new CDT();
    }
    
    public Producto darProducto(String s){
        return new CDT();
    }
    
}
