/*10) Escreva um algoritmo para ler as dimens�es de um losango (diagonal maior, diagonal menor), calcular e escrever a �rea do losango. Dica a=D.d/2*/

package tarefa02;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a diagonal maior:");
		int DiagonalMaior = sc.nextInt();
		System.out.println("Digite a diagonal menor:");
		int DiagonalMenor = sc.nextInt();
		int area=DiagonalMaior*DiagonalMenor/2;
		System.out.println("A dimens�o do losango � de: " +area);

		sc.close();

	}

}
