package projetos;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double prov1, prov2, trab1, trab2, trab3, med;
		System.out.println("Qual o valor da primeira prova: ");
		prov1 = in.nextDouble();
		
		System.out.println("Qual o valor da segunda prova: ");
		prov2 = in.nextDouble();
		
		System.out.println("Qual o valor do primeiro trabalho: ");
		trab1 = in.nextDouble();
		
		System.out.println("Qual o valor do segundo trabalho: ");
		trab2 = in.nextDouble();
		
		System.out.println("Qual o valor do terceiro trabalho: ");
		trab3 = in.nextDouble();
		
		med = (prov1+prov2)/2 * 0.70 + (trab1+trab2+trab3)/3 * 0.3;
		System.out.println("Sua media foi: "+med);
		System.out.print("Voce foi ");
		
		if(med >= 7) {
			System.out.println("Aprovado");
		}
		else {
			System.out.println("Reprovado");
		}

	}

}
