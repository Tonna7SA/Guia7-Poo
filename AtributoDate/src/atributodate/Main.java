package atributodate;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Llenar el atributo Date con set
//        Scanner scan = new Scanner(System.in);
//        
//        Perro p1 = new Perro(); // Creamos el objeto
//        
//        System.out.println("Ingrese el dia");
//        int dia = scan.nextInt();
//        
//        System.out.println("Ingrese el mes");
//        int mes = scan.nextInt();
//        
//        System.out.println("Ingrese el año");
//        int anio = scan.nextInt();
//        
//        Date fechaNacimiento = new Date(anio, mes, dia); // Creamos el objeto tipo Date
//        
//        p1.setFechaDeNacimiento(fechaNacimiento); // Guardamos la fecha con el set
//        
//        p1.getFechaDeNacimiento(); // Mostramos la fecha con el get 
        //2 Llenar el atributo Date con metodos 
        Scanner scan = new Scanner(System.in);
        
        Perro p1 = new Perro();

        System.out.println("Ingrese el dia");
        int dia = scan.nextInt();

        System.out.println("Ingrese el mes");
        int mes = scan.nextInt();

        System.out.println("Ingrese el año");
        int anio = scan.nextInt();

        Date fechaNacimiento = new Date(); // Creamos el objeto tipo Date

        fechaNacimiento.setDate(dia); // Seteamos el dia
        fechaNacimiento.setMonth(mes); // Seteamos el mes
        fechaNacimiento.setYear(anio); // Seteamos el anio

        p1.llenarFecha(fechaNacimiento);

        //  p1.mostrarFecha();
        System.out.println(p1);

    }
}
/*Scanner sc = new Scanner(System.in);

        System.out.println("Enter your birthdate:");
        System.out.println("Year: ");
        int year = sc.nextInt();
        System.out.println("Month: ");
        int month = sc.nextInt();
        System.out.println("Day: ");
        int day = sc.nextInt();

        LocalDate today = LocalDate.now();
        LocalDate birthdate = LocalDate.of(year, month, day);

        Period p = Period.between(birthdate, today);

        System.out.println("I am " +
Rodrigo Pereyra
21:09
System.out.println("I am " + p.getYears() + " years, " + p.getMonths() + " months, " + p.getDays() + " days old.");       

    }

}
Rodrigo Pereyra
21:11
package age;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
Rodrigo Pereyra
21:25
https://www.youtube.com/watch?v=Ay0ImFPixIY&t=866s
Guillermo Moyano
21:47
Date actual = new Date();
        int diaActual = actual.getDate();
        int mesActual = actual.getMonth()+1;
        int anioActual = actual.getYear()+1900;
        System.out.println(actual);
Date nacimiento = new Date();
        
        System.out.println("Ingrese el año");
        int anio = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese el día");
        int dia = leer.nextInt();
        //Diferencia de años
        int diferencia = anioActual - anio;
if (diferencia != 0) {
            
            if (mesActual <= mes) { 
                        diferencia--;
                    }
                } else {
                    diferencia--;
                }
        System.out.println("============================");
        System.out.println(diferencia);
        System.out.println("============================")
}
*/