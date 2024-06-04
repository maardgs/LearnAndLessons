package variaveis;

import java.util.Locale;
import java.util.Scanner;

public class VariaveisCanvas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); // ctrl + shift + o
		
		float salario;
		float abono;
		float novoSalario;
		
		System.out.println("Digite seu salário: " ); // ctrl + espaço;
		salario = sc.nextFloat();
		
		System.out.println("Digite seu abono: ");
		abono = sc.nextFloat();
		
		novoSalario = salario + abono;
		System.out.printf("Seu novo salário é: %.3f" , novoSalario );
		
		
		
		
			
		
		
		sc.close();
				

	}

}
