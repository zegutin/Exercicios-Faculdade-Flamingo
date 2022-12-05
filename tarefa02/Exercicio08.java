/*8) Escreva um algoritmo para ler as dimensões de um triângulo (base e altura), calcular e escrever a área do triângulo. Dica a=b.h/2*/

package tarefa02;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a base do triâgulo");
		int base=sc.nextInt();
		System.out.println("Digite a altura");
		int altura=sc.nextInt();
		int resultado=base*altura/2;
		System.out.println("A dimensão de um triângulo é: " +resultado);
		sc.close();
		

	}

}
