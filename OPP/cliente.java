package POO;
/*
Crie uma classe cliente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
*/

public class cliente {
	
	private String nome;
	private int idade;
	private String profiss�o;
	
	public cliente(String nome, int idade,String profiss�o)
	{
		this.nome=nome;
		this.idade=idade;
		this.profiss�o=profiss�o;
	}

	public cliente(String nome2, String string, int i) {
		// TODO Auto-generated constructor stub
	}

	public void ImprimirFicha()
	{
		System.out.println("\nCliente "+nome+"� um "+profiss�o+"de"+idade);
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getProfiss�o() {
		return profiss�o;
	}

	public void setProfiss�o(String profiss�o) {
		this.profiss�o = profiss�o;
	}

}