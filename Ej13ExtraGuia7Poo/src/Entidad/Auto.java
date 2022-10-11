package Entidad;

import java.util.Scanner;

/**
 *
 * @author Tonna/SA FR34K
 */
/*Como atributos tendrá nombre del dueño, fecha vencimiento carnet, color del
vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km),
Crear métodos que permitan:
● Que un usuario cargue su ficha del auto.
● Que el usuario, modifique la titularidad del vehículo.
● Indicar un trayecto recorrido, modificando de este modo los KM del motor
● Crear un método que indique si es necesario realizar Service al vehículo, considerando que
al llegar a los 10.000km corresponde realizarlo.*/
public class Auto {

    public String nombre;
    public String color;
    public String modelo;
    public int km;
    public int dia;
    public int mes;
    public int año;

    public Auto() {
        this.km = 7500;
    }

    public Auto(String nombre, String color, String modelo, int km, int dia, int mes, int año) {
        this.nombre = nombre;
        this.color = color;
        this.modelo = modelo;
        this.km = km;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Auto{" + "nombre=" + nombre + ", color=" + color + ", modelo=" + modelo + ", km=" + km + ", dia=" + dia + ", mes=" + mes + ", a\u00f1o=" + año + '}';
    }
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void CargaFicha() {
        System.out.println("Ingrese nombre del Titular:");
        setNombre(leer.next());
        System.out.println("Ingrese el dia del vencimiento del carnet");
        setDia(leer.nextInt());
        System.out.println("Ingrese el mes del vencimiento del carnet");
        setMes(leer.nextInt());
        System.out.println("Ingrese el año del vencimiento del carnet");
        setAño(leer.nextInt());
        System.out.println("Ingrese el color del auto:");
        setColor(leer.next());
        System.out.println("Ingrese el modelo del auto:");
        setModelo(leer.next());
        System.out.println(toString());
    }
    public void ModificarTitular(){
        System.out.println("Modificacion de Titular");
        System.out.println("Ingrese el nombre del nuevo Titular");
        setNombre(leer.next());
        System.out.println(toString());
    }
    public void Kilometraje(){
        System.out.println("Ingrese la cantidad de km recorridos");
        int recorrido=leer.nextInt();
        setKm(getKm()+recorrido);
        System.out.println(toString());
    }
    public void Servicio(){
        System.out.println("Servicio");
        if(getKm()<=10000){
            System.out.println("Su vehiculo no necesita servicio");
        }else{
            System.out.println("Su vehiculo, necesita servicio");
        }
        System.out.println(toString());
    }
}
