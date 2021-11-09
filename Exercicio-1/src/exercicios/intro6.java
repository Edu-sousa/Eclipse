package exercicios;

import java.util.Scanner;

public class intro6 {
	/*
	Construa um programa em c que, tendo como dados de entrada dois pontos
	quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula

	que efetua tal cálculo é:
	*/

	public static void main(String[] args) {
		int x1,x2,y1,y2;
		double d;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um numero: ");
		x1 = leia.nextInt();
		System.out.println("\nEntre com um numero: ");
		x2 = leia.nextInt();
		System.out.println("\nEntre com um numero: ");
		y1 = leia.nextInt();
		System.out.println("\nEntre com um numero: ");
		y2 = leia.nextInt();
		
		d = Math.sqrt((x2-x1)*2+(y2-y1)*2);
		System.out.println("\nA distância entre eles é: "+d);	
	}

}
