/*6) Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius.
 *  A fórmula deconversão é C=(F-32)*(5/9), sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.*/

package tarefa03;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a temperatura em graus fahrenheit:");
		float grausFahrenheit = sc.nextFloat();

		float grausCelsius = (grausFahrenheit - 32) * 5 / 9;

		System.out.println("Temperatura em fahrenheit: " + grausFahrenheit + "°F");
		System.out.println("A temperatura convertida para celsius é de: " + grausCelsius + "°C");

		sc.close();
	}

}
