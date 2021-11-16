package Heran�a;

public class Pregui�a extends Animal{
	private String Som;
	private String habilidade;
	
	public Pregui�a(String nome, int idade,String som,String habilidade) {
		super(nome,idade);
		this.habilidade=habilidade;
	}
	public void fichaPregui�a() {
		System.out.println("\nNome: "+getNome()+"\nVive em media: "+getIdade()+" Anos\nSom: "+getSom()+"\nHabilidade: "+ habilidade);
	}
	public String getSom() {
		return Som;
	}
	public void setSom(String som) {
		Som = som;
	}
	public String getHabilidade() {
		return habilidade;
	}
	public void setHabilidade(String habilidade) {
		this.habilidade = habilidade;
	}
}
