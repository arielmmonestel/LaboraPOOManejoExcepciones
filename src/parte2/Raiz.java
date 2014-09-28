package parte2;

import javax.swing.JOptionPane;

import parte2.Calculadora.Conjunto;

public class Raiz extends Operacion {
	
	public void realizarOperacion(Conjunto conjunto){
		String res = "ERROR";
		
		switch (conjunto){
		
		case NATURALES:
			if (entradasNaturales()){
				res = raizEnteraNatural();
			}
			break;
		
		case ENTEROS:
			res = raizEnteraNatural();
			break;
		
		case RACIONALES:
			res = Float.toString((float) Math.sqrt(Float.parseFloat(getPrimerDato())));
		
			break;
		}
		if(res.length() >12){
			JOptionPane.showMessageDialog(null, "Resultado de mas de 12 digitos", "ERROR: Resultado excede tamaño",0);
			res = "ERROR";
		}
		Operacion.setResultado(res);
		
		
	}
	
	private String raizEnteraNatural(){
		try{
			return Integer.toString((int) Math.sqrt(Integer.parseInt(getPrimerDato())));
		}
		catch (Exception e){
			JOptionPane.showMessageDialog(null, "Entradas no pertenecen al conjunto especificado.", "ERROR: Entradas invalidas",0);
			return "ERROR";
		}
	}


}
