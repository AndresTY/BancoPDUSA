/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perfil;

import Productos.Cuenta.CuentaAhorros;
import Productos.Cuenta.CuentaCorriente;
import Productos.Servicio.CDT;
import Productos.Servicio.CreditoRotativo;
import Productos.Tarjeta.TarjetaCredito;
import Productos.Tarjeta.TarjetaDebito;
import launcher.Validador;

/**
 *
 * @author Weriko
 */
public class PortafolioBuilder {
    Portafolio perfil;
    
    public void reset(){
        this.perfil = new Portafolio();
    }
    


    public void putTarjetaCredito(TarjetaCredito t){
        perfil.anadirTarjetaCredito(t);
    }
    
    public void putTarjetaDebito(TarjetaDebito t){
        perfil.anadirTarjetaDebito(t);
    }
     public void putCreditoRotativo(CreditoRotativo c) {
        perfil.setCreditoRotativo(c);
    }


    public void putCdt(CDT cdt) {
        this.perfil.setCdt(cdt);
    }

    public void putCuentaAhorros(CuentaAhorros cuentaAhorros) {
        perfil.setCuentaAhorros(cuentaAhorros);
    }

 

    public void putCuentaCorriente(CuentaCorriente cuentaCorriente) {
        perfil.setCuentaCorriente(cuentaCorriente);
    }
    public Portafolio darPerfil(){
        return this.perfil;
    }
}
