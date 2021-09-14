/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launcher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Weriko
 */
public class Validador {
     
    private static Validador v;
    String numgen = "0420240";
    
    
    private Validador(){
       
        System.out.println("Instancia creada");
    }
    public static Validador getValidador(){
        if(v==null){
            v=new Validador();
        }
        return v;
    }
    
    public boolean validar(String n){ 
        ArrayList<Integer> digitos = new ArrayList<Integer>();
        int suma=0;
        int c =0;
        boolean flag = true;
        char t[] = n.toCharArray();
        for(int i=0;i<n.length();i++){
            digitos.add((int) t[i]-48);

        }
        Collections.reverse(digitos);
        for(int i =0;i<digitos.size();i++){
            
           
            if(i%2!=0){
             digitos.set(i, digitos.get(i)*2);
         
             
            }
           
            if(digitos.get(i)>9){
                 digitos.set(i, digitos.get(i)-9);
            //     System.out.println("AAAA");
             }

        }
        for(int i =0;i<digitos.size();i++){
         ///   System.out.println(digitos.get(i));
            suma+=digitos.get(i);
        }
        
        
        
        return suma%10==0;
    }
    
    public String next(){
        this.numgen+="0"+"0420240";
        return this.numgen;
    }
}
