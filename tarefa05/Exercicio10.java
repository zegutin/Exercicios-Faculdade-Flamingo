/*10) Ler o sal�rio fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. 
 *Sabendo-se que ele recebe uma comiss�o de 3% sobre o total das vendas at� R$ 1.500,00 
 *mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu sal�rio total.*/

package tarefa05;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do seu sal�rio fixo:");
		float salarioFixo = sc.nextFloat();
        
		System.out.println("Digite o valor da suas vendas:");
        float salarioVendas = sc.nextFloat();
        
        if (salarioVendas<=1500) {
        	
        	float valorSalarioPorcetagem3 = salarioFixo+(3*salarioVendas/100);
        	
        	System.out.println("Seu novo sal�rio �: R$"+valorSalarioPorcetagem3);
        	
		}
     
        else {
        	
        	float valorSalarioPorcetagem5 = salarioFixo + (5*salarioVendas/100);
        	
        	System.out.println("Seu novo sal�rio �: R$" + valorSalarioPorcetagem5);
        	
		}   
       
		
		sc.close();
	}

}
