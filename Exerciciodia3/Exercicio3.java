package Exerciciodia3;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
	
		int idade,menor =0, maior =0;
	
	System.out.println("Informe sua idade: ");
			idade=ler.nextInt();
		
		while(idade != -99){
			
				if(idade < 21){
					menor++;
				}
				if(idade>50){
					maior++;
				}
				
				System.out.println("Informe idade: ");
				idade = ler.nextInt();
		}
		
		
			System.out.println("Menores de 20 anos: " +menor);
			System.out.println("Maiores de 50 anos: " + maior);
	
	
	
	
	
	
	
	}
}
