package Herança;

public class Cavalo extends Animal{
	private String som;
	private String habilidade;
	
	public Cavalo(String nome, int idade, String som, String habilidade) {
		super(nome,idade);
		this.som=som;
		this.habilidade=habilidade;
	}
	public void fichaCavalo() {
		System.out.println("\nNome: "+getNome()+"\nVive em media: "+getIdade()+" Anos\nSom: "+getSom()+"\nHabilidade: "+ habilidade);
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getHabilidade() {
		return habilidade;
	}
	public void setHabilidade(String habilidade) {
		this.habilidade = habilidade;
	}
	
}
