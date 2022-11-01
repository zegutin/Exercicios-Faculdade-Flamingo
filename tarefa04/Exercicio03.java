/*3) Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da diferença do primeiro valor pelo segundo.*/

package tarefa04;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de A:");
		int valor1 = sc.nextInt();

		System.out.println("Digite o valor :");
		int valor2 = sc.nextInt();

		double resultado = Math.pow(valor1, 2) - Math.pow(valor2, 2);

		System.out.println("O resultado do quadrado da diferença do primeiro valor pelo segundo é: " + resultado);

		sc.close();
	}

}
