package arrays;

import java.util.Scanner;

/*
Fa�a um programa que leia duas matrizes 2 x 2 com valores reais.
 Ofere�a ao usu�rio um menu de op��es:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. Na terceira op��o o valor da constante deve ser lido e o resultado da adi��o da constante deve ser armazenado na pr�pria matriz.
*/

public class exerMatriz2 {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		float[][] matriz1= new float[2][2];
		float[][] matriz2= new float[2][2];
		float[][] matriz3= new float[2][2];
		int op,constante,linha,coluna;
		for(linha=0;linha<2;linha++)
		{
			for(coluna=0;coluna<2;coluna++)
			{
				System.out.println("\nDigite um numero: ");
				matriz1[linha][coluna]= leia.nextFloat();
				System.out.println("\nDigite um numero: ");
				matriz2[linha][coluna] = leia.nextFloat();
			}	
		}
		do
		{ 
			System.out.println("\n\t\tMenu de Op��es");
			System.out.println("\n1 - Somar as duas matrizes");
			System.out.println("\n2 - Subtrair a primeira matriz da segunda");
			System.out.println("\n3 - Adicionar uma constante as duas matrizes");
			System.out.println("\n4 - Imprimir as matrizes");
			System.out.println("\n5 - Sair do programa");
			System.out.println("\nEscolha uma das op��es");
			op = leia.nextInt();
			
			switch(op)
			{
			case 1:
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						matriz3[linha][coluna]=matriz1[linha][coluna]+matriz2[linha][coluna];
						System.out.println("\nA soma das matrizes �: "+matriz3[linha][coluna]);
					}	
				}
				break;
			case 2:
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						matriz3[linha][coluna]=matriz2[linha][coluna]-matriz1[linha][coluna];
						System.out.println("\nA primeira matriz subtraida da segunda: "+matriz3[linha][coluna]);
					}
				}
				break;
			case 3:
				System.out.println("\nDigite um numero: ");
				constante = leia.nextInt();
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						matriz1[linha][coluna]=matriz1[linha][coluna]+constante;
						matriz2[linha][coluna]=matriz2[linha][coluna]+constante;
						System.out.println("\nO numero digitado adicionado a primeira matriz: "+matriz1[linha][coluna]);
						System.out.println("\nO numero digitado adicionado a segunda matriz: "+matriz2[linha][coluna]);
					}
				}
				break;
			case 4:
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						System.out.println("\nPrimeira matriz: "+matriz1[linha][coluna]);
						System.out.println("\nSegunda matriz: "+matriz2[linha][coluna]);
					}	
				}
				break;
			case 5:	
				break;
				
			}	
		}while(op!=5);
	}
}
