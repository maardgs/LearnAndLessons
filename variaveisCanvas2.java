package variaveiscanvasatv2;

import java.util.Locale;
import java.util.Scanner;

public class variaveisCanvas2 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float notaTotal;
		float mediaFinal;
		
		
		System.out.println("Digite a 1ª nota: ");
		nota1 = sc.nextFloat();
		
		System.out.println("Digite a 2ª nota: ");
		nota2 = sc.nextFloat();
				
		System.out.println("Digite a 3ª nota: ");
		nota3 = sc.nextFloat();
		
		System.out.println("Digite a 4ª nota: ");
		nota4 = sc.nextFloat();
				
		notaTotal = nota1 + nota2 + nota3 + nota4;
		
		mediaFinal = notaTotal/4;
		System.out.println("Média final: " + mediaFinal);
		
				
			
		
		sc.close();
		
		
		

	}

}
