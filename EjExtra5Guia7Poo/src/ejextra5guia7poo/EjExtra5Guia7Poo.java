package ejextra5guia7poo;

import Entidad.Meses;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Tonna/SA FR34K
 */
/*Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto
de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un
ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!*/
public class EjExtra5Guia7Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Meses vector[] = {new Meses("enero"), new Meses("febrero"), new Meses("marzo"), new Meses("abril"), new Meses("mayo"), new Meses("junio"), new Meses("julio"), new Meses("agosto"), new Meses("septiembre"), new Meses("octubre"), new Meses("noviembre"), new Meses("diciembre")};
        String mes = vector[9].getMeses();
        System.out.println("Adivine el mes secreto");
        System.out.println("Introduzaca el nombre en minusculas:");
        String resp = leer.next();
        do {
            if (!mes.equals(resp)) {
                System.out.println("Mes incorrecto");
                System.out.println("proba otra vez");
                resp = leer.next();
            }
        } while (!mes.equals(resp));
        System.out.println("Correcto!!!");
    }
}
