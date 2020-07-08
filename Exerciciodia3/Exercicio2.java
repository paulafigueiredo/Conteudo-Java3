package Exerciciodia3;

import java.util.Scanner;
public class Exercicio2 {

	public static void main(String args[]) {
		
		
		Scanner ler = new Scanner(System.in);
		
			int numeros, impar = 0, par=0;
		
			
			for(numeros = 0; numeros < 10; numeros++){
				System.out.println("Insira um numero: ");
			  numeros = ler.nextInt();
			  
			  if(numeros%2==0){
				  
				  par++;
				  
				  
			  }else {
				  
				  impar++;
			  }
			  
		  };
		
		  System.out.println("Os numeros pares sao: " +par);
		  System.out.println("Os numeros impar sao: "+ impar);
		
		
		
		
	}
}