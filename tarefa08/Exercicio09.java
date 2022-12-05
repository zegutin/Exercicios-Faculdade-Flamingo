package tarefa08;

import java.util.Scanner;

public class Exercicio09 {

	/*
	 * 9) Elaborar um programa que efetue a leitura de 10 valores numéricos e
	 * apresente no final o total do somatório e a média aritmética dos valores
	 * lidos.
	 */

	public static void main(String[] Args) {

		Scanner sc = new Scanner (System.in);
		
		float numero01 = sc.nextFloat();
		float numero02 = sc.nextFloat();
		float numero03 = sc.nextFloat();
		float numero04 = sc.nextFloat();
		float numero05 = sc.nextFloat();
		float numero06 = sc.nextFloat();
		float numero07 = sc.nextFloat();
		float numero08 = sc.nextFloat();
		float numero09 = sc.nextFloat();
		float numero010 = sc.nextFloat();
		
		
		float somatoria = numero01+numero02+numero03+numero04+numero05+numero06+numero07+numero08+numero09+numero010;
		float mediaAritmetica = somatoria/10;
		
		
		System.out.println("A soma dos 10 valores é: "+somatoria+", e a Média aritmedica é: "+mediaAritmetica);
		
		sc.close();
	}
}
