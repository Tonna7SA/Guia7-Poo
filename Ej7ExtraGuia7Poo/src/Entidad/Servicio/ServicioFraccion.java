package Entidad.Servicio;

import Entidad.Fraccion;
import java.util.Scanner;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class ServicioFraccion {

    Scanner leer = new Scanner(System.in);
    Fraccion d1 = new Fraccion();
    int num1;
    int num2;

    public void Sumar() {

        num1 = (d1.getNumerador1() * d1.getDenominador2()) + (d1.getDenominador1() * d1.getNumerador2());
        num2 = d1.getDenominador1() * d1.getDenominador2();
        Simplificar();
        System.out.print("(" + d1.getNumerador1() + "/" + d1.getDenominador1() + ")+(" + d1.getNumerador2() + "/" + d1.getDenominador2() + ")= ");
        if (num1==num2) {
            System.out.println(num1);
        }else{
            System.out.println(num1+"/"+num2);
        }
    }

    public void Restar() {
        num1 = (d1.getNumerador1() * d1.getDenominador2()) - (d1.getDenominador1() * d1.getNumerador2());
        num2 = d1.getDenominador1() * d1.getDenominador2();
        Simplificar();
        System.out.print("(" + d1.getNumerador1() + "/" + d1.getDenominador1() + ")-(" + d1.getNumerador2() + "/" + d1.getDenominador2() + ")= ");
if (num1==num2) {
            System.out.println(num1);
        }else{
            System.out.println(num1+"/"+num2);
        }
    }

    public void Multiplicar() {
        num1 = d1.getNumerador1() * d1.getNumerador2();
        num2 = d1.getDenominador1() * d1.getDenominador2();
        Simplificar();
        System.out.print("(" + d1.getNumerador1() + "/" + d1.getDenominador1() + ")*(" + d1.getNumerador2() + "/" + d1.getDenominador2() + ")= ");
if (num1==num2) {
            System.out.println(num1);
        }else{
            System.out.println(num1+"/"+num2);
        }
    }

    public void Dividir() {
        num1 = d1.getNumerador1() * d1.getDenominador2();
        num2 = d1.getDenominador1() * d1.getNumerador2();
        Simplificar();
        System.out.print("(" + d1.getNumerador1() + "/" + d1.getDenominador1() + ")/(" + d1.getNumerador2() + "/" + d1.getDenominador2() + ")= ");
if (num1==num2) {
            System.out.println(num1);
        }else{
            System.out.println(num1+"/"+num2);
        }
    }

    public Fraccion Llenado() {
        System.out.println("Ingrese el numerador de la 1° Fraccion");
        d1.setNumerador1(leer.nextInt());
        System.out.println("Ingrese el denominador de la 1° Fraccion");
        d1.setDenominador1(leer.nextInt());
        System.out.println("Ingrese el numerador de la 2° Fraccion");
        d1.setNumerador2(leer.nextInt());
        System.out.println("Ingrese el denominador de la 2° Fraccion");
        d1.setDenominador2(leer.nextInt());
        return d1;
    }

    public void Menu() {
        int opcion;
        do {
            System.out.println("Menu de Operaciones entre Fracciones");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    Sumar();
                    break;
                case 2:
                    Restar();
                    break;
                case 3:
                    Multiplicar();
                    break;
                case 4:
                    Dividir();
                    break;
                case 5:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 5));
    }
     public int Mcd() {
        int numerador = Math.abs(num1); 
        int denominador = Math.abs(num2); 
        if (denominador == 0) {
            return numerador;
        }
        int aux;
        while (denominador != 0) {
            aux = numerador % denominador;
            numerador = denominador;
            denominador = aux;
        }
        return numerador;
    }

    public void Simplificar() {
        int n = Mcd();
        num1 = num1 / n;
        num2 = num2 / n;
    }

}
