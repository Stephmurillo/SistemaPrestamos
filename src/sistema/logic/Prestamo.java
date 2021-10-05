package sistema.logic;

import java.util.ArrayList;
import java.util.List;

public class Prestamo {
        private String codigo;
        private double monto;
	private double tasa;
	private double plazo;

	public Prestamo(String cod, double m, double t, double p){
	    this.codigo = cod;
            this.monto = m;
            this.tasa = t;
            this.plazo = p;
	}

	public Prestamo(){
            this.codigo = "000";
            this.monto = 0;
            this.tasa = 0;
            this.plazo = 0;
	}

        public String getCodigo(){
		return this.codigo;
	}
        
	public double getMonto(){
		return this.monto;
	}

	public void setMonto(double monto){
		this.monto = monto;
	}

	public double getTasa(){
		return this.tasa;
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
		cuota   = monto * tasa/100 /(1-Math.pow(1 + this.tasa/100, -this.plazo));
		return cuota;
	}

	public double getTotal(){
		double total;
		total = this.getCuota() * this.getPlazo();
		return total;
	}

	public List<Mensualidad> getMensualidades(){
            Mensualidad m;
            double cuota = this.getCuota();
            double saldo = monto;
            double interes = 0;
            double amortizacion = 0;
            ArrayList<Mensualidad> resultado = new ArrayList<>();

	    for(int i=0;i<plazo;i++){
	    	 interes = saldo * tasa/100;
	    	 amortizacion = cuota - interes;
                 m = new Mensualidad("i+1",saldo,interes, amortizacion);
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
