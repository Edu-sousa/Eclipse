package laçoRepetição;

import java.util.Scanner;

// Ler 10 números e imprimir quantos são pares e quantos são ímpares.
public class exercicioFor2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int x,numeros,contPar=0,contImpar=0;
		
		for(x=0;x<10;x++)
		{
			System.out.println("\nDigite um numero");
			numeros =leia.nextInt();
			if(numeros%2==0)
			{
				contPar++;
			}
			else
			{
				contImpar++;
			}
		}
		System.out.println("\nQuantidade de numero(s) par: "+contPar);
		System.out.println("\nQuantidade de numero(s) impar: "+contImpar);
	}
}
