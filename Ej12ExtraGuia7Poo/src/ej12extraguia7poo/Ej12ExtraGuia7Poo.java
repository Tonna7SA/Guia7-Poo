package ej12extraguia7poo;

import Entidad.Sopa;

/**
 * @author Tonna/SA FR34K
 */
/*Crear una clase Sopa de letras que contenga un atributo matriz, y otro palabra a encontrar.
Llenar una matriz de 10x10 con palabras de 5 caracteres (todas de forma horizontal, en orden)
inicializándola por defecto con “palabras preestablecidas”.
Crear métodos:
● Que el usuario ingrese una palabra y la busque en la matriz. Deberá retornar en que
posición de la matriz inicia la palabra.
● Imprimir la sopa de letras en pantalla
● Que el usuario pueda reemplazar una palabra especifica de la matriz ya pre -cargada (Es
decir, por ejemplo, que si en posición 0.0 estaba perro, cambiarla a polo). Para realizar esta
gestión, el método recibirá la palabra a buscar y a reemplazar sus datos
● Imprimir la sopa de letras, invertida (es decir, filas por columnas)*/
public class Ej12ExtraGuia7Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sopa d1 = new Sopa();
        d1.LlenadoMatriz();
        d1.ImpresionMatriz();
        d1.BuscarPalabra();
        d1.ReemplazarPalabra();
        System.out.println("Nueva Matriz...");
        d1.ImpresionMatriz();
        System.out.println("Matriz Invertida...");
        d1.ImpresionInvertida();
    }

}
