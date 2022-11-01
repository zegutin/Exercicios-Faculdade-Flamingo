/*10) Em uma eleição sindical concorreram ao cargo de presidente três candidatos (A, B e C). 
Durante a apuração dos votos foram computados votos nulos e votos em branco, além dos votos válidos para cada candidato.
Deve ser criado um programa de computador que efetue a leitura da quantidade de votos válidos para cada candidato,
além de efetuar também a leitura da quantidade de votos nulos e votos em branco. 
Ao final o programa deve apresentar o número total de eleitores, considerando votos válidos, nulos e em branco;
o percentual correspondente de votos válidos em relação à quantidade de eleitores; 
o percentual correspondente de votos válidos do candidato A em relação à quantidade de eleitores; 
o percentual correspondente de votos válidos do candidato B em relação à quantidade de eleitores; 
o percentual correspondente de votos válidos do candidato C em relação à quantidade de eleitores; 
o percentual correspondente de votos nulos em relação à quantidade de eleitores; 
e por último o percentual correspondente de votos em branco em relação à quantidade de eleitores.*/

package tarefa04;

import java.util.Scanner;

public class Exercicio10_INCOMPLETO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// CANDIDATO A
		System.out.println("Digite a quantidade de votos válidos para o candidato A:");
		float votosCadidatoA = sc.nextInt();

		// CANDIDATO B
		System.out.println("Digite a quantidade de votos válidos para o candidato B:");
		float votosCadidatoB = sc.nextInt();

		// CANDIDATO C
		System.out.println("Digite a quantidade de votos válidos para o candidato C:");
		float votosCadidatoC = sc.nextInt();

		System.out.println("Digite a quantidade total de votos nulos:");
		float votosNulos = sc.nextInt();

		System.out.println("Digite a quantidade total de votos brancos:");
		float votosBrancos = sc.nextInt();

		float totalVotosValidosEleitores = votosCadidatoA + votosCadidatoB + votosCadidatoC;
		float totalVotosEleitores= votosCadidatoA + votosCadidatoB + votosCadidatoC + votosBrancos + votosNulos;
		
		// PERCENTUAL DE VOTOS VALIDOS
		float porcentualVotosValidosEleitores = totalVotosValidosEleitores / totalVotosEleitores * 100;

		// PERCENTUAL DE VOTOS CANDIDATOS A, B e C
		float percentualVotosValidosA = votosCadidatoA / totalVotosValidosEleitores * 100;
		float percentualVotosValidosB = votosCadidatoB / totalVotosValidosEleitores * 100;
		float percentualVotosValidosC = votosCadidatoC / totalVotosValidosEleitores * 100;

		// PORCENTUAL DE VOTOS NULOS
		float percentualVotosNulos = totalVotosValidosEleitores / votosNulos * 100;
		
		// PORCENTUAL DE VOTOS BRANCOS
		float percentualVotosBrancos = totalVotosValidosEleitores / votosBrancos * 100;

		
		System.out.println("RESULTADO DA ELEIÇÃO");
		
		//TOTAL DE ELEITORES
		System.out.println("Tivemos o total de "+totalVotosEleitores+" votos de eleitores nessa eleição");
		
		//TOTAL DE VOTOS VALIDOS
		System.out.println("\nO total de votos validos foi de :"+totalVotosValidosEleitores);
		
		//TOTAL DE VOTOS NULOS
		System.out.println("\nO total de votos nulo foi de:"+votosNulos);
		
		//TOTAL DE VOTOS BRANCOS
		System.out.println("\nO total de votos brancos foi de:"+votosBrancos);
		
		//PECENTUAL DE VOTOS VALIDOS
		System.out.println("\nO Porcentual de votos validos em relação a quantidade de eleitores foi de:"+porcentualVotosValidosEleitores+"%");
		
		//RESULTADO CADIDATO A
		System.out.println("\nResultado candidato A");
		System.out.println("\nA quantidade de votos válidos do candidato A é de: " + votosCadidatoA
				+ " \nE sua porcentagem sobre o total Votos é de: " + percentualVotosValidosA+"\n");

		//RESULTADO CADIDATO B
		System.out.println("\nResultado candidato B");
		System.out.println("A quantidade de votos válidos do candidato B é de: " + votosCadidatoB
				+ " E sua porcentagem sobre o total Votos é de: " + percentualVotosValidosB);

		//RESULTADO CADIDATO C
		System.out.println("\nResultado candidato C");
		System.out.println("A quantidade de votos válidos do candidato C é de: " + votosCadidatoC
				+ " E sua porcentagem sobre o total Votos é de: " + percentualVotosValidosC);

		//RESULTADO VOTOS NULOS
		System.out.println("A quantidade total de votos Nulos é de: " + votosNulos
				+ " E sua porcentagem sobre o total de Eleitores é de: " + percentualVotosNulos);
		
		//RESULTADO VOTOS BRANCOS
		System.out.println("A quantidade total de votos Brancos é de: " + votosBrancos
				+ " E sua porcentagem sobre o total de Eleitores é de: " + percentualVotosBrancos);
		sc.close();
	}

}
