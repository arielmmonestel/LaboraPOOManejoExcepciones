package parte2;

import javax.swing.JOptionPane;

import parte2.Calculadora.Conjunto;

public abstract class Operacion {
	
	private static String primerDato= "0";
	private static String SegundoDato= "0";
	private static String resultado = "0";
	
	
	public static String getPrimerDato() {
		return primerDato;
	}
	public static void setPrimerDato(String primerDato) {
		Operacion.primerDato = primerDato;
	}
	public static String getSegundoDato() {
		return SegundoDato;
	}
	public static void setSegundoDato(String segundoDato) {
		SegundoDato = segundoDato;
	}
	public static String getResultado() {
		return resultado;
	}
	public static void setResultado(String resultado) {
		Operacion.resultado = resultado;
	}
	
	public abstract void realizarOperacion(Conjunto conjunto);
	
	protected boolean entradasNaturales(){
		if(getPrimerDato().charAt(0) == '-' || getSegundoDato().charAt(0) == '-'){
			JOptionPane.showMessageDialog(null, "Entradas (s) negativa (s).  No en naturales", "ERROR: Entradas invalidas",0);
			return false;
		}
		return true;
	}
	/*public static void main(String[] args){
	
		Operacion op1 = new Resta();
		op1.realizarOperacion(5, 2);
		
		System.out.prStringln(op1.realizarOperacion(5, 2));
		
		Operacion op2 = new Multiplicacion();
		op2.realizarOperacion(5, 2);
		
		System.out.prStringln(op2.realizarOperacion(5, 2));
		
		Operacion op3 = new Division();
		op3.realizarOperacion(5, 2);
		
		System.out.prStringln(op3.realizarOperacion(5, 2));
		
		
	}*/


}
	
	