package sistema.logic;

public class Mensualidad {
        String numero;
    	double saldo;
	double interes;
	double amortizacion;
        Boolean estado;

	public Mensualidad (String n, double s, double i, double a, Boolean e){
                numero = n;
		saldo = s;            
		interes = i;
		amortizacion = a;
                estado = e;
	}

        public Mensualidad (){
                numero = "0";
		saldo = 0;            
		interes = 0;
		amortizacion = 0;
                estado = false;
	}
        
    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getInteres() {
        return interes;
    }

    public double getAmortizacion() {
        return amortizacion;
    }

    public Boolean getEstado() {
        return estado;
    }
    
    public void setEstado(Boolean estado){
        this.estado = estado;
    }

    @Override  
    public String toString() {
        java.text.DecimalFormat df = new java.text.DecimalFormat("####");
        return "Mensualidad{" + "numero=" + numero + ", saldo=" + df.format(saldo) + ", interes=" + df.format(interes) + ", amortizacion=" + df.format(amortizacion) + "}\n";
    }   
}
