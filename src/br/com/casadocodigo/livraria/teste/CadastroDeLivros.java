package br.com.casadocodigo.livraria.teste;
import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

public class CadastroDeLivros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		autor.setEmail("Rodrigo.turini@caelum.com.br");
		autor.setCpf("123.456.789-00");		
		
		Livro livro = new LivroFisico(autor);
		livro.setNome("Java * Pr?tico");
		livro.setDescricao("Novos Recursos da Linguagem");
		livro.setValor(59.90);
		livro.setIsbn("978-85-66250-46-6");

		//livro.setAutor(autor);
		livro.mostrarDetalhes();
	
		Autor outroAutor = new Autor();
		outroAutor.setNome("Paulo Silveira");
		outroAutor.setEmail("paulo.silveira@caelum.com.br");
		outroAutor.setCpf("123.456.789.-10");
		
		Livro outroLivro = new LivroFisico(outroAutor);
		outroLivro.setNome("L?gica de Programa??o");
		outroLivro.setDescricao("Crie seus primeiros programas");
		outroLivro.setValor(59.90);
		outroLivro.setIsbn("85-66250-22-0");
		
		//outroLivro.setAutor(outroAutor);
		outroLivro.mostrarDetalhes();
		
		/*if (!livro.aplicaDescontoDe(0.1)) {
			System.out.println("Desconto n?o pode ser maior do que 30%");
			
		if(livro.temAutor()) { 
			System.out.println("O nome do autor do livro ? " +autor.getNome());
			System.out.println(livro.getAutor().getNome());
		}
	}*/
		
		Autor NovoAutor = new Autor();
		Ebook ebook = new Ebook(NovoAutor);
		ebook.setNome("Java 8 Pr?tico");

	}

}
