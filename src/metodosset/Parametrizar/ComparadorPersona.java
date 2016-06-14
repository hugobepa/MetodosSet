/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosset.Parametrizar;

import java.util.Comparator;

/**
 *http://personales.unican.es/sanchezbp/teaching/faqs/genericsJava.html
 * http://acercadejava.blogspot.com.es/2009/01/tipos-genericos-o-parametrizados-en.html
 * http://artachone.blogspot.com.es/2013/06/java-genericos.html
 * @author hugo
 */
public class ComparadorPersona  implements Comparator<Persona>{

    @Override
    public int compare(Persona p1, Persona p2) 
    {
       String n1=p1.getNom();
       String n2=p2.getNom();
       
       return n1.toLowerCase().compareTo(n2.toLowerCase());
    }
    
}
