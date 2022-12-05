//3) Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.

package tarefa07;

import java.util.Scanner;

public class Exercicio03_INCOMPLETO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int contadora = 0;
		int primeiroMaiorNumero = 0;
		int segundoMaiorNumero = 0;
        int menorNumero=0;
		
		while (contadora < 3) {
			System.out.println("Digite um numero:");
			int numero = sc.nextInt();
			contadora++;

			if (contadora == 1) {
				primeiroMaiorNumero = numero;
				segundoMaiorNumero = numero;
				menorNumero=numero;
			}
			if (numero > primeiroMaiorNumero) {
				primeiroMaiorNumero = numero;
			}
		    if (numero< menorNumero) {
				menorNumero=numero;
			}
		    else if (segundoMaiorNumero>numero && segundoMaiorNumero<primeiroMaiorNumero) {
				segundoMaiorNumero=numero;
			}

		}
		int soma = primeiroMaiorNumero+segundoMaiorNumero;
		System.out.println("O maior número é: " +soma);

		sc.close();

	}

}
