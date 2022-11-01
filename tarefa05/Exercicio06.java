//6) Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.

package tarefa05;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número:");
		int numero1 = sc.nextInt();

		System.out.println("Digite um número:");
		int numero2 = sc.nextInt();
		
		if (numero1>numero2) {
			
			System.out.println("O número maior é: "+numero1);
			
		}
		else if (numero1==numero2) {
			
			System.out.println("ERROR 404 \nNão é permitido usar números iguais.");
			
		}
		
		else {
			
			System.out.println("O número maior é: "+numero2);
			
		}

		sc.close();
	}

}
