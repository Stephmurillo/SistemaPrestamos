package sistema.logic;

import java.util.Calendar;

public class Pagos {

    String numero;
    Calendar fecha;
    double monto;
    double interes;
    double amortizacion;

    public Pagos(String n, double m, double i, double a) {
        numero = n;
        monto = m;
        interes = i;
        amortizacion = a;
    }

    public Pagos() {
        numero = "0";
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

    public double getInteres() {
        return interes;
    }

    public double getAmortizacion() {
        return amortizacion;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    @Override  
    public String toString() {
        java.text.DecimalFormat df = new java.text.DecimalFormat("####");
        return "Mensualidad{" + "numero=" + numero + ", saldo=" + df.format(monto) + ", interes=" + df.format(interes) + ", amortizacion=" + df.format(amortizacion) + "}\n";
    }   
}
