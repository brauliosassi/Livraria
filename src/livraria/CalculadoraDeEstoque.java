package livraria;

public class CalculadoraDeEstoque {
	
	public static void main(String[] args) {
		
		/* Operadores L�gicos
		 * && = and
		 * || = or
		 * ! = nega��o
		 */
		
		//Usando for com break ou continue
		double soma = 0;
		for(int i = 0; i < 35; i ++) {
			if (i == 7) {
				//break;
				//continue;
			}
			soma += 59.90;
		}
		
		/*
		 * C�digo Inicial Simples
		double livroJava8 = 59.90;
		double livroTDD = 59.90; 
		double soma = livroJava8 + livroTDD;
		 * 
		 */
		/*
		 * Usando o While
		double soma = 0;
		int contador = 0;
		while (contador < 35) {
			double valorDoLivro = 59.90;
			soma += valorDoLivro;
			contador ++;
					
		}
		*/
		
		// Operador Ten�rio 
		//double valor = v1 > v2 ? 100 : 0; 
		
		System.out.println("O total em estoque �  "+soma);
		
		if(soma < 150) {
			System.out.println("Seu estoque est� muito baixo!");
		}else if(soma >= 2000) {
			System.out.println("Seu estoque est� alto!");
		}else {
		
		System.out.println("Seu estoque est� bom!");
		}
		
	}

}
