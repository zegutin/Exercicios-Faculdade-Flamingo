/*6) Elaborar um programa que efetue a leitura de três valores (A, B e C) 
 * e apresente como resultado final à soma dos quadrados dos três valores lidos.*/

package tarefa04;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite valor de A:");
		int valorA = sc.nextInt();

		System.out.println("Digite valor de B:");
		int valorB = sc.nextInt();

		System.out.println("Digite valor de C:");
		int valorC = sc.nextInt();

		double resultado = Math.pow(valorA, 2) + Math.pow(valorB, 2) + Math.pow(valorC, 2);
		
		System.out.println("Resultado da soma dos quadrados: "+resultado);
		sc.close();
	}

}
