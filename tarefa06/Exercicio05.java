/*5. Efetuar a leitura de três valores (variáveis A, B e C) e efetuar o cálculo da equação completa de segundo grau, 
 * apresentando as duas raízes, se para os valores informados for possível efetuar o referido cálculo. 
 * Lembre-se de que a variável A deve ser diferente de zero.*/

package tarefa06;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite valor de A");
		int valorA = sc.nextInt();

		System.out.println("Digite valor de B");
		int valorB = sc.nextInt();

		System.out.println("Digite valor de C");
		int valorC = sc.nextInt();
if (valorA==0) {
	
	System.out.println("Não é possivel fazer a conta, valor 'A'  não pode ser 0.");

}

else {
	
int delta = (int) (Math.pow(valorB, 2) -4* valorA * valorC);
	
	float bhaskaraPositiva = (float) ((-valorB+Math.sqrt(delta))/2*valorA);
	
	float bhaskaraNegativa = (float) ((-valorB-Math.sqrt(delta))/2*valorA);
	
	        System.out.println("X¹:"+bhaskaraPositiva);
			System.out.println("X²:"+bhaskaraNegativa);
	
}
		sc.close();
	}

}
