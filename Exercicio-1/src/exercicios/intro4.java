package exercicios;

import java.util.Scanner;

public class intro4 {
	//Escreva um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão:
	public static void main(String[] Args)
	{
		int a,b,c,r,s,d;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um numero: ");
		a = leia.nextInt();
		
		System.out.println("\nDigite um numero: ");
		b = leia.nextInt();
		
		System.out.println("\nDigite um numero: ");
		c = leia.nextInt();
		
		r = (a+b)*2;
		s = (b+c)*2;
		d = (r+s)/2;
		System.out.println("\nD é: "+d);	
	}
}
