package Entidad;
/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Triangulo {
private double Lados;
private double base;
private double altura;
private double perimetro;
private double area;

    public Triangulo() {
    }

    public Triangulo(double Lados, double base, double altura, double perimetro, double area) {
        this.Lados = Lados;
        this.base = base;
        this.altura = altura;
        this.perimetro = perimetro;
        this.area = area;
    }

    public double getLados() {
        return Lados;
    }

    public void setLados(double Lados) {
        this.Lados = Lados;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "[" + "Lados=" + Lados + " cms. , base=" + base + " cms. , altura=" + altura + " cms. , perimetro=" + perimetro + " cms. , area=" + area + " cms².]";
    }

}
