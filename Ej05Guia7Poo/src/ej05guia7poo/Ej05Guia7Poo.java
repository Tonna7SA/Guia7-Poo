/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej05guia7poo;

import Entidad.CuentaBancaria;
import Entidad.Servicio.ServicioCuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ej05Guia7Poo {

    /**
     * @param args the command line arguments
     */
    /*Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioCuentaBancaria informe = new ServicioCuentaBancaria();
        CuentaBancaria n = informe.IngresoDatos();
        int numero;
        do {
            System.out.println("");
            System.out.println("Menu de Opciones");
            System.out.println("");
            System.out.println("1 - Depositar");
            System.out.println("2 - Extraccion");
            System.out.println("3 - Extraccion Rapida");
            System.out.println("4 - Informe Cuenta");
            System.out.println("5 - Salir");
            System.out.println("");
            System.out.println("Ingrese su opcion:");
            numero = leer.nextInt();
            switch (numero) {
                case 1:
                    System.out.println("");
                    informe.IngresoDeposito(n);
                    continue;
                case 2:
                    System.out.println("");
                    informe.RetiroImporte(n);
                    continue;
                case 3:
                    System.out.println("");
                    informe.ExtraccionRapida(n);
                    continue;
                case 4:
                    System.out.println("");
                    informe.ImpresionDatos(n);
                    continue;
                case 5:
                    System.out.println("");
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("");
                    System.out.println("La opcion ingresada no es valida...");
                    continue;
            }
        } while (numero != 5);
    }
}
