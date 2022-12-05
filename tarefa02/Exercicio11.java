/*11) Escreva um algoritmo para ler as dimensões de um trapézio (base maior, base menor e altura), calcular e escrever a área do trapézio. a=(B+b).h/2*/

package tarefa02;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite Base maior");
		float BaseMaior=sc.nextFloat();
		System.out.println("Digite Base menor");
		float BaseMenor=sc.nextFloat();
		System.out.println("Digite a altura");
		float Altura=sc.nextFloat();
		float Area=(BaseMaior+BaseMenor)*Altura/2;
		
		System.out.println("A dimensão do seu trapézio é de: " +Area);
		
		sc.close();

	}

}
