package POO;

public class avião {
	
	private String modeloAvião;
	private int numerosLugares;
	
	public avião(String modeloAvião,int numerosLugares)
	{
		this.modeloAvião = modeloAvião;
		this.numerosLugares = numerosLugares;
	}
	
	public void impremirInfo()
	{
		System.out.println("\nOlá você ir voar no "+modeloAvião+" de "+numerosLugares+" assentos\n\tBoa Viagem !!!");
	}

	public String getModeloAvião() {
		return modeloAvião;
	}

	public void setModeloAvião(String modeloAvião) {
		this.modeloAvião = modeloAvião;
	}

	public int getNumerosLugares() {
		return numerosLugares;
	}

	public void setNumerosLugares(int numerosLugares) {
		this.numerosLugares = numerosLugares;
	}
	

}
