package tarefa10;

public class Exercicio01 {

	/* 1) Apresentar os quadrados dos números inteiros de 15 a 200. */

	public static void main(String[] Args) {

		int i, quad;// Declara as variáveis i (contador de looping) e quad(Que receberá os quadrados
					// de i)
		for (i = 15; i <= 200; i++) // contador para variar i de 15 até 200
		{
			quad = i * i; // quad recebe o valor de i ao quadrado
			System.out.println("O quadrado de " + i + " é " + quad); // imprime os quadrados
		}
	}
}
