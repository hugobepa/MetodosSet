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
public class TestCajaPersona
{
    public static void main(String[] args)
    {
        Caja<Persona> caja = new Caja<Persona>();
        caja.pon(new Persona ("luis",46));
        Persona x=caja.quita();
        System.out.println(x.getNom()+"----"+x.getEdad());
    }
            
}
