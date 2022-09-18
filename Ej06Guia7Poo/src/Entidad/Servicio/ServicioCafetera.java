/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad.Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ServicioCafetera {

    Scanner leer = new Scanner(System.in);

    public Cafetera LlenarCafetera() {
        Cafetera Datos = new Cafetera();
        Datos.setCapacidadActual(Datos.getCapacidadMaxima());
        return Datos;
    }

    public void ServirTaza(Cafetera Datos) {
        int taza;
        System.out.println("Ingrese la capacidad de la taza a servir:");
        taza = leer.nextInt();
        if (taza < Datos.getCapacidadActual()) {
            System.out.println("La taza ha sido llenada con: " + taza + " ccm³ de cafe.");
            System.out.println("La Cafetera quedo con " + (Datos.getCapacidadActual() - taza) + " ccm³ de cafe.");
        } else {
            System.out.println("La taza ha sido llenada solo con: " + Datos.getCapacidadActual() + " ccm³ de cafe.");
        }
    }

    public void VaciarCafetera(Cafetera Datos) {
        Datos.setCapacidadActual(0);
        System.out.println("Se procedio a vaciar la Cafetera");
    }

    public void RellenarCafetera(Cafetera Datos) {
        System.out.println("Ingrese la cantidad de cafe, a introducir en la Cafetera.");
        Datos.setCapacidadActual(leer.nextDouble());
        if (Datos.getCapacidadActual() > Datos.getCapacidadMaxima()) {
            System.out.println("Imposible, solo se llenara con " + Datos.getCapacidadMaxima() + " ccm³ de cafe, ya que es su capacidad maxima...");
        } else {
            System.out.println("La Cafetera contiene ahora " + Datos.getCapacidadActual() + " ccm³ de cafe");
        }
    }
}
