/*8) Escreva um algoritmo para ler as dimens�es de um tri�ngulo (base e altura), calcular e escrever a �rea do tri�ngulo. Dica a=b.h/2*/

package tarefa02;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a base do tri�gulo");
		int base=sc.nextInt();
		System.out.println("Digite a altura");
		int altura=sc.nextInt();
		int resultado=base*altura/2;
		System.out.println("A dimens�o de um tri�ngulo �: " +resultado);
		sc.close();
		

	}

}
