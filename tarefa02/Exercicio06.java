/*6) Escreva um algoritmo para ler dois valores do teclado e exibir como resposta a divisão dos valores.*/

package tarefa02;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o dividendo:");
		float dividendo = sc.nextFloat();

		System.out.println("Digite o divisor:");
		float divisor = sc.nextFloat();

		float quociente = dividendo / divisor;

		System.out.println(dividendo + "/" + divisor);

		System.out.println("R: " + quociente);

		sc.close();
	}

}
