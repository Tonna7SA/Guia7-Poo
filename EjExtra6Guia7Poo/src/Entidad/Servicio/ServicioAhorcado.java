package Entidad.Servicio;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Tonna/SA FR34K
 */
/*String formato = String.format("%08d", d1.getDni());*/
public class ServicioAhorcado {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ahorcado d1 = new Ahorcado();

    public Ahorcado CrearJuego() {
        System.out.println("Ingrese la palabra a adivinar:");
        d1.setPalabra(leer.next());
        System.out.println("Ingrese la cantidad de jugadas maximas:");
        d1.setMaximojugadas(leer.nextInt());
        String vector[] = new String[d1.getPalabra().length()];
        for (int i = 0; i < d1.getPalabra().length(); i++) {
            vector[i] = d1.getPalabra().substring(i, i + 1);
            d1.setVector(vector);
        }
        String vector1[] = new String[d1.getPalabra().length()];
        Arrays.fill(vector1, "* ");
        System.out.println("Palabra a buscar, tantos asteriscos, tantas letras...");
        for (int i = 0; i < d1.getPalabra().length(); i++) {
            System.out.print(vector1[i] + " ");
        }
        System.out.println("");
        String palabra1 = "";
        int terminar = 0;
        do {

            System.out.println("ingrese letra a buscar");
            String letra = leer.next();
            int bandera = 0;
            for (int i = 0; i < d1.getPalabra().length(); i++) {
                if (vector[i].equalsIgnoreCase(letra)) {
                    vector1[i] = letra;
                    bandera = 1;
                }
            }
            if (bandera == 0) {
                System.out.println("Esa letra no esta...");
                System.out.println("Te quedan " + (d1.getMaximojugadas() - 1) + " intentos...");
                d1.setMaximojugadas(d1.getMaximojugadas() - 1);
            } else {
                System.out.println("Letra encontrada...");
            }
            for (int i = 0; i < d1.getPalabra().length(); i++) {
                System.out.print(vector1[i] + " ");
            }
            System.out.println("");
            System.out.println("Desea arriesgar una palabra: (S/N)");
            String arriesgar = leer.next();
            if (arriesgar.equalsIgnoreCase("s")) {
                System.out.println("Ingrese la palabra:");
                palabra1 = leer.next();
                if (d1.getPalabra().equalsIgnoreCase(palabra1)) {
                    System.out.println("Palabra encontrada, muy bien");
                    terminar = 1;
                    break;
                } else {
                    System.out.println("Esa no es, segui buscando la palabra...");
                }
            }

        } while (!(d1.getMaximojugadas() == 0) || d1.getPalabra().equalsIgnoreCase(palabra1));
        if (terminar == 0) {
            System.out.println("Has sido Ahorcado...");
        } else {
            System.out.println("Has ganado el juego...");
        }

        d1.setVector(vector);
        System.out.println(" ");
        return d1;

    }
}
