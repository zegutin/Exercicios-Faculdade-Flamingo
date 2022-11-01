/*5) Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
 * A fórmula de conversão é F = (9*C + 160)/5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.*/

package tarefa03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a temperatura em graus celsius.");
		float grausCelsius = sc.nextFloat();

		float grausFahrenheit = (9 * grausCelsius + 160) / 5;

		System.out.println("Temperatura em graus celsius:" + grausCelsius + "°C ");

		System.out.println("A temperatura convertida para fahrenheit é de " + grausFahrenheit + "°F");

		sc.close();
	}

}
