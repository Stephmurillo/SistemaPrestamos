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
