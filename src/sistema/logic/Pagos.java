package sistema.logic;

import java.util.Calendar;

public class Pagos {

    String numero;
    String fecha;
    Calendar fech;
    double monto;
    double interes;
    double amortizacion;

    public Pagos(double m, double tasa) {
        setFecha();
        monto = m;
        setInteres(tasa);
        setAmortizacion();
    }

    public Pagos() {
        numero = "0";
        fecha = null;
        monto = 0;
        interes = 0;
        amortizacion = 0;
    }
        
    public String getNumero() {
        return numero;
    }

    public double getMonto() {
        return monto;
    }

    public void setInteres(double tasa) {
        this.interes = monto * tasa/100;
    }

    public void setAmortizacion() {
        this.amortizacion = this.monto - this.interes;
    }
    
    public double getInteres() {
        return interes;
    }

    public double getAmortizacion() {
        return amortizacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha() {
        int año = fech.get(Calendar.YEAR);
        int mes = fech.get(Calendar.MONTH);
        int dia = fech.get(Calendar.DAY_OF_MONTH);
        this.fecha = dia+"/"+mes+"/"+año+"/";
    }

    @Override  
    public String toString() {
        java.text.DecimalFormat df = new java.text.DecimalFormat("####");
        return "Mensualidad{" + "numero=" + numero + ", saldo=" + df.format(monto) + ", interes=" + df.format(interes) + ", amortizacion=" + df.format(amortizacion) + "}\n";
    }   
}
