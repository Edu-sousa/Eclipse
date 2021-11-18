package Projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class exerLista {
	public static void main(String [] args) {
		
		Scanner leia = new Scanner(System.in);
		ArrayList <String> cadastro = new ArrayList();
		String nome;
		
		
		//System.out.println("\n\t\tEscolha uma opção: \n1- Adicionar Cadastro \n2- Remover Cadastro \n3- Atualizar Cadastro\n4- Apresentar os Cadastros existentes\n0- Finalizar Programa");
		int op ;
		
		do {
			System.out.println("\n\t\tEscolha uma opção: \n1- Adicionar Cadastro \n2- Remover Cadastro \n3- Atualizar Cadastro\n4- Apresentar os Cadastros existentes\n0- Finalizar Programa");
			op = leia.nextInt();
			
			switch(op)
			{
			case 1: 
			leia.nextLine();
			System.out.println("\nDigite um nome para adicionar: ");
			nome = leia.nextLine();
			cadastro.add(nome);
			break;
			
			case 2:
			leia.nextLine();
			System.out.println("\nDigite um nome para remover: ");
			nome = leia.nextLine();
			if(cadastro.contains(nome))
			{
				cadastro.remove(nome);
			}
			else
			{
				System.out.println("\nNome não encontrado");
			}
			//cadastro.remove(nome);
			break;

			case 3:
			leia.nextLine();
			System.out.println("\nDigite o nome que sera removido: ");
			nome = leia.nextLine();
			cadastro.remove(nome);
			System.out.println("\nDigite o nome que sera atualizado no lugar: ");
			nome = leia.nextLine();
			cadastro.add(nome);
			break;
			
			case 4:
			leia.nextLine();	
			System.out.println("\nOs nomes cadastrados são: ");
			System.out.println(cadastro);
			break;
			default:
				System.out.println("\nPrograma Finalizado");
				
			}
		}while(op!=0);
}
}
