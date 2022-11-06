/*3. Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o aluno foi aprovado,
 *  se o valor da média escolar for maior ou igual a 5. Se o aluno não foi aprovado, indicar uma mensagem informando esta condição.
 *   Apresentar junto das mensagens o valor da média do aluno para qualquer condição.*/

package tarefa06;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		float nota1 = sc.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		float nota2 = sc.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		float nota3 = sc.nextFloat();
		
		System.out.println("Digite a quarta nota: ");
		float nota4 = sc.nextFloat();

		float mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;

		if (mediaFinal >= 5) {
			
			System.out.println("O aluno foi aprovado com a media: " + mediaFinal);
			
		} 
		
		else {

			System.out.println("O aluno foi reprovado com a media: " + mediaFinal);

		}

		sc.close();
	}

}
