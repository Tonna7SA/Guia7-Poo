package Entidad;

import java.util.Scanner;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Tiempo {

    Scanner leer = new Scanner(System.in);
    public int hora;
    public int minutos;
    public int segundos;

    public Tiempo() {
    }

    public Tiempo(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public String toString() {
        return "Tiempo{" + "hora=" + hora + ", minutos=" + minutos + ", segundos=" + segundos + '}';
    }

    public void ImprimirHora() {
        do {
            System.out.println("Ingrese la hora:");
            setHora(leer.nextInt());
        } while (!(getHora() >= 0 && getHora() <= 23));
        do {
            System.out.println("Ingrese los minutos:");
            setMinutos(leer.nextInt());
        } while (!(getMinutos() >= 0 && getMinutos() <= 59));
        do {
            System.out.println("Ingrese la segundos:");
            setSegundos(leer.nextInt());
        } while (!(getSegundos() >= 0 && getSegundos() <= 59));
        System.out.println("La hora ingresada es:");
        if (getHora() < 10) {
            System.out.print("0");
        }
        System.out.print(getHora() + ":");
        if (getMinutos() < 10) {
            System.out.print("0");
        }
        System.out.print(getMinutos() + ":");
        if (getSegundos() < 10) {
            System.out.print("0");
        }
        System.out.println(getSegundos());

    }

    public void CorrerReloj() throws InterruptedException {

        for (int i = 0; i <= 24; i++) {
            if(i==24){
                i=0;
            }
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    Thread.sleep(1000);
                    if (i < 10) {
                        System.out.print("0");
                    }
                    System.out.print(i + ":");
                    if (j < 10) {
                        System.out.print("0");
                    }
                    System.out.print(j + ":");
                    if (k < 10) {
                        System.out.print("0");
                    }
                    System.out.println(k);
                }
            }
        }
    }
}
