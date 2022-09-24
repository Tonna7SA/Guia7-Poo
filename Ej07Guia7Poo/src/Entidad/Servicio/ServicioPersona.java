/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad.Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author User
 */
/*• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.*/
public class ServicioPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona p1 = new Persona();

    public Persona CrearPersona() {
        System.out.println("Ingrese el Nombre de la persona:");
        p1.setNombre(leer.next());
        System.out.println("Ingrese la edad de " + p1.getNombre() + ":");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese el genero de " + p1.getNombre() + ":");
        System.out.println("(H)- Hombre, (M)- Mujer, (O)- Otro");
        p1.setSexo(leer.next());
        while (!(p1.getSexo().equalsIgnoreCase("H") || p1.getSexo().equalsIgnoreCase("M") || p1.getSexo().equalsIgnoreCase("O"))) {
            System.out.println("Solo ingrese (H, M o O)");
            p1.setSexo(leer.next().toUpperCase());
        }
        System.out.println("Ingrese la Altura de " + p1.getNombre() + ":");
        p1.setAltura(leer.nextDouble());
        System.out.println("Ingrese el Peso de " + p1.getNombre() + ":");
        p1.setPeso(leer.nextDouble());
        return p1;
    }

    public int CalcularImc() {
        int indice = 0;
        if (p1.getPeso() / Math.pow(p1.getAltura(), 2) < 20) {
            indice = -1;
        }
        if (p1.getPeso() / Math.pow(p1.getAltura(), 2) > 25) {
            indice = 1;
        }
        if (p1.getPeso() / Math.pow(p1.getAltura(), 2) >= 20 && p1.getPeso() / Math.pow(p1.getAltura(), 2) <= 25) {
            indice = 0;
        }
        return indice;
    }

    public boolean EsMayorEdad() {
        boolean respuesta;
        if (p1.getEdad() > 18) {
            respuesta = true;
        } else {
            respuesta = false;
        }
        return respuesta;
    }
}
