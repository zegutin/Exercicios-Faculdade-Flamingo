/*11) Fa�a um algoritmo para ler: n�mero da conta do cliente, saldo, d�bito e cr�dito.
 * Ap�s, calcular e escrever o saldo atual (saldo atual = saldo - d�bito + cr�dito).
 * Tamb�m testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', sen�o escrever a mensagem 'Saldo Negativo'.*/

package tarefa05;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("N�mero conta do usu�rio:");
		int numeroContaUsuario = sc.nextInt();
		
		System.out.println("Digite valor do seu saldo:");
		float saldoUsuario=sc.nextFloat();

		System.out.println("Digite valor do seu d�bito:");
		float debidoUsuario=sc.nextFloat();
		
		System.out.println("Digite valor do seu cr�dito:");
		float creditoUsuario=sc.nextFloat();
		
	 float saldoAtual = saldoUsuario-debidoUsuario+creditoUsuario;
	 
	 if (saldoAtual<0) {
		
		 System.out.println("O usu�rio portador da conta: "+numeroContaUsuario);
		 System.out.println("O seu saldo atual � de: "+saldoAtual+" seu saldo est� negativo");		 
		 
	}
	 else {
	
		 System.out.println("O usu�rio portador da conta: "+numeroContaUsuario);
		 System.out.println("O seu saldo atual � de: R$"+saldoAtual+" seu saldo est� positivo");	
		 
	}
	 
		sc.close();
	}

}
