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
public class Cafetera {

    public double CapacidadMaxima = 1000;
    public double CapacidadActual;

    public Cafetera() {
    }

    public Cafetera(double CapacidadMaxima, double CapacidadActual) {
        this.CapacidadMaxima = CapacidadMaxima;
        this.CapacidadActual = CapacidadActual;
    }

    public void setCapacidadMaxima(double CapacidadMaxima) {
        this.CapacidadMaxima = CapacidadMaxima;
    }

    public void setCapacidadActual(double CapacidadActual) {
        this.CapacidadActual = CapacidadActual;
    }

    public double getCapacidadMaxima() {
        return CapacidadMaxima;
    }

    public double getCapacidadActual() {
        return CapacidadActual;
    }

}
