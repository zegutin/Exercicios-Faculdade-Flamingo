/*7) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: Volume = π*Raio2*Altura*/

package tarefa03;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do raio da lata de óleo.");
		double raioLataOleo = sc.nextDouble();

		System.out.println("Digite o valor da altura da lata de óleo.");
		double alturaLataOleo = sc.nextDouble();

		double volumeLataOleo = Math.PI * Math.pow(raioLataOleo, 2) * alturaLataOleo;

		System.out.println("O valor do volume da lata de óleo é de: " + volumeLataOleo);
		
		
		sc.close();
	}

}
