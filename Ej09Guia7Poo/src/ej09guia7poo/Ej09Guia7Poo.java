/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej09guia7poo;

import Entidad.Matematica;

/**
 *
 * @author User
 */
public class Ej09Guia7Poo {

    /**
     * @param args the command line arguments
     */
    /*Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.*/
    public static void main(String[] args) {
        Matematica m1 = new Matematica();
        m1.setNumero1((int) (Math.random() * 100));
        System.out.println("Numero 1 - Aleatorio: " + m1.getNumero1());
        m1.setNumero2((int) (Math.random() * 100));
        System.out.println("Numero 2 - Aleatorio: " + m1.getNumero2());
        m1.DevolverMayor(m1);
        m1.CalcularPotencia(m1);
        m1.CalcularRaiz(m1);
        
    }

}
