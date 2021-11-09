package exercicios;

import java.util.Scanner;

public class intro5 {
	/*
	  Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.
	 */
	public static void main(String[] args) {
		int nota1,nota2,nota3,mediaFinal;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite a primeira nota: ");
		nota1 = leia.nextInt();
		System.out.println("\nDigite a segunda nota: ");
		nota2 = leia.nextInt();
		System.out.println("\nDigite a terceira nota: ");
		nota3 = leia.nextInt();
		
		mediaFinal =nota1*2+nota2*3+nota3*5/3;
		System.out.println("\nA media do aluno foi: "+mediaFinal);
		}

}
