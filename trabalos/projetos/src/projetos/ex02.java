package projetos;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double preco, desconto, npreco;
		
		System.out.println("Qual o valor do produto: ");
		preco = in.nextDouble();
		npreco = preco;
		if(preco > 1000) {
			desconto = 0.85;
			preco = preco * desconto;
			npreco = npreco - preco;
			System.out.println("Novo valor R$ " + preco);
			System.out.println("Você economizou R$"+npreco);
		}
		else {
			desconto = 0.92;
			preco = preco * desconto;
			npreco = npreco - preco;
			System.out.println("Novo valor R$" + preco);
			System.out.println("Você economizou R$"+ npreco);
		}

	}

}
