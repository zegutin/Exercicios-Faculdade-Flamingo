//1) Ler um valor e escrever se é positivo, negativo ou zero.

package tarefa07;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero:");
		float numero01 = sc.nextFloat();

		if (numero01 > 0) {
			
			System.out.println("Você digitou um número positivo");
			
		} 
		
		else if (numero01 == 0) {
			
			System.out.println("Você digitou zero");
			
		} 
		
		else {
			
			System.out.println("Você digitou um número negativo");
			
		}

		sc.close();
		
		
	}

}
