/*10. Elaborar um programa que efetue a leitura de um valor que esteja entre a faixa de 1 a 9. 
 * Ap�s a leitura do valor fornecido pelo usu�rio,
 *  o programa dever� indicar uma de duas mensagens: "O valor est� na faixa permitida",
 *   caso o usu�rio forne�a o valor nesta faixa, 
 *   ou a mensagem "O valor est� fora da faixa permitida", 
 *   caso o usu�rio forne�a valores menores que 1 ou maiores que 9.*/

package tarefa06;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um n�mero:");
		int numero= sc.nextInt();
	
		if (numero>0 && numero<10) {
			
		  System.out.println("O valor est� na faixa permitida");
		
		}
		
		else {
			
			System.out.println("O valor est� fora da faixa permitida");
		
		}
		
 sc.close();
	}

}
