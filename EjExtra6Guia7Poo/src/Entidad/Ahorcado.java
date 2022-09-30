package Entidad;


/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Ahorcado {

    public String palabra;
    public String vector[];
    public int letrasencontradas;
    public int maximojugadas;

    public Ahorcado() {
    }

    public Ahorcado(String palabra, String[] vector, int letrasencontradas, int maximojugadas) {
        this.palabra = palabra;
        this.vector = vector;
        this.letrasencontradas = letrasencontradas;
        this.maximojugadas = maximojugadas;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String[] getVector() {
        return vector;
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }

    public int getLetrasencontradas() {
        return letrasencontradas;
    }

    public void setLetrasencontradas(int letrasencontradas) {
        this.letrasencontradas = letrasencontradas;
    }

    public int getMaximojugadas() {
        return maximojugadas;
    }

    public void setMaximojugadas(int maximojugadas) {
        this.maximojugadas = maximojugadas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", vector=" + vector + ", letrasencontradas=" + letrasencontradas + ", maximojugadas=" + maximojugadas + '}';
    }

}
