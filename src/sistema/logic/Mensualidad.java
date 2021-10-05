package sistema.logic;

public class Mensualidad {
        String numero;
    	double saldo;
	double interes;
	double amortizacion;

	public Mensualidad (String n, double s,double i,double a){
                numero = n;
		saldo = s;            
		interes = i;
		amortizacion = a;
	}

        public Mensualidad (){
                numero = "0";
		saldo = 0;            
		interes = 0;
		amortizacion = 0;
	}
        
        public String getNumero() {
            return numero;
        }
	public double getSaldo(){
		return saldo;
	}        
	public double getInteres(){
		return interes;
	}
	public double getAmortizacion(){
		return amortizacion;
	}

    @Override  
    public String toString() {
        java.text.DecimalFormat df = new java.text.DecimalFormat("####");
        return "Mensualidad{" + "numero=" + numero + ", saldo=" + df.format(saldo) + ", interes=" + df.format(interes) + ", amortizacion=" + df.format(amortizacion) + "}\n";
    }   
}
