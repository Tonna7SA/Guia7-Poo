/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad.Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ServicioCadena {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cadena datos = new Cadena();

    public Cadena IngresarDatos() {
        System.out.println("Ingrese una palabra o frase");
        datos.setFrase(leer.next());
        datos.setLargo(datos.getFrase().length());
        return datos;

    }

    public void ContarVocales() {
        String palabra = datos.getFrase();
        int vocales = 0;
        palabra = palabra.toLowerCase();
        for (int i = 0; i < datos.getLargo(); i++) {
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u') {
                vocales++;
            }
        }
        System.out.println("Cantidad de vocales: " + vocales);
    }

    public void InvertirFrase() {
        System.out.println("Frase Invertida");
        System.out.println("");
        for (int i = datos.getLargo() - 1; i >= 0; i--) {
            System.out.print((datos.getFrase()).charAt(i));
        }
        System.out.println("");
    }

    public void CaracterRepetido() {
        System.out.println("Ingrese el caracter a buscar en la frase");
        String caracter = leer.next();
        String palabra = datos.getFrase();
        palabra = palabra.toLowerCase();
        int contador = 0;
        for (int i = 0; i < datos.getLargo(); i++) {
            if ((palabra.substring(i, i + 1)).equalsIgnoreCase(caracter)) {
                contador++;
            }
        }
        System.out.println("");
        System.out.println("Cantidad de veces que aparece el caracter (" + caracter + "): " + contador);
    }

    public void UnirFrase() {
        String nuevafrase;
        System.out.println("Ingrese una nueva frase o palabra, para unirla a la anterior: ");
        nuevafrase = leer.next();
        datos.setFrase(datos.getFrase() + " " + nuevafrase);
        datos.setLargo(datos.getFrase().length());
        System.out.println("");
        System.out.println("Nueva frase: " + datos.getFrase());
    }

    public void ReemplazarA() {
        System.out.println("Ingrese un caracter para cambiar por la letra (a)");
        String letra = leer.next();
        String palabra = datos.getFrase();
        for (int j = 0; j < datos.getLargo(); j++) {
            if (palabra.charAt(j) == 'a') {
                palabra = palabra.replace('a', letra.charAt(0));
            }
        }
        System.out.println("");
        System.out.println("Nueva Frase: " + palabra);
    }

    public boolean ContieneLetra() {
        System.out.println("Ingrese el caracter a buscar en la frase");
        boolean respuesta = false;
        String caracter = leer.next();
        String palabra = datos.getFrase();
        palabra = palabra.toLowerCase();
        int contador = 0;
        for (int i = 0; i < datos.getLargo(); i++) {
            if ((palabra.substring(i, i + 1)).equalsIgnoreCase(caracter)) {
                contador++;
                respuesta = true;
                break;
            }
        }
        return respuesta;
    }
}
