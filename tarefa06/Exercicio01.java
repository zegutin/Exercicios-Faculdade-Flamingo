//1) Ler dois valores numéricos inteiros e apresentar o resultado da diferença do maior pelo menor valor.

package tarefa06;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int valor1 = sc.nextInt();

		System.out.println("Digite o segundo valor: ");
		int valor2 = sc.nextInt();

		if (valor1 > valor2) {
			
			System.out.println("A diferencia entre os dois valores digitados é: " + (valor1 - valor2));
			
		} else {
			
			System.out.println("A diferencia entre os dois valores digitados é: " + (valor2 - valor1));
		
		}

		sc.close();
	}

}
