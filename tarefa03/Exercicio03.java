/*3) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. 
 * Calcular e escrever o valor do novo salário.*/

package tarefa03;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do seu salário atual.");
		float salarioAntigo = sc.nextFloat();

		System.out.println("Digite o percentagem de reajuste salarial.");
		float percentual = sc.nextFloat();

		float salarioAdicional = salarioAntigo / 100 * percentual;
		float salarioNovo = salarioAdicional + salarioAntigo;
		

		System.out.println("O valor do seu novo salário após o reajuste é: R$" + salarioNovo);
		
		sc.close();
	}
}
