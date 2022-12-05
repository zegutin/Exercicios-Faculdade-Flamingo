/*12) Escreva um algoritmo para ler as dimensões de um circulo (raio), calcular e escrever a área do circulo. a=pi*r²*/

package tarefa02;

import java.util.Scanner;

public class Exercicio12 {


	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	System.out.println("Digite o raio do circulo:");
	double raio=sc.nextDouble();
	double pi = Math.PI;

			double resultado=pi*raio*raio;
			System.out.println("A dimensão do "+resultado);
			
	sc.close();
		

	}

}
