/*11. Elaborar um programa que efetue a leitura de um determinado valor inteiro, e efetue a sua
apresenta��o, caso o valor n�o seja maior que tr�s.*/

package tarefa06;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);

System.out.println("Digite um n�mero:");
int numero=sc.nextInt();

if (numero<=3) {
	System.out.println(numero);
}
else {
	System.out.println("ERRO \nN�mero "+numero+" � maior que 3");
}

sc.close();
	}

}
