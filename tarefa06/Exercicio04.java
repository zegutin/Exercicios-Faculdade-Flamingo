/*4. Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o aluno foi aprovado, 
 * se o valor da média escolar for maior ou igual a 7. Se o valor da média for menor que 7,
 * solicitar a nota de exame, somar com o valor da média e obter nova média. Se a nova média for maior ou igual a 5,
 * apresentar uma mensagem dizendo que o aluno foi aprovado em exame.
 * Se o aluno não foi aprovado, indicar uma mensagem informando esta condição. 
 * Apresentar com as mensagens o valor da média do aluno, para qualquer condição.*/

package tarefa06;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da primeira nota:");
		float valorNota1 = sc.nextFloat();
		
		System.out.println("Digite o Valor da segunda Nota:");
		float valorNota2 = sc.nextFloat();
		
		System.out.println("Digite o Valor da Terceira Nota:");
		float valorNota3 = sc.nextFloat();
		
		System.out.println("Digite o Valor da Quarta Nota:");
		float valorNota4 = sc.nextFloat();
		

		float media = (valorNota1 + valorNota2 + valorNota3 + valorNota4) / 4;

		if (media >= 7) {
			
			System.out.println("O aluno foi aprovado com a media: " + media);
			
		} 
		
		else if (media < 7) {
			
			System.out.println("Digite o valor da nota do exame:");
			float valorNotaExame = sc.nextFloat();
			
			float mediaComExame = (media + valorNotaExame) / 2;
			
			if (mediaComExame >= 5) {
				
				System.out.println("O aluno foi aprovado no exame: " + mediaComExame);
				
			}
			
			else {
				
				System.out.println("O aluno foi reprovado no exame: " + mediaComExame);
				
			}
		}
		sc.close();
	}

}
