package ej12guia7poo;

import Entidad.Persona;
import Entidad.Servicio.ServicioPersona;

/**
 * @author Tonna/SA FR34K
 */
/*Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.*/
public class Ej12Guia7Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPersona datos = new ServicioPersona();
        Persona d1 = datos.CrearPersona();
        datos.CalcularEdad();
        if (datos.MenorQue()) {
            System.out.println("La persona, segun la nueva fecha ingresada, tiene menos años");
        } else {
            System.out.println("La persona, segun la nueva fecha ingresada, tiene mas años");
        }
        datos.CrearNuevaPersona();
        datos.MostrarNuevaPersona();
    }
}
