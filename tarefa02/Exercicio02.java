/*2) Escreva um algoritmo para ler um valor do teclado e exibir como resposta o número antecessor.*/

package tarefa02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número que deseja saber seu antecessor:");
		int numero1 = sc.nextInt();

		int antecessor = numero1 - 1;

		System.out.println("O número digitado foi " + numero1 + " seu antecessor é " + antecessor);

		sc.close();
	}

}
