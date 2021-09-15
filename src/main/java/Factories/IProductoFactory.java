/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import Productos.Producto;

/**
 *
 * @author Weriko
 */
public interface IProductoFactory {
    public Producto darProducto();
    public Producto darProducto(String s);
    
}
