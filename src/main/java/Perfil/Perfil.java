/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perfil;

import Cuenta.CuentaAhorros;
import Cuenta.CuentaCorriente;
import Servicio.CDT;
import Servicio.CreditoRotativo;
import Tarjeta.ITarjeta;
import Tarjeta.Tarjeta;
import Tarjeta.TarjetaCredito;
import Tarjeta.TarjetaDebito;
import java.util.ArrayList;
import launcher.Validador;

/**
 *
 * @author Weriko
 */
public class Perfil {
    private CreditoRotativo creditoRotativo;
    private CDT cdt;
    
    
    private CuentaAhorros cuentaAhorros;
    private CuentaCorriente cuentaCorriente;

     private ArrayList<TarjetaCredito> tarjetasCredito = new ArrayList<TarjetaCredito>() ;
     private ArrayList<TarjetaDebito> tarjetasDebito = new ArrayList<TarjetaDebito>();
     
     
     public void checkNumero(Tarjeta tarjeta){
        Validador validador =Validador.getValidador();
        if(!validador.validar(tarjeta.getNumero())){
            
            throw new ArithmeticException("El numero de la tarjeta no es valido!");  
            
        }     
    }

    @Override
    public String toString() {
        return "Perfil{" + "creditoRotativo=" + creditoRotativo + ", cdt=" + cdt + ", cuentaAhorros=" + cuentaAhorros + ", cuentaCorriente=" + cuentaCorriente + ", tarjetasCredito=" + tarjetasCredito + ", tarjetasDebito=" + tarjetasDebito + '}';
    }
    public void anadirTarjetaCredito(TarjetaCredito t){
        checkNumero(t);
        this.tarjetasCredito.add(t);
    }
    public void anadirTarjetaDebito(TarjetaDebito t){
        checkNumero(t);
        this.tarjetasDebito.add(t);
    }

    public CreditoRotativo getCreditoRotativo() {
        return creditoRotativo;
    }

    public void setCreditoRotativo(CreditoRotativo creditoRotativo) {
        this.creditoRotativo = creditoRotativo;
    }

    public CDT getCdt() {
        return cdt;
    }

    public void setCdt(CDT cdt) {
        this.cdt = cdt;
    }

    public CuentaAhorros getCuentaAhorros() {
        return cuentaAhorros;
    }

    public void setCuentaAhorros(CuentaAhorros cuentaAhorros) {
        this.cuentaAhorros = cuentaAhorros;
    }

    public CuentaCorriente getCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }



    public ArrayList<TarjetaCredito> getTarjetasCredito() {
        return tarjetasCredito;
    }

    public void setTarjetasCredito(ArrayList<TarjetaCredito> tarjetasCredito) {
        this.tarjetasCredito = tarjetasCredito;
    }

    public ArrayList<TarjetaDebito> getTarjetasDebito() {
        return tarjetasDebito;
    }

    public void setTarjetasDebito(ArrayList<TarjetaDebito> tarjetasDebito) {
        this.tarjetasDebito = tarjetasDebito;
    }
}
