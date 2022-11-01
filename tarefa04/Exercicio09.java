/*9) Ler o valor correspondente ao salário mensal (variável SM) de um trabalhador
*  e também o valor do percentual de reajuste (variável PR) a ser atribuído. Apresentar o valor do novo salário (variável NS).*/

package tarefa04;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do salário mensal:");
		float salarioMensal = sc.nextFloat();

		System.out.println("Digite o valor da porcentagem de reajuste.");
		float porcetagemReajuste = sc.nextFloat();

		float novoSalario = salarioMensal / 100 * porcetagemReajuste + salarioMensal;

		System.out.println("Após o reajuste seu novo salário é de: R$" + novoSalario);
		sc.close();
	}

}
