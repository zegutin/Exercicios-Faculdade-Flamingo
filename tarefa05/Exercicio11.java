/*11) Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito.
 * Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito).
 * Também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.*/

package tarefa05;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Número conta do usuário:");
		int numeroContaUsuario = sc.nextInt();
		
		System.out.println("Digite valor do seu saldo:");
		float saldoUsuario=sc.nextFloat();

		System.out.println("Digite valor do seu débito:");
		float debidoUsuario=sc.nextFloat();
		
		System.out.println("Digite valor do seu crédito:");
		float creditoUsuario=sc.nextFloat();
		
	 float saldoAtual = saldoUsuario-debidoUsuario+creditoUsuario;
	 
	 if (saldoAtual<0) {
		
		 System.out.println("O usuário portador da conta: "+numeroContaUsuario);
		 System.out.println("O seu saldo atual é de: "+saldoAtual+" seu saldo está negativo");		 
		 
	}
	 else {
	
		 System.out.println("O usuário portador da conta: "+numeroContaUsuario);
		 System.out.println("O seu saldo atual é de: R$"+saldoAtual+" seu saldo está positivo");	
		 
	}
	 
		sc.close();
	}

}
