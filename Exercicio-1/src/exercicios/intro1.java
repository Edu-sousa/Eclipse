package exercicios;

import java.util.Scanner;

public class intro1 {
	//Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
	//dias e mostre-a expressa apenas em dias.
	  public static void main(String[] Args) 
	  {		 		  
		  int ano,mes,dia,totalDias;		  
		  Scanner leia = new Scanner(System.in);
		  
		  System.out.println("\nQuantos anos voc� tem: ");
		  ano = leia.nextInt();
		  System.out.println("\nQuantos meses voc� tem: ");
		  mes = leia.nextInt();
		  System.out.println("\nQuantos dias voc� tem: ");
		  dia = leia.nextInt();
		  
		  totalDias = ano*365+mes*30+dia;
		  System.out.println("\nVoc� ja viveu: "+totalDias+" Dias.");
	  }	  
}

 