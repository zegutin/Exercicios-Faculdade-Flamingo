/*12) Fa�a um algoritmo para ler: quantidade atual em estoque, quantidade m�xima em estoque e quantidade m�nima em estoque de um produto.
 *  Calcular e escrever a quantidade m�dia ((quantidadem�dia = quantidade m�xima + quantidade m�nima)/2).
 *  Se a quantidade em estoque for maior ou igual a quantidade m�dia escrever a mensagem 'N�o efetuar compra', 
 *  sen�o escrever a mensagem 'Efetuar compra'.*/

package tarefa05;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite quantidade atual estoque:");
		int quantidadeAtualEstoque = sc.nextInt();
		
		System.out.println("Digite quantidade m�xima estoque:");
		int quantidadeMaximaEstoque = sc.nextInt();
		
		System.out.println("Digite quantidade m�nima estoque:");
		int quantidadeMinimaEstoque = sc.nextInt();
		
		float quantidadeMediaEstoque = (quantidadeMaximaEstoque + quantidadeMinimaEstoque)/2;
		
		
		if (quantidadeAtualEstoque<quantidadeMediaEstoque) {
			
			System.out.println("Ser� necessaria comprar"+quantidadeMediaEstoque);
			
		}
		
		else {
			
			System.out.println("N�o ");
			
		}
		
		sc.close();
	}

}
