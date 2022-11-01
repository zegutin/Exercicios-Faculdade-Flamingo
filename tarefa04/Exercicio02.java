/*2) Elaborar um programa que calcule e apresente o volume de uma caixa retangular, 
por meio da fórmula VOLUME=COMPRIMENTO * LARGURA * ALTURA.*/

package tarefa04;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);

System.out.println("Digite o comprimento do paralelepípedo:");
float comprimento = sc.nextFloat();

System.out.println("Digite a largura do paralelepípedo:");
float largura = sc.nextFloat();

System.out.println("Digite a altura do paralelepípedo:");
float altura = sc.nextFloat();

float volume = comprimento * largura * altura;

System.out.println("O volume do paralelepípedo é: " + volume);

sc.close();
	}

}
