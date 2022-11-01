/*3) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se foremcompradas pelo menos 12. 
Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.*/

package tarefa05;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de maças compradas:");
		int quantidadeMacasCompradas = sc.nextInt();

		if (quantidadeMacasCompradas > 11) {
			
			float valorMacas = quantidadeMacasCompradas * 1;
		
			System.out.println("O valor da compra foi de: R$ " + valorMacas);
		
		} 
		
		else {
			
			float valorMacas = quantidadeMacasCompradas * 1.30f;
			
			System.out.println("O valor da compra foi de: R$ " + valorMacas);
		
		}

		sc.close();
	}

}
