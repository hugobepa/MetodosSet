/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosset.Parametrizar;

/**
 *
 * @author hugo
 */
public class paramPersona<T extends Persona>
{
   private T t;
   Persona p;
   
   
   
   
   public paramPersona(){}
   
   public void pon (T tt)
   {
       t=tt;
   }
   
   public T quitar()
   {
       return t;
   }

    @Override
    public String toString() {
        return "paramPersona{" + "t=" + t + ", p=" + p + '}';
    }
   
   
}
