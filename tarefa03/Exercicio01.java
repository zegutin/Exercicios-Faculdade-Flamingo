/*1) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa
 *  apenas em dias. Considerar ano com 365 dias e mês com 30 dias.*/

package tarefa03;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos anos você possui: ");
		int anos = sc.nextInt();
		
		System.out.println("Digite a quantidade de meses completos vividos ");
		int meses = sc.nextInt();
		
		System.out.println("Digite a quantidade de dias passados do ultimo MêsVersário: ");
		int dias = sc.nextInt();
		
		int diasVividos = anos*365+meses*30+dias;
		
		System.out.println("A sua idade expressa em dias vividos é: " + diasVividos);

		
		sc.close();
	}

}
