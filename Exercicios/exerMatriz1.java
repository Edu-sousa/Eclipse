package arrays;

import java.util.Scanner;

//Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui

public class exerMatriz1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); 
		int[][] numeros = new int[3][3];
		int maiorQ10=0;
		
		for(int linha=0;linha<3;linha++)
		{
			for(int coluna=0;coluna<3;coluna++)
			{
				System.out.println("\nDigite um numero: ");
				numeros[linha][coluna] = leia.nextInt();
				if(numeros[linha][coluna]>10)
				{
					maiorQ10++;
				}
			}
			
		}
		System.out.println("\nQuantidade de numeros maiores que 10: "+maiorQ10);
	}

}
