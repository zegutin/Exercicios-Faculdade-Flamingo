//7. Efetuar a leitura de quatro números inteiros e apresentar os números que são divisíveis por 2 e 3.

package tarefa06;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite valor de A:");
		int valorA = sc.nextInt();

		System.out.println("Digite valor de B:");
		int valorB = sc.nextInt();

		System.out.println("Digite valor de C:");
		int valorC = sc.nextInt();

		System.out.println("Digite valor de D:");
		int valorD = sc.nextInt();

		int valorADivivivel = (valorA % 2) + (valorA % 3);
		int valorBDivivivel = (valorB % 2) + (valorB % 3);
		int valorCDivivivel = (valorC % 2) + (valorC % 3);
		int valorDDivivivel = (valorD % 2) + (valorD % 3);

		if (valorADivivivel == 0) {

			System.out.println("O valor " + valorA + " é divisivel por 2 e 3");

		}

		if (valorBDivivivel == 0) {

			System.out.println("\nO valor " + valorB + " é divisivel por 2 e 3");

		}

		if (valorCDivivivel == 0) {

			System.out.println("\nO valor " + valorC + " é divisivel por 2 e 3");

		}

		if (valorDDivivivel == 0) {

			System.out.println("\nO valor " + valorD + " é divisivel por 2 e 3");

		}
		sc.close();
	}

}
