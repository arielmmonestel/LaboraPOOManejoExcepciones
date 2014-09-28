package parte2;
import javax.swing.JOptionPane;

import parte2.Calculadora.Conjunto;

public class Potencia extends Operacion{
	
	public void realizarOperacion(Conjunto conjunto){
		String res = "ERROR";
		
		switch (conjunto){
		
		case NATURALES:
			if (entradasNaturales()){
				res = poteEnteraNatural();
			}
			break;
		
		case ENTEROS:
			res = poteEnteraNatural();
			break;
		
		case RACIONALES:
			res = Float.toString((float) Math.pow(Float.parseFloat(getPrimerDato()), Float.parseFloat(getSegundoDato())));
		
			break;
		}
		if(res.length() >12){
			JOptionPane.showMessageDialog(null, "Resultado de mas de 12 digitos", "ERROR: Resultado excede tamaño",0);
			res = "ERROR";
		}
		Operacion.setResultado(res);
		
		
	}
	
	private String poteEnteraNatural(){
		try{
			return Integer.toString((int) Math.pow(Integer.parseInt(getPrimerDato()) , Integer.parseInt(getSegundoDato())));
		}
		catch (Exception e){
			JOptionPane.showMessageDialog(null, "Entradas no pertenecen al conjunto especificado.", "ERROR: Entradas invalidas",0);
			return "ERROR";
		}
	}

}
