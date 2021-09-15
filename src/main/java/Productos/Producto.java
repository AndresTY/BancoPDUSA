/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

/**
 *
 * @author Weriko
 */
public abstract class Producto {

    private boolean activo = false;
    public String idCliente;
    public String nombreCliente;


    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public Producto() {
    }

    protected Producto(Producto s) {
        this.activo = s.activo;
        this.idCliente = s.idCliente;
        this.nombreCliente = s.nombreCliente;
    }
    
    public String getNombreCliente() {
        return nombreCliente;
    }
    
    protected abstract Producto Clone();
    
    
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void checkActivo() {
        if (!this.isActivo()) {
            throw new ArithmeticException("La cuenta no esta activa!");

        }

    }

}
