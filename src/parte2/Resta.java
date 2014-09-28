package parte2;

import javax.swing.JOptionPane;

import parte2.Calculadora.Conjunto;

public class Resta extends Operacion {

	@Override
	public void realizarOperacion(Conjunto conjunto) {
		String res = "ERROR";
		
		switch (conjunto){
			case NATURALES:
				if(entradasNaturales()){
					res = restaEnteraNatural();
				}
				if(res.charAt(0) == '-'){
					JOptionPane.showMessageDialog(null, "Resultado es negativo.", "ERROR: Resultado invalido",0);
					res = "ERROR";
				}
				break;
			case ENTEROS:
				res = restaEnteraNatural();
				break;
			case RACIONALES:
				res = Float.toString(Float.parseFloat(getPrimerDato()) - Float.parseFloat(getSegundoDato()));
				break;
		}
		if(res.length() >12){
			JOptionPane.showMessageDialog(null, "Resultado de mas de 12 digitos", "ERROR: Resultado excede tamaño",0);
			res = "ERROR";
		}
		Operacion.setResultado(res);
	}
	
	private String restaEnteraNatural(){
		try{
			return Integer.toString(Integer.parseInt(getPrimerDato()) - Integer.parseInt(getSegundoDato()));
		}
		catch (Exception e){
			JOptionPane.showMessageDialog(null, "Entradas no pertenecen al conjunto especificado.", "ERROR: Entradas invalidas",0);
			return "ERROR";
		}
	}
}
 