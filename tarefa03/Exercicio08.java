/*8) Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12 Km por litro. 
 * Para obter o cálculo, o usuário deve fornecer o tempo gasto (TEMPO) e a velocidade média (VELOCIDADE) durante a viagem. 
Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA=TEMPO * VELOCIDADE. Possuindo o valor da distância, 
basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula LITROS_USADOS=DISTANCIA/12. Ao final, 
o programa deve apresentar os valores da velocidade média (VELOCIDADE), tempo gasto na viagem (TEMPO), 
a distancia percorrida (DISTANCIA) e a quantidade de litros (LITROS_USADOS) utilizada na viagem.*/

package tarefa03;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o valor do tempo gasto na viagem. (Expressa em minutos)");
		int tempoGasto = sc.nextInt();

		System.out.println("Digite a velocidade média utilizada durante a viagem.");
		int velocidadeMedia = sc.nextInt();

		float distanciaPercorrida = tempoGasto * velocidadeMedia;

		float litrosGasolinaGasto = distanciaPercorrida / 12;

		System.out.println("A velocidade média utilizada durante a viagem foi de: " + velocidadeMedia+" Km/h");

		System.out.println("\nO tempo utilizado durante a viagem foi de: " + tempoGasto);

		System.out.println("\nA distancia percorrida durante a viagem foi de: " + distanciaPercorrida);

		System.out.println("\nA quantidade de Litros utilizada durante a viagem foi de: " + litrosGasolinaGasto);

		sc.close();
	}

}
