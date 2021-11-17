package Herança;

import java.util.Scanner;

public class testeAnimal {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Cachorro dog = new Cachorro();
		Preguiça preg = new Preguiça();
		Cavalo cav = new Cavalo();
		
		
		System.out.println("\nEscolha um numero para ver a ficha:\n1- Cachorro\n2- Cavalo\n3- Preguiça");
		int y = leia.nextInt();
		
		switch(y) {
		case 1:
			dog.nome(null);
			dog.idade(null);
			dog.som(null);
			dog.Corre(null);
			break;
			
		case 2:
			cav.nome(null);
			cav.idade(null);
			cav.som(null);
			cav.habilidade(null);
			break;
		case 3:
			preg.nome(null);
			preg.idade(null);
			preg.som(null);
			preg.habilidade(null);
			break;
		}
	}
}
