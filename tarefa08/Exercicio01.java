package tarefa08;

import java.util.Scanner;

public class Exercicio01{

	/*
	 * 1) Apresentar os resultados de uma tabuada de multiplicar (de 1 at� 10) de um
	 * n�mero qualquer.
	 */

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite qual Tabuada deseja: ");
		int escolhaTabuada = sc.nextInt();

		int contador = 0;

		while (contador <= 10) {

			int resultado = contador * escolhaTabuada;
			System.out.println(contador + " X " + escolhaTabuada + " = " + resultado);
			contador++;

		}
		sc.close();
	}
}
