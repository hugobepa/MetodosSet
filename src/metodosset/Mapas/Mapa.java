/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosset.Mapas;

/**
 *
 * @author hugo
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Mapa {
    
    public static void main(String[] args) 
    {
        Map<Integer,Persona> map = new HashMap<Integer,Persona>();
        
         Persona p= new Persona("juan",10);
        map.put(1,p);
         p= new Persona("paco",15);
        map.put(2,p);
        p= new Persona("mario",5);
        map.put(3,p);
        p= new Persona("alex",20);
       map.put(4,p);
       
       for (Map.Entry<Integer,Persona> entry : map.entrySet())
       {
           System.out.println(entry.getKey()+"  ---- "+entry.getValue().getNom());
       }
        
      
        
        
        
        
        
    }
 
    
}
