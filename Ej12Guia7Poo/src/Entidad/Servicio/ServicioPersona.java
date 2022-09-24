package Entidad.Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class ServicioPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona d1 = new Persona();

    public Persona CrearPersona() {
        System.out.println("Ingrese el nombre de la persona");
        d1.setNombre(leer.next());
        System.out.println("Ingrese la fecha de Nacimiento de la persona:");
        System.out.println("Ingrese el dia:");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes:");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año:");
        int ano = leer.nextInt();
        Date cumple = new Date(ano - 1900, mes - 1, dia);
        d1.setFechanacimiento(cumple);
        return d1;
    }

    public void CalcularEdad() {
        Date hoy = new Date();
        int edad = hoy.getYear() - d1.getFechanacimiento().getYear();
        System.out.println(d1.getNombre() + " tiene: " + edad + " años.");
    }

    public boolean MenorQue() {
        System.out.println("Ingrese una nueva fecha para comparar");
        boolean respuesta = false;
        System.out.println("Ingrese el dia:");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes:");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año:");
        int ano = leer.nextInt();
        Date nuevafecha = new Date(ano - 1900, mes - 1, dia);
        d1.setFechanacimiento1(nuevafecha);
        if (nuevafecha.after(d1.getFechanacimiento())) {
            respuesta = true;
        }
        return respuesta;
    }

    public Persona CrearNuevaPersona() {
        System.out.println("Ingrese el nombre de la persona");
        d1.setNombre1(leer.next());
        return d1;
    }

    public void MostrarNuevaPersona() {
        System.out.println("Nombre nueva persona: " + d1.getNombre1());
        System.out.println("Fecha de nacimiento: " + d1.getFechanacimiento1().toLocaleString());
    }
}
