package laçoCondicional;

import java.util.Scanner;

public class exer2 {

	public static void main(String[] args) {
		//Faça um programa que entre com três números e coloque em ordem crescente.
	
		Scanner leia = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("\nDigite um numero: ");
		a = leia.nextInt();
		System.out.println("\nDigite um numero: ");
		b = leia.nextInt();
		System.out.println("\nDigite um numero: ");
		c = leia.nextInt();
		
		if(a>b && a>c && b>c)
		{
			System.out.println("\nA ordem dos numeros é: "+a+" ,"+b+" e "+c);
		}
		if(b>c && b>a && a>c)
		{
			System.out.println("\nA ordem dos numeros é: "+b+" ,"+a+" e "+c);
		}
		if(a>b && a>c && c>b)
		{
			System.out.println("\nA ordem dos numeros é: "+a+" ,"+c+" e "+b);
		}
		if(b>c && b>a && c>a)
		{
			System.out.println("\nA ordem dos numeros é: "+b+" ,"+c+" e "+b);
		}
		if(c>a && c>b && a>b)
		{
			System.out.println("\nA ordem dos numeros é: "+c+" ,"+a+" e "+b);
		}
		if(c>a && c>b && b>a)
		{
			System.out.println("\nA ordem dos numeros é: "+c+" ,"+b+" e "+a);
		}
	}

}
