package parte2;

public class Division extends Operacion{
	@Override
	public int realizarOperacion(int pDato1, int pDato2) {
		Operacion.setResultado(pDato1 / pDato2);
		return Operacion.getResultado();
	}
}
