/*1) Escreva um algoritmo para ler um valor do teclado e exibir como resposta o número sucessor.*/

package tarefa02;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número:");
		int numero1 = sc.nextInt();

		int sucessor = numero1 + 1;

		System.out.println("O número sucessor " + numero1 + " é o número " + sucessor);

		sc.close();
	}

}
