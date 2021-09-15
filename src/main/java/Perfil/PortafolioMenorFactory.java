/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perfil;

import Productos.Cuenta.Cuenta;
import Productos.Cuenta.CuentaAhorros;
import Productos.Cuenta.CuentaCorriente;
import Factories.IProductoFactory;
import Factories.ProductoAbstractFactory;
import Productos.Servicio.CDT;
import Productos.Servicio.CreditoRotativo;
import Productos.Tarjeta.TarjetaCredito;
import Productos.Tarjeta.TarjetaDebito;
import launcher.Validador;

/**
 *
 * @author Weriko
 */
public class PortafolioMenorFactory  implements IPortafolioFactory {
    public Portafolio darPortafolio(){
       
                
        
        PortafolioBuilder pf = new PortafolioBuilder();
        pf.reset();
        ProductoAbstractFactory paf = new ProductoAbstractFactory();
        
        Validador v = Validador.getValidador();
        IProductoFactory cf =  paf.darFactory("Cuenta");
        IProductoFactory CDTf =paf.darFactory("CDT");
        IProductoFactory tf = paf.darFactory("Tarjeta");
        IProductoFactory crf = paf.darFactory("CreditoRotativo");
        
        Cuenta ca = (Cuenta) cf.darProducto("ahorros");
        ca.setActivo(true);
        pf.putCuentaAhorros((CuentaAhorros) ca);
        Cuenta cc = (Cuenta) cf.darProducto("corriente");

        
        CDT cdt = (CDT) CDTf.darProducto();
        cdt.setActivo(true);
        cdt.setTermino(2);
        cdt.setCantidad(200000);
        pf.putCdt(cdt);
        pf.putCuentaCorriente((CuentaCorriente) cc);
        
        TarjetaDebito db = (TarjetaDebito) tf.darProducto("debito");
        db.setActivo(true);

        db.setNumero(v.next());
        db.setMax(100000f);
        db.setCuenta(ca);
        pf.putTarjetaDebito(db);
        CreditoRotativo cr = (CreditoRotativo) crf.darProducto();
        cr.setCupo(0);
        pf.putCreditoRotativo(cr);
        TarjetaCredito cb = (TarjetaCredito) tf.darProducto("credito");
        
        pf.putTarjetaCredito(cb);
        return pf.darPerfil();
      
    } 
    
}
