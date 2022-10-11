package ej13extraguia7poo;

import Entidad.Auto;

/**
 * @author Tonna/SA FR34K
 */
/*Ejercicio 7
Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento carnet, color del
vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km),
Crear métodos que permitan:
● Que un usuario cargue su ficha del auto.
● Que el usuario, modifique la titularidad del vehículo.
● Indicar un trayecto recorrido, modificando de este modo los KM del motor
● Crear un método que indique si es necesario realizar Service al vehículo, considerando que
al llegar a los 10.000km corresponde realizarlo.*/
public class Ej13ExtraGuia7Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto d1 = new Auto();
        d1.CargaFicha();
        d1.ModificarTitular();
        d1.Kilometraje();
        d1.Servicio();
    }

}
