package aleatorio;

import java.util.Random;
import java.util.Scanner;

public class Joquempo {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int usuario;
		
		System.out.println("*******************");
		System.out.println(" J O Q U E M P O ");
		System.out.println("*******************");
		System.out.println(" 1 - Pedra" );
		System.out.println(" 2 - Papel" );
		System.out.println(" 3 - Tesoura");
		System.out.println();
		System.out.println("Qual é a sua escolha?");
		 usuario  = leitor.nextInt();
		 
		 leitor.close();
		 
		 System.out.println("Escolha do computador: ");
		 Random computador = new Random();
		 
		 int n = computador.nextInt(3) + 1;
		  
		 System.out.println(n);
		 
		if ( usuario == 1 && n == 2) {
			System.out.println("Usuário colocou: " + usuario + " = pedra e o computador colocou: " + n + " = papel");
			System.out.println("****Computador ganhou!****");
			
		}else if (usuario == 2 && n == 1){
			System.out.println("Usuário colocou: " + usuario + " = papel e o computador colocou: "  +  n + " = pedra");
			System.out.println("****Usuário ganhou!****");
			
		}else if (usuario == 1 && n == 3) {
			System.out.println("Usuário colocou: " + usuario + " = pedra e o computador colocou: "  +  n + " = tesoura");
			System.out.println("****Usuário ganhou!****");
			
		}else if (usuario == 2 && n == 3) {
			System.out.println("Usuário colocou " + usuario + " = papel e o computador colocou: " + n + "= tesoura");
			System.out.println("****Computador ganhou!****");
	   }else if( usuario ==3 && n == 2) {
		   System.out.println("Usuário colocou: " + usuario + " = tesoura e o computador colocou: "  +  n + " = papel");
			System.out.println("****Usuário ganhou!****");
		   
	   }else if (usuario == 3 && n == 1) {
		   System.out.println("Usuário colocou: " + usuario + " = tesoura e o computador colocou: "  +  n + " = pedra");
			System.out.println("****Computador ganhou!****");
		   
	   }else{
			System.out.println("****Empate****");
		}
			
		}
}

