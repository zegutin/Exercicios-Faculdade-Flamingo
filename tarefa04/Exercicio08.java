/*8) Elaborar um programa de computador que efetue a leitura de quatro valores inteiros (variáveis A, B, C e D).
 *  Ao final o programa deve apresentar o resultado do produto (variável P) do primeiro com o terceiro valor e 
 *  o resultado da soma (variável S) do segundo com o quarto valor.*/

package tarefa04;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de A.");
		int valorA = sc.nextInt();

		System.out.println("Digite o valor de B.");
		int valorB = sc.nextInt();

		System.out.println("Digite o valor de C.");
		int valorC = sc.nextInt();

		System.out.println("Digite o valor de D.");
		int valorD = sc.nextInt();

		int resultadoProduto = valorA * valorC;

		int resultadoSoma = valorB + valorD;

		System.out.println("O Resultado do produto é : " + resultadoProduto);
		System.out.println("O Resultado da soma é : " + resultadoSoma);

		sc.close();
	}

}
