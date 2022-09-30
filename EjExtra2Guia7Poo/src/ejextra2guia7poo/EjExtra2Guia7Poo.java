package ejextra2guia7poo;

import Entidad.Puntos;
import Entidad.Servicio.ServicioPunto;

/**
 * @author Tonna/SA FR34K
 */
/*Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html*/
public class EjExtra2Guia7Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPunto datos = new ServicioPunto();
        Puntos d1 = datos.GenerarPuntos();
        datos.MostrarPuntos();
        datos.CalcularDistancia();
    }
}
