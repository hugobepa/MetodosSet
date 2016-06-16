/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosset.Genericas;

/**
 *
 * @author hugo
 */
public class CajaMetodo 
{
    public static void main(String[] args) {
         Caja<Integer> caja = new Caja<Integer>();
        Caja.ponEncaja(new Integer(52), caja);
        
        Integer x=caja.quita();
        System.out.println(x);
    }
}
