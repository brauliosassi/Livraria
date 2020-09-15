package br.com.casadocodigo.livraria.teste;
import br.com.casadocodigo.livraria.produtos.Produto;

public class CarrinhoDeCompras {
	
	private double total;
	private Produto[] produtos = new Produto[10];
	private int contador = 0;
	
	public void adiciona(Produto produto) {
		System.out.println("Adicionando: "+produto);
		this.produtos[contador] = produto;
		contador ++;
		this.total += produto.getValor(); 
	}	
	
	public double getTotal() {
		return total;
	}
		/*Ebook ebook = (Ebook) ebook;
		ebook.getWaterMark();*/

	public Produto[] getProdutos() {
		return null;
	}
		
	//	System.out.println("Adicionando: "+livro);
		
		//livro.aplicaDescontoDe(0.05);
		
	/*public void adiciona(Revista revista) {
		System.out.println("Adicionando: "+revista);
		revista.aplicaDescontoDe(0.05);
		//total += revista.getValor();
	}*/

	/*public void adiciona(Ebook livro){
		System.out.println("Adicionando: "+livro);
	}*/

}
