/*9) Escreva um algoritmo para ler as dimens�es de um quadrado (lado), calcular e escrever a �rea do quadrado. Dica a=l�*/

package tarefa02;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Digite a metragem de um lado do quadrado");
		int lado=sc.nextInt();
		int resultado=lado*4;
		System.out.println("A �rea de um quadrado �: " +resultado);
		
		sc.close();	

	}

}
