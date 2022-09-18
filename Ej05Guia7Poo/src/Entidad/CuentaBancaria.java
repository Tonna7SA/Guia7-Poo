/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author User
 */
public class CuentaBancaria {

    private int numerocuenta;
    private long dni;
    private double saldoactual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numerocuenta, long dni, double saldoactual) {
        this.numerocuenta = numerocuenta;
        this.dni = dni;
        this.saldoactual = saldoactual;

    }

    public void setNumerocuenta(int numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldoactual(double saldoactual) {
        this.saldoactual = saldoactual;
    }

    public int getNumerocuenta() {
        return numerocuenta;
    }

    public long getDni() {
        return dni;
    }

    public double getSaldoactual() {
        return saldoactual;
    }

}
