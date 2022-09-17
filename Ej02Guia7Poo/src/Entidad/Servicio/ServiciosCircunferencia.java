/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad.Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ServiciosCircunferencia {
    Scanner leer = new Scanner(System.in);
    
    public Circunferencia CrearCirculo(){
        Circunferencia c1 = new Circunferencia();
        System.out.println("Ingrese el Radio de la Circunferencia:");
        c1.setRadio(leer.nextDouble());
        return c1;
    }
    public void AreaCirculo(Circunferencia c1){
       System.out.println("El Area del Circulo es: "+Math.pow(c1.getRadio(),2)*3.14);
        
    }
    public void PerimetroCirculo(Circunferencia c1){
        System.out.println("El Perimetro del circulo es: "+(2*3.14*c1.getRadio()));
    }
}


