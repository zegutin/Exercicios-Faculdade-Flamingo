/*9) A jornada de trabalho semanal de um funcionário é de 40 horas.
 * O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
 *  Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário,
 *   que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).*/

package tarefa05;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número de horas trabalhadas durante o mês:");
		float horasMes = sc.nextFloat();

		System.out.println("Digite o valor de seu salário por hora:");
		float salarioHora = sc.nextFloat();

		float salario = horasMes * salarioHora;

		if (horasMes > 160) {
			
			float salarioHoraExtra = (horasMes - 160) * (50*salarioHora/100) + salario;
			
			System.out.println("O seu salário mensal é R$" + salarioHoraExtra);
			
		} 
		
		else {
			
			System.out.println("O seu salário mensal é R$" + salario);
	
		}
		
		
		sc.close();
	}

}
