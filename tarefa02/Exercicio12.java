/*12) Escreva um algoritmo para ler as dimens�es de um circulo (raio), calcular e escrever a �rea do circulo. a=pi*r�*/

package tarefa02;

import java.util.Scanner;

public class Exercicio12 {


	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	System.out.println("Digite o raio do circulo:");
	double raio=sc.nextDouble();
	double pi = Math.PI;

			double resultado=pi*raio*raio;
			System.out.println("A dimens�o do "+resultado);
			
	sc.close();
		

	}

}
