package la�oRepeti��o;

import java.util.Scanner;

/*
 * Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
 */

public class exercicioDoWhile2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero,contMultiplos3=0,somaNumerosMultiplos3=0,mediaNumerosMultiplos3=0;
		
		do
		{
			System.out.println("\nDigite um numero: ");
			numero = leia.nextInt();
			if(numero%3 == 0)
			{
				contMultiplos3++;
				somaNumerosMultiplos3 += numero;
				
				mediaNumerosMultiplos3 = somaNumerosMultiplos3/contMultiplos3;
				
			}
			
		}while(numero!=0);
		System.out.println("\nA media dos numeros multiplos de 3 �: "+mediaNumerosMultiplos3);
	}

}
