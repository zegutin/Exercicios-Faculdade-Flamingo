/*10) Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B, 
e efetuar a troca dos valores de forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o 
valor da variável A. Apresentar os valores trocados.*/

package tarefa03;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite valor de A:");
		String valor1 = sc.nextLine();

		System.out.println("Digite valor de B:");
		String valor2 = sc.nextLine();

		
		String auxiliar = valor1;
		valor1 = valor2;

		System.out.println("Os valores foram invertidos, valor A agora é: " + valor1
				+ "\nO valor B agora é: " + auxiliar);

		sc.close();
	}

}
