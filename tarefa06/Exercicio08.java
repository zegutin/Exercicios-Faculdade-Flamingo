//Efetuar a leitura de cinco números inteiros e identificar o maior e o menor valores.

package tarefa06;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
int menorNumero= 0;
int maiorNumero= 0;
int contadora= 1;
		
		while (contadora<4) {
		
			System.out.println("Digite um número:");
	        int numero = sc.nextInt();
		if (contadora==1) {
			menorNumero=numero;
			maiorNumero=numero;
		}
		if(numero>maiorNumero) {
			maiorNumero=numero;
		}
		if(numero<menorNumero){
			menorNumero=numero;
		}
			 contadora++;
		}
		System.out.println("O número maior é "+maiorNumero+"\n número menor é "+ menorNumero);
		sc.close();
	}

}
