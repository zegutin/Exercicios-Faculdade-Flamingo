//6. Efetuar a leitura de três valores (variáveis A, B e C) e apresentá-los dispostos em ordem crescente.

package tarefa06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite valor de A:");
		int valorA=sc.nextInt();
		
		System.out.println("Digite valor de B:");
		int valorB=sc.nextInt();
		
		System.out.println("Digite valor de C:");
		int valorC=sc.nextInt();
		
		if (valorA<valorB && valorA<valorC && valorB<valorC) { 
			
			System.out.println(valorA+", "+ valorB +" e "+valorC); //A , B , C
			
		}
		
		else if (valorA<valorC && valorA<valorB && valorC<valorB) { 
			
			System.out.println(valorA+", "+ valorC +" e "+valorB); //A , C , B
			
		}
		
		else if (valorB<valorA && valorB<valorC && valorA<valorC) {
			
			System.out.println(valorB+", "+ valorA +" e "+ valorC); //B , A e C
			
		}
		
		else if (valorB<valorC && valorB<valorA && valorC<valorA) { 
			
			System.out.println(valorB+", "+ valorC +" e "+ valorA); //B , C e A
			
		}
		
		else if (valorC<valorA && valorC<valorB && valorA<valorB) { 
			
			System.out.println(valorC+", "+ valorA +" e "+ valorB); //C , A e B
			
		}
		
		else {
			
			System.out.println(valorC+ ", "+ valorB +" e "+ valorA); //C , B e A
			
		}
		
		sc.close();
	}

}
