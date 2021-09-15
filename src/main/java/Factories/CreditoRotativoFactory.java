/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import Productos.Producto;
import Productos.Servicio.CreditoRotativo;

/**
 *
 * @author Weriko
 */
public class CreditoRotativoFactory implements IProductoFactory{
    public Producto darProducto(){
        return new CreditoRotativo();
    }
    public Producto darProducto(String s){
        return new CreditoRotativo();
    }
    
}
