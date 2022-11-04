/*11. Elaborar um programa que efetue a leitura de um determinado valor inteiro, e efetue a sua
apresentação, caso o valor não seja maior que três.*/

package tarefa06;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);

System.out.println("Digite um número:");
int numero=sc.nextInt();

if (numero<=3) {
	System.out.println(numero);
}
else {
	System.out.println("ERRO \nNúmero "+numero+" é maior que 3");
}

sc.close();
	}

}
