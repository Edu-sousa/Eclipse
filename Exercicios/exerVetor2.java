package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.
*/

public class exerVetor2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int[] numeros = new int[6];
		int somaPar=0,contImpar=0;
		
		for(int num:numeros)
		{
			System.out.println("\nDigite um numero: ");
			num = leia.nextInt();
			
			if(num%2 == 0)
			{
				somaPar += num;
			}else
			{
				contImpar++;
			}
		}
		//System.out.println("\nOs numeros pares foram: ")
		//System.out.println("\nOs numeros impares foram: ");
		System.out.println("\nA soma dos numeros pares �: "+somaPar);
		System.out.println("\nA quantidade de numeros impares: "+contImpar);
    }
}
