package la�oCondicional;

import java.util.Scanner;

public class exer1 {

	public static void main(String[] args) {
		 //Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		Scanner leia = new Scanner (System.in);
		int num1,num2,num3;
		
		System.out.println("\nDigite um numero: ");
		num1 = leia.nextInt();
		System.out.println("\nDigite um numero: ");
		num2 = leia.nextInt();
		System.out.println("\nDigite um numero: ");
		num3 = leia.nextInt();
		
		if (num1>num2 && num1>3)
		{
			System.out.println("\nO maior numero �: "+num1);
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println("\nO maior numero �: "+num2);
		}
		else
		{
			System.out.println("\nO maior numero �: "+num3);
		}

	}

}
