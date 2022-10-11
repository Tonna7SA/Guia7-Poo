package proyectoazar;

import java.util.Arrays;


/**
 * @author Tonna/SA FR34K
 */
/**/
public class ProyectoAzar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int vector[] = new int[6];
        int vector1[] = new int[2];
        int vector2[] = new int[6];
        int vector3[] = new int[6];

        for (int i = 0; i < vector.length; i++) {
            boolean encontrado = false;
            int ale = (int) (Math.random() * 41) + 1;
            for (int j = 0; j < i; j++) {
                if (vector[j] == ale) {
                    encontrado = true;
                }
            }
            if (!encontrado) {
                vector[i] = ale;
            } else {
                i--;
            }
        }
        for (int i = 0; i < vector1.length; i++) {
            boolean encontrado1 = false;
            int ale1 = (int) (Math.random() * 10);
            for (int j = 0; j < i; j++) {
                if (vector1[j] == ale1) {
                    encontrado1 = true;
                }
            }
            if (!encontrado1) {
                vector1[i] = ale1;
            } else {
                i--;
            }
        }
        Arrays.sort(vector);
        Arrays.sort(vector1);
        System.out.println("Loto");
        System.out.print("Numeros: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
        System.out.print("JackPot: ");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print(vector1[i] + " ");
        }
        System.out.println("");

        for (int i = 0;i < vector2.length;i++) {
            boolean encontrado2 = false;
            int ale2 = (int) (Math.random() * 45) + 1;
            for (int j = 0; j < i; j++) {
                if (vector2[j] == ale2) {
                    encontrado2 = true;
                }
            }
            if (!encontrado2) {
                vector2[i] = ale2;
            } else {
                i--;
            }
        }
        for (int i = 0;i < vector3.length;i++) {
            boolean encontrado3 = false;
            int ale3 = (int) (Math.random() * 39)+1;
            for (int j = 0; j < i; j++) {
                if (vector3[j] == ale3) {
                    encontrado3 = true;
                }
            }
            if (!encontrado3) {
                vector3[i] = ale3;
            } else {
                i--;
            }
        }

        Arrays.sort(vector2);
        Arrays.sort(vector3);
        System.out.println("");
        System.out.println("Quini");
        System.out.print("Numeros: ");
        for (int i = 0;i < vector2.length;i++) {
            System.out.print(vector2[i] + " ");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("Brinco");
        System.out.println("Numeros: ");
        for (int i = 0;i < vector3.length;i++) {
            System.out.print(vector3[i] + " ");
        }
        System.out.println("");
    }
}
