package lacosCondicionais;

import java.util.Scanner;

public class LacosCondicionais1 {

	public static void main(String[] args) {
		
		// Atividade laços Condicionais.
		
		
		Scanner sc = new Scanner(System.in);
				
		int n1, n2, n3;
		
		
		System.out.println("Digite o número A: ");
		n1 = sc.nextInt();
		
		System.out.println("Digite o número B: ");
		n2 = sc.nextInt();
		
		System.out.println("Digite o número C: ");
		n3 = sc.nextInt();
		
		
		if (n1 + n2 > n3 )System.out.println("O número é maior do que " + n3 );
		
		if (n1 + n2 < n3 )System.out.println("O número é menor do que " + n3 );
		
		if (n1 + n2 == n3 )System.out.println("O número é igual " + n3 );
		
		
		
	
			
		
		
		sc.close();

	}

}
