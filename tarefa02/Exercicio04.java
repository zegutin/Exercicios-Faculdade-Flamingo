/*4) Escreva um algoritmo para ler dois valores do teclado e exibir como resposta a subtração dos valores.*/

package tarefa02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número:");
		int numero1 = sc.nextInt();

		System.out.println("Digite um número:");
		int numero2 = sc.nextInt();

		int resultado = numero1 - numero2;

		System.out.println(numero1 + " - " + numero2 + " = " + resultado);

		sc.close();
	}

}
