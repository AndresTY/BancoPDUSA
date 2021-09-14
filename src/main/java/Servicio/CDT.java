/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Cuenta.Cuenta;
import Perfil.Producto;

/**
 *
 * @author Weriko
 */
public class CDT extends Producto  {
    private Cuenta cuenta;
    private float cantidad;

    

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getTermino() {
        return termino;
    }

    public void setTermino(float termino) {
        this.termino = termino;
    }
    private float interes;
    private int id;
    private float termino= 365;
    
}
