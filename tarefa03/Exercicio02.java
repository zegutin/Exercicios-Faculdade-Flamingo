/*2) Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos.
 *  Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.*/

package tarefa03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número total de eleitores");
        float totalEleitoresMunicipio = sc.nextFloat();

		System.out.println("Digite o número total de votos brancos.");
        float votosBrancos = sc.nextFloat();

		System.out.println("Digite o número total de votos nulos.");
		float votosNulos = sc.nextFloat();

		System.out.println("Digite o número total de votos válidos.");
		int votosValidos = sc.nextInt();

		
		
		float porcentagemBrancos = votosBrancos/totalEleitoresMunicipio*100;
		float porcentagemNulos = votosNulos/totalEleitoresMunicipio*100;
		float porcentagemValidos = votosValidos/totalEleitoresMunicipio*100;

		
		
		System.out.println("A porcentagem dos votos brancos foi de: "+porcentagemBrancos+"%");

		System.out.println("A porcentagem dos votos nulos foi de: "+porcentagemNulos+"%");

		System.out.println("A porcentagem dos votos válidos foi de: "+porcentagemValidos+"%");

		sc.close();
	}

}
