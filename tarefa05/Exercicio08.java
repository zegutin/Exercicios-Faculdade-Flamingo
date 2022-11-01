/*8) Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) 
 * e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e 
 * que o jogo pode iniciar em um dia e terminar no dia seguinte.*/

package tarefa05;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a horário de início da partida:");
		int inicioPartida = sc.nextInt();

		System.out.println("Digite a horário do final da partida:");
		int fimPartida = sc.nextInt();

		int duracaoPartida = fimPartida - inicioPartida;

		if (duracaoPartida < 0) {
			
			duracaoPartida = duracaoPartida + 24;
			
			System.out.println("A duração da partida foi de: " + duracaoPartida+ ":00 Horas");
			
		} 
		
		else {
			
			System.out.println("A duração da partida foi de: " + duracaoPartida+ ":00 Horas");
		
		}
		
		sc.close();
	}

}
