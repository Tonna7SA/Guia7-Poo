package ej8extraguia7poo;

import Entidad.Tiempo;

/**
 * @author Tonna/SA FR34K
 */
/*Ejercicio 2
Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
animas a simular el paso del tiempo en consola??????*/
public class Ej8ExtraGuia7Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException{
        
        Tiempo d1 = new Tiempo();
        d1.ImprimirHora();
        System.out.println("");
        System.out.println("Reloj Digital");
        d1.CorrerReloj();
    }
}
