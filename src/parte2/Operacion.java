package parte2;

public abstract class Operacion {
	
	private static int primerDato= 0;
	private static int SegundoDato= 0;
	private static int resultado = 0;
	protected static String operando = "";
	
	
	public static int getPrimerDato() {
		return primerDato;
	}
	public static void setPrimerDato(int primerDato) {
		Operacion.primerDato = primerDato;
	}
	public static int getSegundoDato() {
		return SegundoDato;
	}
	public static void setSegundoDato(int segundoDato) {
		SegundoDato = segundoDato;
	}
	public static int getResultado() {
		return resultado;
	}
	public static void setResultado(int resultado) {
		Operacion.resultado = resultado;
	}
	public static String getOperando() {
		return operando;
	}
	public static void setOperando(String operando) {
		Operacion.operando = operando;
	}
	
	public abstract int realizarOperacion(int pDato1,int pDato2);
	
	/*public static void main(String[] args){
	
		Operacion op1 = new Resta();
		op1.realizarOperacion(5, 2);
		
		System.out.println(op1.realizarOperacion(5, 2));
		
		Operacion op2 = new Multiplicacion();
		op2.realizarOperacion(5, 2);
		
		System.out.println(op2.realizarOperacion(5, 2));
		
		Operacion op3 = new Division();
		op3.realizarOperacion(5, 2);
		
		System.out.println(op3.realizarOperacion(5, 2));
		
		
	}*/


}
	
	