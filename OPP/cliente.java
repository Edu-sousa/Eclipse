package POO;
/*
Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
*/

public class cliente {
	
	private String nome;
	private int idade;
	private String profissão;
	
	public cliente(String nome, int idade,String profissão)
	{
		this.nome=nome;
		this.idade=idade;
		this.profissão=profissão;
	}

	public cliente(String nome2, String string, int i) {
		// TODO Auto-generated constructor stub
	}

	public void ImprimirFicha()
	{
		System.out.println("\nCliente "+nome+"é um "+profissão+"de"+idade);
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

	public String getProfissão() {
		return profissão;
	}

	public void setProfissão(String profissão) {
		this.profissão = profissão;
	}

}