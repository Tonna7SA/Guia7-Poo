/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11guia7poo;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ej11Guia7Poo {

    /**
     * @param args the command line arguments
     */
    /*Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el dia:");
        int dia=leer.nextInt();
        System.out.println("Ingrese el mes:");
        int mes=leer.nextInt();
        System.out.println("Ingrese el año:");
        int ano=leer.nextInt();
        
        Date fecha = new Date(ano-1900,mes-1,dia);
        System.out.println("Fecha de Nacimiento: "+fecha.toLocaleString());
        Date fechaactual = new Date();
        System.out.println("Fecha Actual: "+fechaactual.toLocaleString());
        System.out.println(fechaactual.getYear()-fecha.getYear()+" años");
    }
    
}
