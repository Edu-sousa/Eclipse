package la�oRepeti��o;

import java.util.Scanner;

// Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
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
