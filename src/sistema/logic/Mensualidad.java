package sistema.logic;

public class Mensualidad {
        int numero;
    	double saldo;
	double interes;
	double amortizacion;

	public Mensualidad (int n, double s,double i,double a){
                numero = n;
		saldo = s;            
		interes = i;
		amortizacion = a;
	}

        public int getNumero() {
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
