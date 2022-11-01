/*1) Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10!*/

package tarefa05;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número:");
		float numero = sc.nextFloat();

		if (numero > 10) {
			
			System.out.println("O número " + numero + " é maior que 10");
		
		}

		else {
			
			System.out.println("O número " + numero + " é menor/igual a 10");
		
		}

		sc.close();
	}

}
