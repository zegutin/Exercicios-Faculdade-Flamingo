package tarefa10;

import java.util.Scanner;

public class Exercicio10 {

	/*
	 * 10) Elaborar um programa que apresente os valores de conversão de graus
	 * Celsius em Fahrenheit, de 10 em 10 graus, iniciando a contagem em 10 graus
	 * Celsius e finalizando em 100 graus Celsius. O programa deve apresentar os
	 * valores das duas temperaturas. A fórmula de conversão é F = (9*C+160)/5,
	 * sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Por favor indique um valor minimo:");
		float min = scanner.nextFloat();
		System.out.println("Agora indique um valor máximo:");
		float max = scanner.nextFloat();
		System.out.printf("Fahrenheit Celsius\n");
		for (float i = min; i <= max; i += .5) {
			System.out.printf("%6.2f     %6.2f%n", i, ((i - 32.0) * (5.0 / 9.0)));
		}
		scanner.close();
	}
}
