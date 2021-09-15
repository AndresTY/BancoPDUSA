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
    
    public void runAll(){
        portafoliosTest();
        validatorTest();
        cloneTest();
    }
}
