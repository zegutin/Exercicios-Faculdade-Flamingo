/*9) Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, 
 * utilizando a fórmula PRESTACAO=VALOR+(VALOR*TAXA/100)*TEMPO).*/

package tarefa03;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da prestação:");
		float valorPrestacao = sc.nextFloat();

		System.out.println("Digite o valor da taxa de juros:");
		float taxa = sc.nextFloat();

		System.out.println("Digite a quantidade de dias em atraso:");
		float diasAtraso = sc.nextFloat();

		float prestacao = valorPrestacao + (valorPrestacao * taxa / 100) * diasAtraso;

		System.out.println("O valor prestação devido ao atraso ficou no valor de R$" + prestacao);

		sc.close();
	}

}
