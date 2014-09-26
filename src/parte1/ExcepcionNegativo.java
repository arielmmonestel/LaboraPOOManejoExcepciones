package parte1;

public final class ExcepcionNegativo extends Exception {
	
	private static final long serialVersionUID= 1L;
	
	public ExcepcionNegativo(){}
	
	public ExcepcionNegativo(String arg0){
		super(arg0);
	}
	public ExcepcionNegativo(Throwable arg0){
		super(arg0); 
	}
	
	public ExcepcionNegativo(String arg0, Throwable arg1){
		super (arg0,arg1);
	}
	
	public ExcepcionNegativo(String arg0, Throwable arg1, boolean arg2,boolean arg3) {
		super(arg0,arg1,arg2,arg3);
	}

}
