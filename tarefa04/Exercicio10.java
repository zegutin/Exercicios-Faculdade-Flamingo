package tarefa04;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
System.out.println("Digite o nome do 1° eleitor");
String eleitorA= sc.nextLine();

System.out.println("Digite o nome do 2° eleitor");
String eleitorB= sc.nextLine();

System.out.println("Digite o nome do 3° eleitor");
String eleitorC= sc.nextLine();


System.out.println("Digite a quantidade de votos do "+eleitorA);
float votosEleitorA=sc.nextFloat();

System.out.println("Digite a quantidade de votos do "+eleitorB);
float votosEleitorB=sc.nextFloat();

System.out.println("Digite a quantidade de votos do "+eleitorC);
float votosEleitorC=sc.nextFloat();

System.out.println("Digite a quantidade de votos nulos");
float votosNulos=sc.nextFloat();

System.out.println("Digite a quantidade de votos brancos");
float votosBrancos=sc.nextFloat();


float totalVotosEleitores=votosEleitorA+votosEleitorB+votosEleitorC+votosBrancos+votosNulos;


System.out.println("Foram feitos "+totalVotosEleitores+" no total");

System.out.println("Tivemos "+votosBrancos+ " votos brancos");

System.out.println("Tivemos "+votosNulos+ " votos nulos");

float porcetageVotoBrancos=(totalVotosEleitores*votosBrancos)/100;
System.out.println("Porcentagem de votos nulos: "+porcetageVotoBrancos+"%");

float porcetageVotoNulos=(totalVotosEleitores*votosNulos)/100;
System.out.println("Porcentagem de votos brancos: "+porcetageVotoNulos+"%");

float porcetagemVotosEleitorA=(totalVotosEleitores*votosEleitorA)/100;
System.out.println("Porcetagem de votos do "+eleitorA+" foi de " +porcetagemVotosEleitorA+"%");

float porcetagemVotosEleitorB=(totalVotosEleitores*votosEleitorB)/100;
System.out.println("Porcetagem de votos do "+eleitorB+" foi de " +porcetagemVotosEleitorB+"%");


float porcetagemVotosEleitorC=(totalVotosEleitores*votosEleitorC)/100;
System.out.println("Porcetagem de votos do "+eleitorC+" foi de " +porcetagemVotosEleitorC+"%");

 sc.close();
	}

}
