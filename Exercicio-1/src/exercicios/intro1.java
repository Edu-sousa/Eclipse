package exercicios;

import java.util.Scanner;

public class intro1 {
	//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
	//dias e mostre-a expressa apenas em dias.
	  public static void main(String[] Args) 
	  {		 		  
		  int ano,mes,dia,totalDias;		  
		  Scanner leia = new Scanner(System.in);
		  
		  System.out.println("\nQuantos anos você tem: ");
		  ano = leia.nextInt();
		  System.out.println("\nQuantos meses você tem: ");
		  mes = leia.nextInt();
		  System.out.println("\nQuantos dias você tem: ");
		  dia = leia.nextInt();
		  
		  totalDias = ano*365+mes*30+dia;
		  System.out.println("\nVocê ja viveu: "+totalDias+" Dias.");
	  }	  
}

 