package laçoRepetição;

import java.util.Scanner;

/*
Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.
*/
public class exercicioWhile1 {
	public static void main(String [] args) {
		Scanner leia = new Scanner(System.in);
		int idade=0,totalMenor21Anos=0,totalMaior50Anos=0;
		
		while(idade!=-99)
		{
			System.out.println("Digite sua idade:");
			idade = leia.nextInt();
			
			if(idade<21)
			{
				totalMenor21Anos++;
			}
			else if(idade>50)
			{
				totalMaior50Anos++;
			}
		}
		System.out.println("\nTotal de pessoas com menos de 21 Anos: "+totalMenor21Anos);
		System.out.println("\nTotal de pessoas com mais de 50 Anos: "+totalMaior50Anos);
	}
}
