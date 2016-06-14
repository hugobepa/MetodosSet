/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosset.Treeset;

/**
 *
 * @author hugo
 */

import metodosset.List.Persona;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import  java.util.TreeSet;
import java.util.Comparator;
public class Treeset {
    
    
    
    public static void main(String[] args) {
        TreeSet<Persona> arbol = new TreeSet<Persona>(Comparator.comparing(Persona::getEdad));
        //TreeSet <Persona>arbol = new TreeSet<Persona>();
        //Set<Persona>kit= new HashSet<Persona>();
        SortedSet<Persona> arbol1=new TreeSet<Persona>();
        ArrayList<Persona> llista = new ArrayList<Persona>();
        Persona p= new Persona("juan",10);
        llista.add(p);
         p= new Persona("paco",15);
        llista.add(p);
        p= new Persona("mario",5);
        llista.add(p);
        p= new Persona("alex",20);
        llista.add(p);
        arbol.addAll(llista);
        
        
       
        
        
        
        //Itinirador
        Iterator iterator = arbol.iterator();
        
        
        
        System.out.println(arbol.size());
        System.out.println("ARBOL");
        System.out.println(arbol);
        for(Persona a:arbol)
        {
            
            System.out.println("nom: "+a.getNom()+"  edad: "+a.getEdad()); 
        }
        
       
   
    }
}
