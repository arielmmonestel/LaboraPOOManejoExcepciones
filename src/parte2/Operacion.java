package parte2;

import parte2.Calculadora.Conjunto;

public abstract class Operacion {
	
	private static String primerDato= "";
	private static String SegundoDato= "";
	private static String resultado = "";
	
	
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
	
	