//4) Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem crescente.

package tarefa07;

import java.util.Scanner;

public class Exercicio04_INCOMPLETO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner (System.in);
		
     System.out.println("Digite um número");
	 int numero01 = sc.nextInt();
	 
	 System.out.println("Digite um número");
	 int numero02 = sc.nextInt();	
	 
	 System.out.println("Digite um número");
	 int numero03 = sc.nextInt();	
		
	 if (numero01==numero02 && numero01==numero03 && numero02==numero03 && numero02==numero01) {
	System.out.println("Erro /nNão possivel escreve os números em ordem, você digitou números iguais");
	 }
	 else {
			
		 if (numero01<numero02 && numero01<numero03 && numero02<numero03) {
			System.out.println(numero01+" , "+numero02+" e "+numero03);//1 , 2  e 3
		}
	
		 else if (numero01<numero02 && numero01<numero03 && numero03<numero02) {
				System.out.println(numero01+" , "+numero03+" e "+numero02);//1 , 3  e 2
		 }
		 
		 else if (numero02<numero01 && numero02<numero03 && numero01<numero03) {
				System.out.println(numero02+" , "+numero01+" e "+numero03);//2 , 1  e 3
		 }
		 
		 else if (numero02<numero01 && numero02<numero03 && numero03<numero01) {
				System.out.println(numero02+" , "+numero03+" e "+numero01);//2 , 3  e 1
		 }
		 
		 else if (numero03<numero01 && numero03<numero02 && numero01<numero02) {
				System.out.println(numero03+" , "+numero01+" e "+numero02);//3 , 1  e 2
		 }
		 
		 else if (numero03<numero01 && numero03<numero02 && numero02<numero01) {
				System.out.println(numero03+" , "+numero02+" e "+numero01);//3 , 2  e 1
		 }
	}
	sc.close();
	}

}
