/*5) Elaborar um programa que efetue a apresentação do valor da conversão em dólar de um valor lido em real.
 *  O programa deve solicitar o valor da cotação do dólar e também a quantidade de reais disponível com o usuário, 
 *  para que seja apresentado o valor em moeda americana.*/

package tarefa04;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a cotação do real na data de hoje:");
		float cotacaoReal = sc.nextFloat();

		System.out.println("Digite quantos reais você deseja converter em dolares:");
		float saldoReal = sc.nextFloat();

		float valorConvertidoDolar = saldoReal / cotacaoReal;

		System.out.println("Seus reais convertidos em dolares deu o valor de: $" + valorConvertidoDolar);

		sc.close();
	}

}
