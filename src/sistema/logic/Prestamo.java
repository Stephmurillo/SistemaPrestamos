package sistema.logic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;

@XmlAccessorType(XmlAccessType.FIELD)
public class Prestamo {

    @XmlID
    private String codigo;
    private double monto;
    private double tasa;
    private double plazo;
    List<Pagos> pagos = new ArrayList<>();

    public Prestamo(String cod, double m, double t, double p) {
        this.codigo = cod;
        this.monto = m;
        this.tasa = t;
        this.plazo = p;
    }

    public Prestamo() {
        this.codigo = "000";
        this.monto = 0;
        this.tasa = 0;
        this.plazo = 0;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public double getMonto() {
        return this.monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getTasa() {
        return this.tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    public double getPlazo() {
        return plazo;
    }

    public void setPlazo(double plazo) {
        this.plazo = plazo;
    }

    public double getCuota() {
        double cuota;
        cuota = monto * tasa / 100 / (1 - Math.pow(1 + this.tasa / 100, -this.plazo));
        return cuota;
    }

    public double getTotal() {
        double total;
        total = this.getCuota() * this.getPlazo();
        return total;
    }

    public List<Pagos> getPagos() {
       return this.pagos;
    }

    public void setPagos(List<Pagos> pagos) {
        this.pagos = pagos;
    }

    @Override
    public String toString() {
        java.text.DecimalFormat df = new java.text.DecimalFormat("####");
        return "MONTO: " + df.format(monto) + "    TASA: " + df.format(tasa) + "    PLAZO: " + df.format(plazo)+ "    CUOTA: " + df.format(getCuota());
    }

}
