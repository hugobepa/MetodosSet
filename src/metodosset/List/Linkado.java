/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosset.List;

/**
 *
 * @author hugo
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkado {
    
    
    public static void main( String[] args )
    {
     // A. Initiate
        List<Persona> arrayList = new ArrayList<Persona>();
        List<Persona> linkedList = new LinkedList<Persona>();
 
       Persona p= new Persona("juan",10);
        arrayList.add(p);
        linkedList.add(p);
         p= new Persona("paco",15);
        arrayList.add(p);
        linkedList.add(p);
        p= new Persona("mario",5);
        arrayList.add(p);
        linkedList.add(p);
        p= new Persona("alex",20);
        arrayList.add(p);
        linkedList.add(p);
 
        System.out.println(arrayList.size());
        System.out.println(linkedList.size());
        // --> print
        System.out.println("--------- Print All -------------");
 
       
        System.out.println("ArrayList");
        for (Iterator<Persona> it = arrayList.iterator(); it.hasNext();) {
             
            p = it.next();
            System.out.println("nom: "+p.getNom()+"  edad: "+p.getEdad());
        }
        
        System.out.println("LinkedList");
        for (Iterator<Persona> it = linkedList.iterator(); it.hasNext();) {
             
            p = it.next();
            System.out.println("nom: "+p.getNom()+"  edad: "+p.getEdad());
        }
    }

   

    
}
