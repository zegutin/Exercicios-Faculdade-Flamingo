/*12) Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e quantidade mínima em estoque de um produto.
 *  Calcular e escrever a quantidade média ((quantidademédia = quantidade máxima + quantidade mínima)/2).
 *  Se a quantidade em estoque for maior ou igual a quantidade média escrever a mensagem 'Não efetuar compra', 
 *  senão escrever a mensagem 'Efetuar compra'.*/

package tarefa05;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite quantidade atual estoque:");
		int quantidadeAtualEstoque = sc.nextInt();
		
		System.out.println("Digite quantidade máxima estoque:");
		int quantidadeMaximaEstoque = sc.nextInt();
		
		System.out.println("Digite quantidade mínima estoque:");
		int quantidadeMinimaEstoque = sc.nextInt();
		
		float quantidadeMediaEstoque = (quantidadeMaximaEstoque + quantidadeMinimaEstoque)/2;
		
		
		if (quantidadeAtualEstoque<quantidadeMediaEstoque) {
			
			System.out.println("Será necessaria comprar"+quantidadeMediaEstoque);
			
		}
		
		else {
			
			System.out.println("Não ");
			
		}
		
		sc.close();
	}

}
