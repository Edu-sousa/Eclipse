package Herança;

public class testeAnimal {
	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Cachorro",7,"Latido","Correr");
		Preguiça preg = new Preguiça("Preguiça",30,"Indefinido","Subir em Arvores");
		Cavalo cav = new Cavalo("Cavalo",30,"Relincho","Correr");
		
		dog.fichaCachorro();
		preg.fichaPreguiça();
		cav.fichaCavalo();
	}
}
