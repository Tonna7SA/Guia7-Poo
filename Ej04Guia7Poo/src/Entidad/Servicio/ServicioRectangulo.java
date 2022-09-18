/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad.Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ServicioRectangulo {

    Scanner leer = new Scanner(System.in);

    public Rectangulo IngresoVariables() {
        Rectangulo variables = new Rectangulo();
        System.out.println("Ingrese la base del Rectangulo");
        variables.setBase(leer.nextInt());
        System.out.println("Ingrese la altura del Rectangulo");
        variables.setAltura(leer.nextInt());
        return variables;
    }

    public void CalculoArea(Rectangulo variables) {
        System.out.println("");
        System.out.println("El Area del rectangulo es: " + variables.getBase() * variables.getAltura() + " mts²");
    }

    public void CalculoPerimetro(Rectangulo variables) {
        System.out.println("");
        System.out.println("El Perimetro del Rectangulo es: " + (variables.getBase() + variables.getAltura()) * 2 + " mts.");
    }

    public void ImpresionRectangulo(Rectangulo variables) {
        System.out.println("");
        for (int i = 0; i < variables.getAltura(); i++) {
            for (int j = 0; j < variables.getBase(); j++) {
                if (i == 0 || i == variables.getAltura() - 1 || j==0 || j==variables.getBase() - 1) {
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}
