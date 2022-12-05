/*9) Escreva um algoritmo para ler as dimensões de um quadrado (lado), calcular e escrever a área do quadrado. Dica a=l²*/

package tarefa02;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Digite a metragem de um lado do quadrado");
		int lado=sc.nextInt();
		int resultado=lado*4;
		System.out.println("A área de um quadrado é: " +resultado);
		
		sc.close();	

	}

}
