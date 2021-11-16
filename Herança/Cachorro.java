package Herança;

public class Cachorro extends Animal{
	private String som;
	private String correr;

	public Cachorro(String nome, int idade,String som, String correr) {
		super(nome, idade);
		this.som=som;
		this.correr=correr;
		
	}
	public void fichaCachorro() {
		System.out.println("\nNome: "+getNome()+"\nVive em media: "+getIdade()+" Anos\nSom: "+som+"\nHabilidade: "+ correr);
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getCorrer() {
		return correr;
	}
	public void setCorrer(String correr) {
		this.correr = correr;
	}

}
