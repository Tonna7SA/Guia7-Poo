package Entidad;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Armadura {

    public double DGderecho;
    public double DGizquierdo;
    public double DBderecha;
    public double DBizquierda;
    public double DCasco;
    public double EGderecho;
    public double EGizquierdo;
    public double EBderecha;
    public double EBizquierda;
    public double ECasco;
    public double Bateria;
    public float Reactor;

    public Armadura() {
        this.Reactor = Float.MAX_VALUE;
        this.DGderecho = 100;
        this.DGizquierdo = 100;
        this.DBderecha = 100;
        this.DBizquierda = 100;
        this.DCasco = 100;
    }

    public Armadura(double DGderecho, double DGizquierdo, double DBderecha, double DBizquierda, double DCasco, double EGderecho, double EGizquierdo, double EBderecha, double EBizquierda, double ECasco, double Bateria, float Reactor) {
        this.DGderecho = DGderecho;
        this.DGizquierdo = DGizquierdo;
        this.DBderecha = DBderecha;
        this.DBizquierda = DBizquierda;
        this.DCasco = DCasco;
        this.EGderecho = EGderecho;
        this.EGizquierdo = EGizquierdo;
        this.EBderecha = EBderecha;
        this.EBizquierda = EBizquierda;
        this.ECasco = ECasco;
        this.Bateria = Bateria;
        this.Reactor = Reactor;
    }

    public double getDGderecho() {
        return DGderecho;
    }

    public void setDGderecho(double DGderecho) {
        this.DGderecho = DGderecho;
    }

    public double getDGizquierdo() {
        return DGizquierdo;
    }

    public void setDGizquierdo(double DGizquierdo) {
        this.DGizquierdo = DGizquierdo;
    }

    public double getDBderecha() {
        return DBderecha;
    }

    public void setDBderecha(double DBderecha) {
        this.DBderecha = DBderecha;
    }

    public double getDBizquierda() {
        return DBizquierda;
    }

    public void setDBizquierda(double DBizquierda) {
        this.DBizquierda = DBizquierda;
    }

    public double getDCasco() {
        return DCasco;
    }

    public void setDCasco(double DCasco) {
        this.DCasco = DCasco;
    }

    public double getEGderecho() {
        return EGderecho;
    }

    public void setEGderecho(double EGderecho) {
        this.EGderecho = EGderecho;
    }

    public double getEGizquierdo() {
        return EGizquierdo;
    }

    public void setEGizquierdo(double EGizquierdo) {
        this.EGizquierdo = EGizquierdo;
    }

    public double getEBderecha() {
        return EBderecha;
    }

    public void setEBderecha(double EBderecha) {
        this.EBderecha = EBderecha;
    }

    public double getEBizquierda() {
        return EBizquierda;
    }

    public void setEBizquierda(double EBizquierda) {
        this.EBizquierda = EBizquierda;
    }

    public double getECasco() {
        return ECasco;
    }

    public void setECasco(double ECasco) {
        this.ECasco = ECasco;
    }

    public double getBateria() {
        return Bateria;
    }

    public void setBateria(double Bateria) {
        this.Bateria = Bateria;
    }

    public float getReactor() {
        return Reactor;
    }

    public void setReactor(float Reactor) {
        this.Reactor = Reactor;
    }

    @Override
    public String toString() {
        return "Armadura{" + "DGderecho=" + DGderecho + ", DGizquierdo=" + DGizquierdo + ", DBderecha=" + DBderecha + ", DBizquierda=" + DBizquierda + ", DCasco=" + DCasco + ", EGderecho=" + EGderecho + ", EGizquierdo=" + EGizquierdo + ", EBderecha=" + EBderecha + ", EBizquierda=" + EBizquierda + ", ECasco=" + ECasco + ", Bateria=" + Bateria + ", Reactor=" + Reactor + '}';
    }

}
