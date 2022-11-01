/*1) Ler quatro números inteiros e apresentar o resultado da adição e multiplicação,
 * baseando-se na utilização do conceito da propriedade distributiva. 
 * Ou seja, se forem lidas as variáveis A, B, C, e D, devem ser somadas e multiplicadas A com B, A com C e A com D. 
 * Depois B com C, B com D e por fim C com D. 
 * Perceba que será necessário efetuar seis operações de adição e seis operações de multiplicação e apresentar doze resultados de saída.*/

package tarefa04;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);

System.out.println("Digite valor de A:");
int valorA = sc.nextInt();

System.out.println("Digite valor de B:");
int valorB = sc.nextInt();

System.out.println("Digite valor de C:");
int valorC = sc.nextInt();

System.out.println("Digite valor de D:");
int valorD = sc.nextInt();

int soma1=valorA+valorB;// A + B
int soma2=valorA+valorC;// A + C
int soma3=valorA+valorD;// A + D
int soma4=valorB+valorC;// B + C
int soma5=valorB+valorD;// B + D
int soma6=valorC+valorD;// C + D

int multiplicao1=valorA*valorB;// A X B
int multiplicao2=valorA*valorC;// A X C
int multiplicao3=valorA*valorD;// A X D
int multiplicao4=valorB*valorC;// B X C
int multiplicao5=valorB*valorD;// B X D
int multiplicao6=valorC*valorD;// C X D


System.out.println("Distributiva adição");
System.out.println("\nA + B = "+soma1);

System.out.println("\nA + C = "+soma2);

System.out.println("\nA + D = "+soma3);

System.out.println("\nB + C = "+soma4);

System.out.println("\nB + D = "+soma5);

System.out.println("\nC + D = "+soma6);

System.out.println("\nDistributiva multiplicação");
System.out.println("\nA X B = "+multiplicao1);

System.out.println("\nA X C = "+multiplicao2);

System.out.println("\nA X D = "+multiplicao3);

System.out.println("\nB X C = "+multiplicao4);

System.out.println("\nB X D = "+multiplicao5);

System.out.println("\nC X D = "+multiplicao6);

sc.close();
	}

}
