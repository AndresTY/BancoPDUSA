/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perfil;

import Cuenta.Cuenta;
import Cuenta.CuentaAhorros;
import Cuenta.CuentaCorriente;
import Factories.CuentaFactory;


import Tarjeta.TarjetaDebito;

import launcher.Validador;

/**
 *
 * @author Weriko
 */
public class PortafolioLaboralFactory {
     /*
    public Perfil darPerfil(){
       
       PerfilBuilder pf = new PerfilBuilder();
        pf.reset();
        Validador v = Validador.getValidador();
        CuentaFactory cf = new CuentaFactory();
        Cuenta ca = cf.getCuenta("ahorros");
        ca.setActivo(true);
        pf.putCuentaAhorros((CuentaAhorros) ca);
        Cuenta cc = cf.getCuenta("corriente");
        cc.setActivo(true);
        CDTBuilder cdtb = new CDTBuilder();
        cdtb.reset();
        cdtb.putTermino(5);
        pf.putCdt(cdtb.darCDT());
        pf.putCuentaCorriente((CuentaCorriente) cc);
        
        TarjetaDebitoBuilder db = new TarjetaDebitoBuilder();
        db.reset();
        db.putNumero(v.next());
      
        db.configurarCuenta(ca);
        pf.putTarjetaDebito((TarjetaDebito) db.darTarjeta());
     
        
        TarjetaCreditoBuilder cb = new TarjetaCreditoBuilder();
        cb.reset();
        cb.putCupo(1000000);
        cb.putNumero(v.next());
        cb.configurarCuenta(ca);
        
        pf.putTarjetaDebito((TarjetaDebito) db.darTarjeta());
        return pf.darPerfil();
    }
    */

}