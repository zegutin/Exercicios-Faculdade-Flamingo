//2) Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

package tarefa07;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int contadora = 0;
		int maiorNumero = 0;

		while (contadora < 3) {
			System.out.println("Digite um numero:");
			int numero = sc.nextInt();
			contadora++;

			if (contadora == 1) {
				maiorNumero = numero;
			}
			if (numero > maiorNumero) {
				maiorNumero = numero;
			}

		}
		System.out.println("O maior número é: " + maiorNumero);

		sc.close();
	}

}
