/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploguia7poo;

import Entidad.Persona;

/**
 *
 * @author User
 */
public class EjemploGuia7Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Persona primerapersona = new Persona(); //Usa el constructor vacio
    Persona segundapersona = new Persona("Gonzalo"); //Usa el constructor por parametro
    Persona primeraedad = new Persona();
    
    primeraedad.edad=12;
       
    primerapersona.setNombre("Gonzalito");
    
        System.out.println(primerapersona.getNombre());
        
        
    }

   
}
