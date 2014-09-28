package parte2;
import java.math.*;

import javax.swing.JOptionPane;

import com.sun.javafx.scene.paint.GradientUtils.Parser;

import parte2.Calculadora.Conjunto;

public class Ln extends Operacion {

	@Override
	public void realizarOperacion(Conjunto conjunto) {
		String ln = "ERROR";
		
		switch (conjunto){
			case NATURALES:
				if(entradasNaturales()){
					
					ln = "ERROR N";
				}
				if(ln.charAt(0) == 'l'){
					JOptionPane.showMessageDialog(null, "Operacion Natural.", "ERROR: Operación invalido",0);
					ln = "ERROR N";
				}
				break;
			case ENTEROS:
				JOptionPane.showMessageDialog(null, "Operacion Enteros.", "ERROR: Operación invalido",0);
				break;
			case RACIONALES:
				ln = LogaritmoNatural();
				break;
		}
		if(ln.length() >12){
			ln = LogaritmoNatural();
			JOptionPane.showMessageDialog(null, "Resultado de mas de 12 digitos", "ERROR: Resultado excede tamaño",0);
			ln = "ERROR12";
		}
		Operacion.setResultado(ln);
	}
	
	private String LogaritmoNatural(){
		try{
			
			double a = Double.parseDouble(getPrimerDato()); // + Integer.parseInt(getSegundoDato()));
			if(a == 0)
				{JOptionPane.showMessageDialog(null, "No se puede calcular ln(0)", "ERROR: Entradas invalidas",0);
				return "ERROR 0";}
			
			return  Double.toString(Math.log(a));
		}
		catch (Exception e){
			JOptionPane.showMessageDialog(null, "Entradas no pertenecen al conjunto especificado. 1", "ERROR: Entradas invalidas",0);
			return "ERROR1";
		}
	}
}
 