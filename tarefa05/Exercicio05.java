/*5) Ler o ano atual e o ano de nascimento de uma pessoa.
 * Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).*/

package tarefa05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o ano de seu nascimento:");
		int anoNascimento = sc.nextInt();

		System.out.println("Digite o ano atual:");
		int anoAtual = sc.nextInt();

		int resultado = anoAtual - anoNascimento;

		if (resultado < 16) {

			System.out.println("Você não Podera votar! \nSó é permitido votar quem é maior de 16 anos, e você tem "
					+ resultado + " anos.");

		}

		else {

			System.out.println("Você podera votar! \nVocê tem " + resultado + " anos, você já pode votar.");

		}
		sc.close();
	}

}
