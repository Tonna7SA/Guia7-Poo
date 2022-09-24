/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author User
 */
public class Matematica {
    public int numero1;
    public int numero2;

    public Matematica() {
    }

    public Matematica(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "Matematica{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
    public void DevolverMayor(Matematica m1){
        int numeromayor=Math.max(m1.getNumero1(),m1.getNumero2());
        System.out.println("El numero mayor de los ingresados es: "+numeromayor);
    }
    public void CalcularPotencia(Matematica m1){
        int numeromayor=Math.max(m1.getNumero1(),m1.getNumero2());
        int numeromenor=Math.min(numero1, numero2);
        int potencia=(int)(Math.pow(numeromayor, numeromenor));
        System.out.println("La potencia de "+numeromayor+" elevado a "+numeromenor+" es: "+potencia);
    }
    public void CalcularRaiz(Matematica m1){
        int numeromayor=Math.max(m1.getNumero1(),m1.getNumero2());
        int numeromenor=Math.min(numero1, numero2);
        numeromenor=Math.abs(numeromenor);
        int raiz=(int)Math.sqrt(numeromenor);
        System.out.println("La raiz cuadrada de "+numeromenor+" es: "+raiz);
    }
}
