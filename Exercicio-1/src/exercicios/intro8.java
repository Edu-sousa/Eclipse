package exercicios;

import java.util.Scanner;

public class intro8 {
	/*
	O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
	percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
	Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
	escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
	consumidor.
	*/

	public static void main(String[] args) {
		double custoFabrica,custoConsumidor,distribuidor,impostos;
		
		
		Scanner leia =new Scanner(System.in);
		
		System.out.println("\nDigite o custo de fabrica do carro: ");
		custoFabrica = leia.nextDouble();
		
		distribuidor = custoFabrica*0.28;
		impostos = custoFabrica*0.45;
		custoConsumidor = custoFabrica+distribuidor+impostos;
		System.out.println("\nPara o consumidor o carro custara: "+custoConsumidor);
		
		
		
		

	}

}
