package Exerciciodia3;

import java.util.Scanner;
public class Exercicio5 {

	public static void main(String args[]) {
		
		
		Scanner ler = new Scanner(System.in);
		
		int num, res=0;    
		
		
		do{
			System.out.println("Digite um numero: ");
				num=ler.nextInt();
				res = res + num;
			
		}while(num!=0);
		
		
		System.out.println("A soma dos numeros digitados é: " + res);		
	}
}
