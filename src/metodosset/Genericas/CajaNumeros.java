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
public class CajaNumeros<T extends Number> {
    private T dato;
    public T quita(){return dato;}
    public void pon (T d){dato=d;}
    
}
