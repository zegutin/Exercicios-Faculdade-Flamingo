package tarefa03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de fabrica do veiculo:");
		float valorFabrica = sc.nextFloat();

		float valorDistribuidora = valorFabrica * 28 / 100;
		float ValorImposto = valorFabrica * 45 / 100;
		float valorFinalVeiculo = valorFabrica + valorDistribuidora + ValorImposto;

		System.out.println("O valor da distribuidora é de R$" + valorDistribuidora);

		System.out.println("O valor dos impostos é de R$" + ValorImposto);

		System.out.println(
				"O valor final do veiculo com os custos de impostos + distribuidora é de R$" + valorFinalVeiculo);

		sc.close();
	}

}
