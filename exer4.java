package laçoCondicional;

import java.util.Scanner;

/*
Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
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
			System.out.println("\n"+num+" é Par e sua Raiz Quadrada é: "+raizPar);	
		}
		else
		{   potImpar = Math.pow(num, 2);
			System.out.println("\n"+num+" é Impar e seu valor ao quadrado é: "+potImpar);
		}
	}

}
