package switchCase;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// Switch Case
		
						
				Scanner sc = new Scanner(System.in);
						
				int codigo;
				int quantidade;
				int valorTotal;
								
				System.out.println("Olá, bem vindo! \n Digite um código: ");
				
				codigo = sc.nextInt();
				System.out.println("Digite a quantidade: ");		
				quantidade = sc.nextInt();
					
				
				switch (codigo) {		        					
				case 1: {System.out.println("Produto: Cachorro-quente");
		            valorTotal = quantidade * 10;
		            System.out.println("Valor total: R$" + valorTotal);
		            break;
		        }
				
		        case 2: {System.out.println("Produto: X-Salada");
		            valorTotal = quantidade * 15;
		            System.out.println("Valor total: R$" + valorTotal);
		            break;
		        }
		        
		        case 3: {System.out.println("Produto: X-Bacon");
		            valorTotal = quantidade * 18;
		            System.out.println("Valor total: R$" + valorTotal);
		            break;
		        }
		        
		        case 4: {System.out.println("Produto: Bauru");
		            valorTotal = quantidade * 12;
		            System.out.println("Valor total: R$" + valorTotal);
		            break;
		        }
		        
		        case 5: {System.out.println("Produto: Refrigerante");
		        valorTotal = quantidade * 8;
		        System.out.println("Valor total: R$" + valorTotal);
		            break;
		        }
		        
		        case 6: {System.out.println("Produto: Suco de laranja");
		            valorTotal = quantidade * 13;
		            System.out.println("Valor total: R$" + valorTotal);
		            break;
		        }
		        
		        default:
		            System.out.println("Opção inválida.");
		        }
				
				
				
				sc.close();

			}

		

	}


