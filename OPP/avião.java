package POO;

public class avi�o {
	
	private String modeloAvi�o;
	private int numerosLugares;
	
	public avi�o(String modeloAvi�o,int numerosLugares)
	{
		this.modeloAvi�o = modeloAvi�o;
		this.numerosLugares = numerosLugares;
	}
	
	public void impremirInfo()
	{
		System.out.println("\nOl� voc� ir voar no "+modeloAvi�o+" de "+numerosLugares+" assentos\n\tBoa Viagem !!!");
	}

	public String getModeloAvi�o() {
		return modeloAvi�o;
	}

	public void setModeloAvi�o(String modeloAvi�o) {
		this.modeloAvi�o = modeloAvi�o;
	}

	public int getNumerosLugares() {
		return numerosLugares;
	}

	public void setNumerosLugares(int numerosLugares) {
		this.numerosLugares = numerosLugares;
	}
	

}
