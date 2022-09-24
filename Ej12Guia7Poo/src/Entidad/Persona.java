package Entidad;

import java.util.Date;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Persona {

    public String nombre;
    public Date fechanacimiento;
    public String nombre1;
    public Date fechanacimiento1;

    public Persona() {
    }

    public Persona(String nombre, Date fechanacimiento, String nombre1, Date fechanacimiento1) {
        this.nombre = nombre;
        this.fechanacimiento = fechanacimiento;
        this.nombre1 = nombre1;
        this.fechanacimiento1 = fechanacimiento1;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public Date getFechanacimiento1() {
        return fechanacimiento1;
    }

    public void setFechanacimiento1(Date fechanacimiento1) {
        this.fechanacimiento1 = fechanacimiento1;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechanacimiento=" + fechanacimiento + ", nombre1=" + nombre1 + ", fechanacimiento1=" + fechanacimiento1 + '}';
    }
}
