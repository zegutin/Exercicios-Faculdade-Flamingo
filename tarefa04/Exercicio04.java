/*4) Elaborar um programa que efetue a apresentação do valor da conversão em real de um valor lido em dólar.
O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares disponível com o usuário,
para que seja apresentado o valor em moeda brasileira.*/

package tarefa04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a cotação do dolar na data de hoje:");
		float cotacaoDolar = sc.nextFloat();

		System.out.println("Digite quantos dolares você deseja converter em reais:");
		float saldoDolar = sc.nextFloat();

		float valorConvertidoReal = saldoDolar / cotacaoDolar;

		System.out.println("Seus dolares convertidos em reais deu o valor de: R$" + valorConvertidoReal);

		sc.close();
	}

}
