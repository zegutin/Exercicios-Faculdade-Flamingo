package tarefa08;

public class Exercicio10 {

	/*
	 * 10) Elaborar um programa que apresente os resultados da soma e da média
	 * aritmética dos valores pares situados na faixa numérica de 50 a 70.
	 */

	public static void main(String[]Args) {
		
	int soma = 0, media = 0, cont = 0, par = 0;	
		
		while(cont < 70) {
			if(cont % 2 ==0 ) {
				soma = cont + soma;
				par = cont;
				cont++;
			}else {
				cont++;
			}
		}
		media = soma/par;
		System.out.println("A soma dos números pares é: " + soma + " e a media é: " + media);
	}
}
