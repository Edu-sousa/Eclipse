package Heran�a;

public class testeAnimal {
	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Cachorro",7,"Latido","Correr");
		Pregui�a preg = new Pregui�a("Pregui�a",30,"Indefinido","Subir em Arvores");
		Cavalo cav = new Cavalo("Cavalo",30,"Relincho","Correr");
		
		dog.fichaCachorro();
		preg.fichaPregui�a();
		cav.fichaCavalo();
	}
}
