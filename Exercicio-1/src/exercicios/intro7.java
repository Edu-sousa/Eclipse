package exercicios;

import java.util.Scanner;

public class intro7 {
	/*
	 Um sistema de equações lineares do tipo:, pode ser resolvido segundo mostrado abaixo :
Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x e y.
	 */
	public static void main(String[] args) {
		int a,b,c,d,e,f,x,y;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o valor de A: ");
		a = leia.nextInt();
		System.out.println("\nDigite o valor de B: ");
		b = leia.nextInt();
		System.out.println("\nDigite o valor de C: ");
		c = leia.nextInt();
		System.out.println("\nDigite o valor de D: ");
		d = leia.nextInt();
		System.out.println("\nDigite o valor de E: ");
		e = leia.nextInt();
		System.out.println("\nDigite o valor de F: ");
		f = leia.nextInt();
		
		x = (c*e)-(b*f)/(a*e)-(b*d);
		y = (a*f)-(c*d)/(a*e)-(b*d);
		
		System.out.println("\nO valor de X é: "+x+" e o valor de Y é: "+y);

	}

}
