/*2. Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o número lido como sendo um valor positivo,
 *  ou seja, o programa deverá apresentar o módulo de um número fornecido.
 *   Lembre-se de verificar se o número fornecido é menor que zero; sendo, multiplique-o por -1.*/

package tarefa06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		int valor01 = sc.nextInt();

		if (valor01 < 0) {

			int valor02 = valor01 * (-1);

			System.out.println("O seu resultado convetido em positivo é igual a: " + valor02);

		} 
		
		else {

			System.out.println("O seu resultado não é necessário fazer conversão: " + valor01);

		}

		sc.close();
	}

}
