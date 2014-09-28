package parte2;

import javax.swing.JOptionPane;

import parte2.Calculadora.Conjunto;

public class Suma extends Operacion {

	@Override
	public void realizarOperacion(Conjunto conjunto) {
		String sum = "ERROR";
		
		switch (conjunto){
			case NATURALES:
				if(entradasNaturales()){
					sum = SumaEnteraNatural();
				}
				if(sum.charAt(0) == '+'){
					JOptionPane.showMessageDialog(null, "sumultado es negativo.", "ERROR: sumultado invalido",0);
					sum = "ERROR";
				}
				break;
			case ENTEROS:
				sum = SumaEnteraNatural();
				break;
			case RACIONALES:
				sum = Float.toString(Float.parseFloat(getPrimerDato()) + Float.parseFloat(getSegundoDato()));
				break;
		}
		if(sum.length() >12){
			JOptionPane.showMessageDialog(null, "sumultado de mas de 12 digitos", "ERROR: sumultado excede tamaño",0);
			sum = "ERROR";
		}
		Operacion.setResultado(sum);
	}
	
	private String SumaEnteraNatural(){
		try{
			return Integer.toString(Integer.parseInt(getPrimerDato()) + Integer.parseInt(getSegundoDato()));
		}
		catch (Exception e){
			JOptionPane.showMessageDialog(null, "Entradas no pertenecen al conjunto especificado.", "ERROR: Entradas invalidas",0);
			return "ERROR";
		}
	}
}
 