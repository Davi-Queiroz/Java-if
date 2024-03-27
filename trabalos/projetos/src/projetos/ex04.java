package projetos;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x, y;
		
		System.out.println("Qual o valor de X: ");
		x = in.nextDouble();
		
		if(x>5) {
		y = 8/(Math.sqrt(Math.pow(x,2)-25));
		System.out.println(y);
		}
		else {
			System.out.println("Numero Invalido");
		}
		
	}

}
