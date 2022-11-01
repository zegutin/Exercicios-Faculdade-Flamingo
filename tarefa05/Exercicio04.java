/*4) Ler as notas da 1a. e 2a. avaliações de um aluno.
 * Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado
 *  (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada.*/

package tarefa05;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a nota da primeira avaliação:");
		float nota1 = sc.nextFloat();

		System.out.println("Digite a nota da segunda avaliação:");
		float nota2 = sc.nextFloat();
		
		float media = (nota1 + nota2) / 2;

		if (media >= 6) {
			
			System.out.println("Aluno foi aprovado \nCom a nota: " + media);
			
		} 
		
		else {
			
			System.out.println("Aluno foi reprovado \nCom a nota: " + media);
			
		}

		sc.close();
	}

}
