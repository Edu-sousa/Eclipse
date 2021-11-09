package exercicios;

import java.util.Scanner;

public class intro3 {
	//Faça um sistema que leia o tempo de duração de um evento em uma fábrica
	//expressa em segundos e mostre-o expresso em horas, minutos e segundos.
	public static void main(String[] Args)
	{
		int totalSeg,hora,min,seg;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva a duração do Evento: ");
		totalSeg =leia.nextInt();
		
		min = totalSeg/60;
		hora = min/60;
		seg = totalSeg - min*60;
		
		System.out.println("\nO Evento durou: "+hora+" Horas, "+min+" Minutos e "+seg+" Segundos");
	}
}
