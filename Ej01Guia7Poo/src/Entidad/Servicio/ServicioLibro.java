/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad.Servicio;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ServicioLibro {

    Scanner leer = new Scanner(System.in);

    public Libro CrearLibro() {
        Libro l1 = new Libro();

        System.out.println("Ingrese el numero de ISBN del libro:");
        l1.setISBN(leer.nextInt());
        System.out.println("Ingrese el nombre del Libro:");
        l1.setLibro(leer.next());
        System.out.println("Ingrese el nombre del autor del Libro:");
        l1.setAutor(leer.next());
        System.out.println("Ingrese el numero de pagina del Libro");
        l1.setNumeroPagina(leer.nextInt());

        return l1;
    }

}
