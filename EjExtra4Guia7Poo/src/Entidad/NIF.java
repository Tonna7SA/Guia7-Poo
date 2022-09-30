package Entidad;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class NIF {

    public long DNI;
    public String letra;

    public NIF() {
    }

    public NIF(long DNI, String letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public NIF CrearNif() {
        NIF d1 = new NIF();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el numnero de DNI:");
        setDNI(DNI = leer.nextInt());
   
        return d1;
    }

    public void MostarNif() {
        String vector[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int result = (int) (DNI % 23);
        System.out.println("NIF = " + DNI + "-" + Array.get(vector, result));
        System.out.println("");
        
    }
}
