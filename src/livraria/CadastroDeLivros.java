package livraria;


public class CadastroDeLivros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Criando o objeto livro
		Livro livro = new Livro();
		
		
		//Populando o  objeto
		livro.nome = "Java 8 Prático";
		livro.descricao = "Novos recursos da linguagem";
		livro.valor = 59.90;
		livro.isbn = "978-85-66250-46-6";
		
		//Imprimindoo objeto
		livro.mostrarDetalhes();
		
		/***********      Outro Livro *************/
		
		Livro outroLivro = new Livro();
		
		outroLivro.nome = "lógica de programação";
		outroLivro.descricao = "Crie seus primeiros programas";
		outroLivro.valor = 59.90;
		outroLivro.isbn = "978-85-66250-0";
		
		outroLivro.mostrarDetalhes();

		

	}

}
