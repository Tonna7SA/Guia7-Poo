/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej07guia7poo;

import Entidad.Persona;
import Entidad.Servicio.ServicioPersona;

/**
 *
 * @author User
 */
public class Ej07Guia7Poo {

    /**
     * @param args the command line arguments
     */
    /*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
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
un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
     */
    public static void main(String[] args) {
        int peso[] = new int[4];
        boolean edad[] = new boolean[4];
        ServicioPersona Datos = new ServicioPersona();
        Persona Personas[] = new Persona[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("");
            System.out.println("Persona N° " + (i + 1));
            Personas[i] = Datos.CrearPersona();
            System.out.println("");
            peso[i] = Datos.CalcularImc();
            if (Datos.CalcularImc() == 0) {
                System.out.println("IMC Ideal");
            }
            if (Datos.CalcularImc() == 1) {
                System.out.println("IMC Sobrepeso");
            }
            if (Datos.CalcularImc() == -1) {
                System.out.println("IMC Desnutrido");
            }
            if (Datos.EsMayorEdad()) {
                edad[i] = Datos.EsMayorEdad();
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("Es menor de edad");
            }
        }
        double a = 0, b = 0, c = 0;
        for (int i = 0; i < 4; i++) {
            if (peso[i] == 0) {
                a++;
            }
            if (peso[i] == 1) {
                b++;
            }
            if (peso[i] == -1) {
                c++;
            }
        }
        System.out.println("");
        System.out.println("Personas con IMC Ideal: " + (a / 4 * 100) + "%");
        System.out.println("Personas con IMC Sobrepeso: " + (b / 4 * 100) + "%");
        System.out.println("Personas con IMC Desnutricion: " + (c / 4 * 100) + "%");

        double d = 0, e = 0;
        for (int j = 0; j < 4; j++) {
            if (edad[j] == true) {
                d++;
            } else {
                e++;
            }
        }
        System.out.println("");
        System.out.println("Personas Mayores de edad: " + (d / 4 * 100) + "%");
        System.out.println("Personas Menores de edad: " + (e / 4 * 100) + "%");
        System.out.println(Personas[0]);
    }
    
}
/* int peso[] = new int[4];
        boolean edad[] = new boolean[4];
        ServicioPersona Datos = new ServicioPersona();
        Persona persona1 = Datos.CrearPersona();
        peso[0] = Datos.CalcularImc();
        if (Datos.CalcularImc() == 0) {
            System.out.println("IMC Ideal");
        }
        if (Datos.CalcularImc() == 1) {
            System.out.println("IMC Sobrepeso");
        }
        if (Datos.CalcularImc() == -1) {
            System.out.println("IMC Desnutrido");
        }
        if (Datos.EsMayorEdad()) {
            edad[0] = Datos.EsMayorEdad();
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        System.out.println("");
        Persona persona2 = Datos.CrearPersona();
        peso[1] = Datos.CalcularImc();
        if (Datos.CalcularImc() == 0) {
            System.out.println("IMC Ideal");
        }
        if (Datos.CalcularImc() == 1) {
            System.out.println("IMC Sobrepeso");
        }
        if (Datos.CalcularImc() == -1) {
            System.out.println("IMC Desnutrido");
        }
        if (Datos.EsMayorEdad()) {
            edad[1] = Datos.EsMayorEdad();
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        System.out.println("");
        Persona persona3 = Datos.CrearPersona();
        peso[2] = Datos.CalcularImc();
        if (Datos.CalcularImc() == 0) {
            System.out.println("IMC Ideal");
        }
        if (Datos.CalcularImc() == 1) {
            System.out.println("IMC Sobrepeso");
        }
        if (Datos.CalcularImc() == -1) {
            System.out.println("IMC Desnutrido");
        }
        if (Datos.EsMayorEdad()) {
            edad[2] = Datos.EsMayorEdad();
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        System.out.println("");
        Persona persona4 = Datos.CrearPersona();
        peso[3] = Datos.CalcularImc();
        if (Datos.CalcularImc() == 0) {
            System.out.println("IMC Ideal");
        }
        if (Datos.CalcularImc() == 1) {
            System.out.println("IMC Sobrepeso");
        }
        if (Datos.CalcularImc() == -1) {
            System.out.println("IMC Desnutrido");
        }
        if (Datos.EsMayorEdad()) {
            edad[3] = Datos.EsMayorEdad();
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < 4; i++) {
            if (peso[i] == 0) {
                a++;
            }
            if (peso[i] == 1) {
                b++;
            }
            if (peso[i] == -1) {
                c++;
            }
        }
        System.out.println("");
        System.out.println("Personas con IMC Ideal: " + a);
        System.out.println("Personas con IMC Sobrepeso: " + b);
        System.out.println("Personas con IMC Desnutricion: " + c);

        int d = 0, e = 0;
        for (int j = 0; j < 4; j++) {
            if (edad[j] == true) {
                d++;
            } else {
                e++;
            }
        }
        System.out.println("");
        System.out.println("Personas Mayores de edad: " + d);
        System.out.println("Personas Menores de edad: " + e);
    }

}*/
