/*9. Elaborar um programa que efetue a leitura de um n�mero inteiro e apresentar uma mensagem 
informando se o n�mero � par ou �mpar.*/

package tarefa06;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um n�mero:");
		int numero=sc.nextInt();
		
		if (numero%2==0) {
			System.out.println("O n�mero "+numero+" � par");
		}
		
		else {
			System.out.println("O n�mero "+numero+" � impar");
		}
		
		sc.close();
	}

}
