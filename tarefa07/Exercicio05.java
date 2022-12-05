package tarefa07;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A, B, C;

		System.out.print("Verificador de Triângulo\n\n");

		System.out.print("Digite o lado A=");
		A = sc.nextInt();

		System.out.print("Digite o lado B=");
		B = sc.nextInt();

		System.out.print("Digite o lado C=");
		C = sc.nextInt();

		if (A < B + C && B < A + C && C < A + B) {
			if (A == B && B == C) {
				System.out.print("O triângulo é Eqüilátero.");
			} else if (A == B || A == C || B == C) {
				System.out.print("O triângulo é Isósceles.");
			} else {
				System.out.print("O triângulo é Escaleno.");
			}
		} else {
			System.out.print("Os lados fornecidos não caracterizam um triângulo");
		}
		sc.close();
	}

}
