
public class CarrinhoDeCompras {
	public void adiciona(Livro livro) {
		Ebook ebook = (Ebook) livro;
		ebook.getWaterMark();
		System.out.println("Adicionando: "+livro);
		livro.aplicaDescontoDe(0.05);
		

	}

	
	/*public void adiciona(Ebook livro) {
		System.out.println("Adicionando: "+livro);
	}*/

}
