package Herança;

public class Cavalo extends Animal{
	public Cavalo() 
	{
		super("Tipo Cavalo");
	}
	
	public void nome(String nome)
	{
		System.out.println("Nome: Cavalo");
	}
	
	public void idade(String idade) 
	{
		System.out.println("Vive em media: 25 a 30 anos");
	}
	
	public void som(String som)
	{
		System.out.println("Som: Relincho");
	}
	
	public void habilidade(String habilidade)
	{
		System.out.println("Habilidade: Correr");
	}
	
}