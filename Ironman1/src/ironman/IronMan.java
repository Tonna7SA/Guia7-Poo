package ironman;

import Sevicio.ArmaduraServicio;
import java.util.Scanner;

public class IronMan {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArmaduraServicio as = new ArmaduraServicio();
        
        as.estado();
        //as.menu();
        
        int accion=0;
        do{
            System.out.println("Menú acciones");
            System.out.println("1) Caminar");
            System.out.println("2) Correr");
            System.out.println("3) Volar");
            System.out.println("4) Propulsar");
            System.out.println("5) Usar guantes");
            System.out.println("6) Radar");
            System.out.println("7) Destruyendo enemigo");
            System.out.println("8) Acción evasiva");
            System.out.println("9) Estado de la batería");
            System.out.println("10) Información del reactor");
            accion = leer.nextInt();
             
            switch (accion){
                case 1://caminar
                    as.sufriendoDaniosBotasDerecha();
                    as.sufriendoDaniosBotasIzquierda();
                    as.reparandoDaniosBotasDerecha();
                    as.reparandoDaniosBotasIzquierdo();
                    as.revisarDispositivo();
                    as.gastarEnergiaCaminar();
                    break;
                case 2://correr
                    as.sufriendoDaniosBotasDerecha();
                    as.sufriendoDaniosBotasIzquierda();
                    as.reparandoDaniosBotasDerecha();
                    as.reparandoDaniosBotasIzquierdo();
                    as.revisarDispositivo();
                    as.gastarEnergiaCorrer();
                    break;
                case 3://volar
                    as.sufriendoDaniosBotasDerecha();
                    as.sufriendoDaniosBotasIzquierda();
                    as.reparandoDaniosBotasDerecha();
                    as.reparandoDaniosBotasIzquierdo();
                    as.sufriendoDaniosGuantesDerecho();
                    as.sufriendoDaniosGuantesIzquierdo();
                    as.reparandoDaniosGuantesDerecho();
                    as.reparandoDaniosGuantesIzquierdo();
                    as.revisarDispositivo();
                    as.gasterEnergiaVolar();
                    break;
                case 4://propulsar
                    as.sufriendoDaniosBotasDerecha();
                    as.sufriendoDaniosBotasIzquierda();
                    as.reparandoDaniosBotasDerecha();
                    as.reparandoDaniosBotasIzquierdo();
                    as.revisarDispositivo();
                    as.gastarEnergiaPropulsar();
                    break;
                case 5://Usar guantes
                    as.sufriendoDaniosGuantesDerecho();
                    as.sufriendoDaniosGuantesIzquierdo();
                    as.reparandoDaniosGuantesDerecho();
                    as.reparandoDaniosGuantesIzquierdo();
                    as.revisarDispositivo();
                    as.guantesDisparar();
                    break;
                case 6://radar
                    as.radar();
                    break;
                case 7://Destruyendo Enemigo
                    as.destruyendoEnemigo();
                    break;
                case 8://Estado general
                    as.estado();
                case 9://Estado de la batería
                    as.estadoBateria();
                case 10://Información del reactor
                    as.infoReactor();
                default:
            }
        }while (accion !=11);
    }

}
