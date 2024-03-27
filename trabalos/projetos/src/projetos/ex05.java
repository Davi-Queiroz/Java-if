package projetos;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double lad1, lad2, lad3;
		
		System.out.println("Qual o valor do 1° lado do triangulo");
		lad1=in.nextDouble();
		
		System.out.println("Qual o valor do 2° lado do triangulo");
		lad2=in.nextDouble();
		
		System.out.println("Qual o valor do 3° lado do triangulo");
		lad3=in.nextDouble();
		
		if(lad1 > lad2+lad3 || lad2> lad1+lad3 || lad3> lad1+lad2) {
			System.out.println("Esse triangulo  existe");
		}
		else {
			System.out.println("Esse triangulo NÃO existe");
		}
		
	}

}
