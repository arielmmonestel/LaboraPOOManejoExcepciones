package parte2;

import javax.swing.JOptionPane;

import parte2.Calculadora.Conjunto;

public class Division extends Operacion{
	@Override
	public void realizarOperacion(Conjunto conjunto) {
		String res = "ERROR";
		
		switch (conjunto){
			case NATURALES:
				if(entradasNaturales()){
					res = divEnteraNatural();
				}
				break;
			case ENTEROS:
				res = divEnteraNatural();
				break;
			case RACIONALES:
				res = Float.toString(Float.parseFloat(getPrimerDato()) / Float.parseFloat(getSegundoDato()));
				break;
		}
		if(res.length() >12){
			JOptionPane.showMessageDialog(null, "Resultado de mas de 12 digitos", "ERROR: Resultado excede tamaño",0);
			res = "ERROR";
		}
		Operacion.setResultado(res);
	}
	
	private String divEnteraNatural(){
		float d1 = Float.parseFloat(getPrimerDato());
		float d2 = Float.parseFloat(getSegundoDato());
		if( (d1 + d2) %1 != 0){
			JOptionPane.showMessageDialog(null, "Al menos una entrada es racional.", "ERROR: Entradas invalidas",0);
			return "ERROR";
		}
		float r = d1/d2;
		if(r%1 != 0){
			JOptionPane.showMessageDialog(null, "Resultado es racional.", "ERROR: Resultado invalido",0);
			return "ERROR";
		}

		return Integer.toString((int) r);
	}
}
