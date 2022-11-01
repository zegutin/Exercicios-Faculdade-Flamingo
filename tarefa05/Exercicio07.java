//7) Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.

package tarefa05;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número:");
		int numero1 = sc.nextInt();

		System.out.println("Digite um número:");
		int numero2 = sc.nextInt();
		
		if (numero1>numero2) {
			
			System.out.println("Os números em forma crescente: "+numero2+","+numero1);
			
		}
		else if (numero1==numero2) {
			
			System.out.println("ERROR 404 \nNão é permitido usar números iguais.");
			
		}
		
		else {
			
			System.out.println("Os números em forma crescente: "+numero1+ ","+numero2);
			
		}

		sc.close();
		
		
	}

}
