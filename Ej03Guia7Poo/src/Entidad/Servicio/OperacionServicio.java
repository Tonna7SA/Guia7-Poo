/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad.Servicio;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class OperacionServicio {

    Scanner leer = new Scanner(System.in);

    public Operacion IngresoNumeros() {
        Operacion numeros = new Operacion();
        System.out.println("Ingrese el primer numero para operar");
        numeros.setNumero1(leer.nextInt());
        System.out.println("Ingrese el segundo numero para operar");
        numeros.setNumero2(leer.nextInt());
        return numeros;

    }

    public void OperacionSuma(Operacion numeros) {
        System.out.println(numeros.getNumero1() + " + " + numeros.getNumero2() + " = " + (numeros.getNumero1() + numeros.getNumero2()));
    }

    public void OperacionRestar(Operacion numeros) {
        System.out.println(numeros.getNumero1() + " - " + numeros.getNumero2() + " = " + (numeros.getNumero1() - numeros.getNumero2()));
    }

    public void OperacionMultiplicar(Operacion numeros) {
        if (numeros.getNumero1() != 0 && numeros.getNumero2() != 0) {
            System.out.println(numeros.getNumero1() + " * " + numeros.getNumero2() + " = " + (numeros.getNumero1() * numeros.getNumero2()));
        } else{
            System.out.println("Uno de los numeros ingreados es 0, por lo tanto la multiplicacion es igual a 0");
        }
    }

    public void OperacionDividir(Operacion numeros) {
        if (numeros.getNumero1() != 0 && numeros.getNumero2() != 0) {
            if (numeros.getNumero1() > numeros.getNumero2()) {
                System.out.println(numeros.getNumero1() + " / " + numeros.getNumero2() + " = " + (numeros.getNumero1() / numeros.getNumero2()));
            } else {
                System.out.println("Dado que " + numeros.getNumero1() + " es menor que " + numeros.getNumero2() + " procederemos a cambiar su orden");
                System.out.println(numeros.getNumero2() + " / " + numeros.getNumero1() + " = " + (numeros.getNumero2() / numeros.getNumero1()));
            }
        } else{
            System.out.println("Uno de los numeros ingreados es 0, por lo tanto la division es igual a 0");
        }
    }

}
