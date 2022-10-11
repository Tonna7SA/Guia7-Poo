package ej7extraguia7poo;

import Entidad.Fraccion;
import Entidad.Servicio.ServicioFraccion;

/**
 * @author Tonna/SA FR34K
 */
/*Ejercicio1
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.*/
public class Ej7ExtraGuia7Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioFraccion Datos = new ServicioFraccion();
        Fraccion d1 = Datos.Llenado();
        Datos.Menu();
    }

}
