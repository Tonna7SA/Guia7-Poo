/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad.Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ServicioCuentaBancaria {

    Scanner leer = new Scanner(System.in);

    public CuentaBancaria IngresoDatos() {
        CuentaBancaria Datos = new CuentaBancaria();
        System.out.println("Ingrese su N° de Cuenta Bancaria:");
        Datos.setNumerocuenta(leer.nextInt());
        System.out.println("Ingrese su DNI");
        Datos.setDni(leer.nextLong());
        System.out.println("Ingrese su Saldo Actual:");
        Datos.setSaldoactual(leer.nextDouble());
        return Datos;
    }

    public void IngresoDeposito(CuentaBancaria Datos) {
        System.out.println("Ingrese el importe a Depositar: ");
        double importe = leer.nextDouble();
        Datos.setSaldoactual(Datos.getSaldoactual() + importe);

    }

    public void RetiroImporte(CuentaBancaria Datos) {
        double retiro;
        System.out.println("Ingrese el Importe que desea retirar:");
        retiro = leer.nextDouble();
        if (retiro > Datos.getSaldoactual()) {
            System.out.println("El importe a retirar es mayor a su Saldo Actual");
        } else {
            Datos.setSaldoactual(Datos.getSaldoactual() - retiro);
        }
    }

    public void ExtraccionRapida(CuentaBancaria Datos) {
        double importeextraccion;
        double extraccion;
        extraccion = Datos.getSaldoactual() * 0.20;
        
        System.out.println("Ingrese el importe de su extraccion rapida:");
        importeextraccion = leer.nextDouble();
        if(importeextraccion!=0){
        if (importeextraccion > extraccion) {
            System.out.println("Imposible, su extraccion supera el 20% de su Saldo Actual...");
        } else {
            System.out.println("Realizando Extraccion Rapida");
            Datos.setSaldoactual(Datos.getSaldoactual() - importeextraccion);
        }
        }
    }

    public void ConsultaSaldo(CuentaBancaria Datos) {
        System.out.println("Su saldo actual, en su cuenta es de " + Datos.getSaldoactual());
    }

    public void ImpresionDatos(CuentaBancaria Datos) {
        System.out.println("Numero de Cuenta: " + Datos.getNumerocuenta());
        System.out.println("DNI: " + Datos.getDni());
        System.out.println("Saldo Actual: " + Datos.getSaldoactual());
    }
}
