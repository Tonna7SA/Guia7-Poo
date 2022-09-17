/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej02guia7poo;

import Entidad.Circunferencia;
import Entidad.Servicio.ServiciosCircunferencia;

/**
 *
 * @author User
 */
public class Ej02Guia7Poo {

    /**
     * @param args the command line arguments
     */
    /*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = Pi * Radio 2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 * Pi * Radio).*/
    
    public static void main(String[] args) {
        ServiciosCircunferencia circulo = new ServiciosCircunferencia();
        Circunferencia c1 = circulo.CrearCirculo();
        circulo.AreaCirculo(c1);
        circulo.PerimetroCirculo(c1);
    }

   
}
