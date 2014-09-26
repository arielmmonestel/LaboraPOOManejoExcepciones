

package parte1;


import java.util.*;



public abstract class Suma {
    
    private static int primerSumador = 0;
    private static int segundoSumador = 0;
    private static int resultadoSuma = 0;
    private static Scanner escaner = new Scanner(System.in);
    
    
    public static int getPrimerSumador() {
        return primerSumador;
    }
    public static void setPrimerSumador(int primerSumador) {
        Suma.primerSumador = primerSumador;
    }
    public static int getSegundoSumador() {
        return segundoSumador;
    }
    public static void setSegundoSumador(int segundoSumador) {
        Suma.segundoSumador = segundoSumador;
    }
    public static int getResultadoSuma() {
        return resultadoSuma;
    }
    public static void setResultadoSuma(int resultadoSuma) {
        Suma.resultadoSuma = resultadoSuma;
    }
    public static Scanner getEscaner() {
        return escaner;
    }
    public static void setEscaner(Scanner escaner) {
        Suma.escaner = escaner;
    }
    
    public static int sumar(){
    	setResultadoSuma(getPrimerSumador()+getSegundoSumador());
    	return getResultadoSuma();
    	
    }	
    
    public static void main(String[] args){
    	boolean operacionExitosa=false;
    	while(!operacionExitosa){
    	try{	
    	
    	System.out.println("$%#SUMA DE NUMEROS ENTEROS #%$\n"+
    			"Introduzca el primer sumador: ");
    	setPrimerSumador(getEscaner().nextInt());
    	
    	System.out.println("Introduzca el segundo sumador: ");
    	setSegundoSumador(getEscaner().nextInt());
    	System.out.println("Resultado: " + sumar() + "\n\n");
    	operacionExitosa= true;}
    	catch (InputMismatchException e){
    		System.out.println( "\nExcepcion: " +e.toString() +"\n"+
    							"Error:Se ingreso un valor invalido.\n"
    							+ "Solo se permiten numeros enteros . \n"
    							+ "Intentelo de nuevo por favor. \n");
    		
    		getEscaner().nextLine();}
    	finally{
    		
    		System.out.println("Operacion realizada con exito? "+ operacionExitosa+ "\n");
    	}
    	
    }
    
    }
}
