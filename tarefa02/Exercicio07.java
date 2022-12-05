/*7) Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo. Dica a=b.h*/
package tarefa02;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite a base do retângulo");
		int base=sc.nextInt();
		
		System.out.println("Digite a altura do retângulo");		
		int altura=sc.nextInt();
		int area=base*altura;
				
				System.out.println("A área do retângulo é: " +area);
		sc.close();

	}

}
