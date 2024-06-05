package variaveiscanvaatv3;

import java.util.Locale;
import java.util.Scanner;

public class CanvasOperadores {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
			
		Scanner sc = new Scanner(System.in);
		
		float salarioBruto;
		float adicionalNoturno;
		float horasExtras;
		float horasExtrasMultiplicadas;
		float descontos;
		float remuneracao;
		float salarioLiquido;
		
		System.out.println("Digite o salário bruto: ");
		salarioBruto = sc.nextFloat();
		
		System.out.println("Digite o valor do adicional noturno: ");
		adicionalNoturno = sc.nextFloat();
		
		System.out.println("Digite o valor das horas extras: ");
		horasExtras = sc.nextFloat();
		
		horasExtrasMultiplicadas = horasExtras *5;
				
		
		System.out.println("Digite o valor dos descontos: ");
		descontos = sc.nextFloat();
		
		
		remuneracao = salarioBruto + adicionalNoturno + horasExtrasMultiplicadas;
		
		salarioLiquido = remuneracao - descontos;
		
		System.out.println("O salário líquido é: "+ salarioLiquido);
		
		
		sc.close();
		
		


	}

}
