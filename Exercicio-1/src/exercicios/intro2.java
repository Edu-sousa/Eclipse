package exercicios;

import java.util.Scanner;

public class intro2 {
	//Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
	//expressa em anos, meses e dias.
	public static void main(String[] Args)
	{
		int totalDia,mes,ano,dia;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva a quantidade de dias");
		totalDia = leia.nextInt();
		
		ano = totalDia/365;
		mes =(totalDia%365)/30;
		dia =(totalDia%365)/30;
		
		System.out.println("\nVocê viveu: "+ano+" Anos, "+mes+" Meses e "+dia+" Dias");
	}
}
