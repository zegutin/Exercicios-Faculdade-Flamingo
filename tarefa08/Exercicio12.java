package tarefa08;

import javax.swing.JOptionPane;

public class Exercicio12 {

	/*
	 * 12) Elaborar um programa que efetue a leitura de valores positivos inteiros
	 * até que um valor negativo seja informado. Ao final devem ser apresentados o
	 * maior e o menor valores informados pelo usuário.
	 */

	public static void main(String[] Args) {

		int num = 0, cont = 0, men_valor, mai_valor;
		num = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Digite um numero", "Numero", JOptionPane.QUESTION_MESSAGE));
		men_valor = num;
		mai_valor = num;
		do {
			if (num >= 0) {
				if (num > mai_valor) {
					mai_valor = num;
				}
				if (num < men_valor) {
					men_valor = num;
				}
				cont++;
			}
			num = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Digite um numero", "Numero", JOptionPane.QUESTION_MESSAGE));
		} while (num >= 0);
		System.out.println("A quantidade de numeros digitados é " + cont);
		System.out.println("O maior valor digitado foi: " + mai_valor);
		System.out.println("O menor valor digitado foi: " + men_valor);
	}
}
