package la�oCondicional;

import java.util.Scanner;

/*
Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.
import java.util.Scanner;
*/

public class exer4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num;
		double potImpar;
		double raizPar; 
		
		System.out.println("\nDigite um numero: ");
		num = leia.nextInt();
		
		if(num%2 ==0)
		{
			 raizPar= Math.sqrt(num);
			System.out.println("\n"+num+" � Par e sua Raiz Quadrada �: "+raizPar);	
		}
		else
		{   potImpar = Math.pow(num, 2);
			System.out.println("\n"+num+" � Impar e seu valor ao quadrado �: "+potImpar);
		}
	}

}
