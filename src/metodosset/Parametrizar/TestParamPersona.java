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
public class TestParamPersona implements  IFactory<Persona>  {  
  
  public Persona newObject() {  
      
    return new Persona();   
  } // newObject  
  
} // FactoryPerson  
