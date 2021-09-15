/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launcher.Tests;

import Perfil.IPortafolioFactory;
import Perfil.Portafolio;
import Perfil.PortafolioFactory;
import Productos.Tarjeta.TarjetaCredito;
import launcher.Validador;

/**
 *
 * @author Weriko
 */
public class Test {
    
    public void Assert(boolean b){
        if(!b){
          
            throw new RuntimeException("Assert failed");
        }
    }
    
    
    public void cloneTest(){
    PortafolioFactory pf = new PortafolioFactory();
    IPortafolioFactory pf18 = pf.darFactory("18"); 
    Portafolio p18 = pf18.darPortafolio();
    
    TarjetaCredito tc =  (TarjetaCredito) p18.getTarjetasCredito().get(0).Clone();
    if(p18.getTarjetasCredito().get(0).getCredito()!=1111){
        tc.setCredito(1111);}
    
     
    Assert (System.identityHashCode(tc)!=System.identityHashCode(p18.getTarjetasCredito().get(0)));
    Assert (tc.getCredito()!=p18.getTarjetasCredito().get(0).getCredito());
    
   
    
        }
    
    public void portafoliosTest(){
        PortafolioFactory pf = new PortafolioFactory();
        IPortafolioFactory pf18 = pf.darFactory("18"); 
        IPortafolioFactory pfm = pf.darFactory("menor"); 
        IPortafolioFactory pfmM = pf.darFactory("megaMillonario");
        IPortafolioFactory pfl = pf.darFactory("laboral"); 
        Portafolio p18 = pf18.darPortafolio();
        Portafolio pm = pfm.darPortafolio();
        Portafolio pmM = pfmM.darPortafolio();
        Portafolio pl = pfl.darPortafolio();  
        
    }
    public void validatorTest(){
        Validador v = Validador.getValidador();
        Assert(!v.validar("30000"));
        String t = v.next();
        Assert(v.validar(t));
    
        
    }
    
    public void testCredito(){
        PortafolioFactory pf = new PortafolioFactory();
        IPortafolioFactory pfm = pf.darFactory("menor"); 
        Portafolio pm = pfm.darPortafolio();
        boolean f = false;
        try{
            pm.getTarjetasCredito().get(0).retirar(100); //tarjeta no activada
        }
        catch(Exception e){
            f = true;
        }
        
        Assert(f);
        f = false;
        try{
            pm.getTarjetasCredito().get(0).retirar(20000000); //maximo excedido
        }
        catch(Exception e){
            f = true;
        }
        Assert(f);
        IPortafolioFactory pfl = pf.darFactory("laboral"); 
        Portafolio pl = pfl.darPortafolio();
        pl.getTarjetasCredito().get(0).retirar(4500);
        Assert(pl.getTarjetasCredito().get(0).getCredito() == 4500);
        
        
    }
    
    
    
    public void testDebito(){
        PortafolioFactory pf = new PortafolioFactory();
        IPortafolioFactory pfm = pf.darFactory("menor"); 
        Portafolio pm = pfm.darPortafolio();
        boolean f = false;
        pm.getCuentaAhorros().meterDinero(10000000);
        try{
            pm.getTarjetasDebito().get(0).retirar(1000000); //maximo excedido
        }
        catch(Exception e){
            f = true;
        }
        pm.getTarjetasDebito().get(0).retirar(1000);
        
        Assert(f);
        Assert(pm.getCuentaAhorros().getSaldo()==10000000-1000);
        
        
        
        
    }
    
    public void runAll(){
        portafoliosTest();
        validatorTest();
        cloneTest();
        testCredito();
        testDebito();
    }
}
