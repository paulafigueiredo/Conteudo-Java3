package Exerciciodia3;

import java.util.Scanner;
public class Exercicio1 {
	
	public static void main(String args[]) {
	
	Scanner ler = new Scanner(System.in);
	
		int i;
	
		for(i = 1000; i < 1999;i++){
			
			if(i%11==5){
				
				System.out.println("O numero " + i+ "dividido por 11 tem o resto 5");
			}
			
		};
	
		
	
	}

}
