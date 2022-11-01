/*2) Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).*/

package tarefa05;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor:");
		int numero = sc.nextInt();

		if (numero < 0) {

			System.out.println("O número " + numero + " é negativo");

		}

		else {

			System.out.println("O número " + numero + " é positivo");

		}
		sc.close();
	}

}
