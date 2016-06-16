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
public class TestCajaPersonas {
    
    public static void main(String[] args) {
         CajaPersona<Persona> caja = new CajaPersona<Persona>();
         CajaPersona<String> error = new CajaPersona<String>();
        caja.pon(new Persona ("luis",46));
        error.pon(new String ("Hola"));
        String  y=error.quita();
        Persona x=caja.quita();
        System.out.println(x.getNom()+"----"+x.getEdad());
    }
    
}
