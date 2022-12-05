package tarefa08;

public class Exercicio02 {

	public static void main(String[] Args) {

		/*
		 * 2) Apresentar o total da soma obtida dos cem primeiros n�meros inteiros
		 * (1+2+3+4+...+98+99+100).
		 */

		int soma = 0;

		for (int i = 1; i <= 100; i++) {
			soma += i;
		}
		System.out.println("A soma dos 100 primeiros numeros �: " + soma);
	}
}
