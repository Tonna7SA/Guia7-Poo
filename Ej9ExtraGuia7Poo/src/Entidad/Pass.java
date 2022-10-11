package Entidad;

import java.util.Scanner;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Pass {

    public String pass;
    public String nombre;
    public int Dni;

    public Pass() {
        this.nombre = "jesus";
        this.Dni = 12345678;
    }

    public Pass(String pass, String nombre, int Dni) {
        this.pass = pass;
        this.nombre = nombre;
        this.Dni = Dni;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String contraseña;
    int ingreso = 0;
    String verificacion;

    public void CrearPass() {
        if (ingreso == 0) {
            System.out.println("Ingrese su contraseña");
            contraseña = leer.next();
            do {
                if (contraseña.length() != 10) {
                    System.out.println("Su contraseña debe tener 10 caracteres");
                    System.out.println("Intente nuevamente");
                    contraseña = leer.next();
                }
                if (contraseña.length() == 10) {
                    setPass(contraseña);
                    verificacion = contraseña;
                    ingreso = 1;
                }
            } while (contraseña.length() != 10);
        } else {
            System.out.println("Ya hay una contraseña ingresada, solo puede modificarla...");
        }
    }

    public void AnalizarPass() {
        int cont = 0;
        int cont1 = 0;
        for (int i = 0; i < getPass().length(); i++) {
            if (getPass().substring(i, i + 1).equalsIgnoreCase("z")) {
                cont++;
            }
            if (getPass().substring(i, i + 1).equalsIgnoreCase("a")) {
                cont1++;
            }
        }
        if (cont == 0) {
            System.out.println("Pass Nivel Bajo");
        }
        if (cont > 0 && cont1 < 2) {
            System.out.println("Pass Nivel Medio");
        }
        if (cont > 0 && cont1 > 1) {
            System.out.println("Pass Nivel Alto");
        }
    }

    public void ModificarPass() {
        System.out.println("Ingrese su contraseña actual:");
        contraseña = leer.next();
        if (!getPass().equalsIgnoreCase(contraseña)) {
            System.out.println("Contraseña incorrecta...");
        } else {

            do {
                System.out.println("Ingrese su nueva Contraseña");
                verificacion = leer.next();
                if (verificacion.length() != 10) {
                    System.out.println("Su nueva contraseña debe tener 10 caracteres");
                    System.out.println("Intente nuevamente");
                    verificacion = leer.next();
                }
                if (verificacion.length() == 10) {
                    if (!verificacion.equalsIgnoreCase(contraseña)) {
                        setPass(verificacion);
                        ingreso = 1;
                    }
                    if (verificacion.equalsIgnoreCase(contraseña)) {
                        System.out.println("Ingrese una contraseña distinta a la anterior...");
                    }
                }
            } while (contraseña.length() != 10);
        }
    }

    public void ModificarNyD() {
        System.out.println("Ingresar su contraseña:");
        contraseña = leer.next();
        do {
            if (!(contraseña.equalsIgnoreCase(getPass()))) {
                System.out.println("Contraseña Incorrecta...");
                break;
            } else {
                System.out.println("Contraseña Correcta");
                System.out.println("Ingrese su nuevo nombre");
                setNombre(leer.next());
                System.out.println("Ingrese su nuevo DNI");
                setDni(leer.nextInt());
            }
        } while (!(contraseña.equalsIgnoreCase(getPass())));
    }

    public void Menu() {
        int opcion;
        do {
            System.out.println("");
            System.out.println("Menu de Opciones");
            System.out.println("-----------------------");
            System.out.println("Usuario: " + getNombre());
            System.out.println("DNI: " + getDni());
            System.out.println("-----------------------");
            System.out.println("1- Ingresar Contraseña");
            System.out.println("2- Nivel de Contraseña");
            System.out.println("3- Modificar Contraseña");
            System.out.println("4- Modificar Nombre y DNI");
            System.out.println("5- Salir");
            System.out.println("-----------------------");
            System.out.println("Ingrese su opcion:");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("");
                    CrearPass();
                    System.out.println("");
                    break;
                case 2:
                    if (ingreso != 0) {
                        System.out.println("");
                        AnalizarPass();
                        System.out.println("");
                    } else {
                        System.out.println("Debe primero ingresar una Contraseña");
                    }
                    break;
                case 3:
                    if (ingreso != 0) {
                        System.out.println("");
                        ModificarPass();
                        System.out.println("");
                    } else {
                        System.out.println("Debe primero ingresar una Contraseña");
                    }
                    break;
                case 4:
                    if (ingreso != 0) {
                        System.out.println("");
                        ModificarNyD();
                        System.out.println("");
                    } else {
                        System.out.println("Debe primero ingresar una Contraseña");
                    }
                    break;
                case 5:
                    System.out.println("Hasta Luego...");
                    System.out.println("");
                    break;
                default:
                    System.out.println("");
                    System.out.println("Esa opcion no esta en el menu....");
                    System.out.println("");

            }
        } while (opcion != 5);
    }
}
