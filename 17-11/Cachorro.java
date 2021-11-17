package Herança;

public class Cachorro extends Animal{
	public Cachorro() 
	{
		super("Tipo Cachorro");
	}

	public void nome(String nome)
	{
		System.out.println("Nome: Cachorro");
	}
	
	public void idade(String idade) 
	{
		System.out.println("Vive em media: 10 a 13 anos");
	}
	
	public void som(String som)
	{
		System.out.println("Som: Latido");
	}
	
	public void Corre(String Corre)
	{
		System.out.println("Habilidade: Correr");
	}
	
}