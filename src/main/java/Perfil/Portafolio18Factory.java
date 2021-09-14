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
import Factories.IProductoFactory;
import Factories.ProductoAbstractFactory;

import Tarjeta.TarjetaCredito;

import Tarjeta.TarjetaDebito;
import Factories.TarjetaFactory;
import Servicio.CDT;

import launcher.Validador;

/**
 *
 * @author Weriko
 */




public class Portafolio18Factory {
   
    public Perfil darPortafolio(){
       
                
        
        PerfilBuilder pf = new PerfilBuilder();
        pf.reset();
        ProductoAbstractFactory paf = new ProductoAbstractFactory();
        
        Validador v = Validador.getValidador();
        IProductoFactory cf =  paf.darFactory("Cuenta");
        Cuenta ca = (Cuenta) cf.darProducto("ahorros");
        ca.setActivo(true);
        pf.putCuentaAhorros((CuentaAhorros) ca);
        Cuenta cc = (Cuenta) cf.darProducto("corriente");
        IProductoFactory CDTf =paf.darFactory("CDT");
        CDT cdt = (CDT) CDTf.darProducto();

        pf.putCdt(cdt);
        pf.putCuentaCorriente((CuentaCorriente) cc);
        IProductoFactory tf = paf.darFactory("Tarjeta");
        TarjetaDebito db = (TarjetaDebito) tf.darProducto("debito");

        db.setNumero(v.next());
        db.setMax(200000f);
        db.setCuenta(ca);
        pf.putTarjetaDebito(db);
     
        
        TarjetaCredito cb = (TarjetaCredito) tf.darProducto("credito");

        cb.setCupo(1000000);
        cb.setNumero(v.next());
        
        pf.putTarjetaCredito(cb);
        return pf.darPerfil();
      
    } 
    
    
}
