package Entidad.Servicio;

import Entidad.Armadura;
import java.util.Scanner;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class ServicioArmadura {

    Armadura d1 = new Armadura();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void MostrandoEstado() {
        System.out.println("Hola Tony...");
        MostrarReactor();
        EstadoBateria();
        if (d1.getDBderecha() == 100 && d1.getDBizquierda() == 100 && d1.getDGderecho() == 100 && d1.getDGizquierdo() == 100 && d1.getDCasco() == 100) {
            System.out.println("La dureza de la armadura se encuentra al 100 %");

        } else {
            System.out.println("La Armadura se encuentra con algun tipo de daño...");
        }

    }

    public void EstadoBateria() {
        d1.setBateria(100);
        System.out.println("Estado de la Bateria: " + d1.getBateria() + "watt");
    }

    public void MostrarReactor() {
        System.out.println("Reactor en Watt = "+d1.getReactor());
        System.out.println("Reactor en Joules = " + (int)(d1.getReactor()*100) + " Jules");
        System.out.println("Reactor en Hp = " + (int)(d1.getReactor()*360) + " Hp");
    }
    
    public void Radar(){
        int objetivo;
        int x1=0;
        int y1=0;
        int z1=0;
        int x2=(int)(Math.random()*(10-(-10))+(-10)); //Derecha / Izquierda
        int y2=(int)(Math.random()*(10-(-10))+(-10)); // Delante / Atras
        int z2=(int)(Math.random()*(10-(-10))+(-10)); // Arriba / Abajo
        System.out.println(x2+" , "+y2+" , "+z2);
        if(x2>0){
            
        }
        int distancia;
        System.out.println("D(A,B) = RAIZ de [(x2-x1)² + (y2-y1)² + (z2-z1)²]");
        distancia = (int) Math.sqrt(((int) Math.pow((x2) - (x1), 2)) + ((int) Math.pow((y2) - (y1), 2))+ ((int) Math.pow((z2) - (z1), 2)));
        System.out.println("La Distancia entre el punto A y el punto B, en el plano es: " + distancia);
    
    }
}
