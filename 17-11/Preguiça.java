package Herança;

public class Preguiça extends Animal{
	public Preguiça() 
	{
		super("Tipo Preguiça");
	}
	
	public void nome(String nome)
	{
		System.out.println("Nome: Preguiça");
	}
	
	public void idade(String idade) 
	{
		System.out.println("Vive em media: 30 a 40 anos");
	}
	
	public void som(String som)
	{
		System.out.println("Som: .....");
	}
	
	public void habilidade(String habilidade)
	{
		System.out.println("Habilidade: Subir em arvores");
	}
	
}