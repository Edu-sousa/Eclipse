package la�oRepeti��o;

import java.util.Scanner;

/*
 * Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)
 */
public class exercicioDoWhile1 {
	public static void main(String[] Args)
	{
		Scanner leia = new Scanner(System.in);
		int numero,soma=0;
		
		do
		{
			System.out.println("\nDigite um numero: ");
			numero = leia.nextInt();
			soma += numero;
			
		}while(numero!=0);
		System.out.println("\nA soma dos numeros digitados �: "+soma);
		
	}
}
