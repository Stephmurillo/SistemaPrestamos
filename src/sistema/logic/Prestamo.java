/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.logic;

/**
 *
 * @author muril
 */
import java.util.ArrayList;
import java.util.List;

public class Prestamo {
	private double monto;
	private double tasa;
	private double plazo;

	public Prestamo(double m, double t, double p){
		monto=m;
		tasa=t;
		plazo=p;
	}

	public Prestamo(){
	}

	public double getMonto(){
		return monto;
	}

	public void setMonto(double monto){
		this.monto = monto;
	}

	public double getTasa(){
		return tasa;
	}

	public void setTasa(double tasa){
		this.tasa = tasa;
	}

	public double getPlazo(){
		return plazo;
	}

	public void setPlazo(double plazo){
		this.plazo = plazo;
	}

	public double getCuota(){
		double cuota;
		cuota   = monto * tasa/100 /(1-Math.pow(1+tasa/100,-plazo));
		return cuota;
	}

	public double getTotal(){
		double total;
		total = this.getCuota() * this.getPlazo();
		return total;
	}

	public List<Mensualidad> getMensualidades(){
            Mensualidad m;
            double cuota=this.getCuota();
            double saldo=monto;
            double interes=0;
            double amortizacion=0;
            ArrayList<Mensualidad> resultado = new ArrayList<>();

	    for(int i=0;i<plazo;i++){
	    	 interes = saldo * tasa/100;
	    	 amortizacion = cuota - interes;
                 m = new Mensualidad(i+1,saldo,interes, amortizacion);
                 resultado.add(m);
                 saldo = saldo - amortizacion;                 
            }
            return resultado;
	}

    @Override
    public String toString() {
        java.text.DecimalFormat df = new java.text.DecimalFormat("####");
        return "MONTO: " + df.format(monto) + "    TASA: " + df.format(tasa) + "    PLAZO: " + df.format(plazo)+ "    CUOTA: " + df.format(getCuota());
    }

}
