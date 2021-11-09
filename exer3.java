package laçoCondicional;

import java.util.Scanner;

public class exer3 {
	/*
	Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
	categoria ela se encontra:
	 10-14 infantil
	 15-17 juvenil
	 18-25 adulto
	*/
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int id;
		
		System.out.println("\nDigite a sua idade: ");
		id = leia.nextInt();
		
		if(id>=10 && id<=14)
		{
			System.out.println("\nCategoria Infantil");
		}
		else if (id>=15 && id<=17)
		{
			System.out.println("\nCategoria Juvenil");
		}
		else if(id>=18 && id<=25)
		{
			System.out.println("\nCategoria Adulta");
		}
		else {
			System.out.println("\nIdade Invalida");
		}
		
	}

}
